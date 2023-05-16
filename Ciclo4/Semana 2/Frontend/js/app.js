const app= Vue.createApp({
    data(){
        return {
            menu:"",
        }
    },
    methods:{
        
    }

});
app.component("registrar-usuario",{
    data(){
        return {
            documento:"",
            nombre:"",
            apellido:"",
            telefono:"",
            correo:"",
            direccion:"",
        };
    },
    template:`
    <div>
    <h3>REGISTRAR USUARIO</h3>
        <form v-on:submit.prevent="guardarUsuario">
            <table>
                <tr>
                    <td>Documento</td>
                    <td><input type="text" v-model="documento"/></td>
                </tr>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" v-model="nombre"/></td>
                </tr>
                <tr>
                    <td>Apellido</td>
                    <td><input type="text" v-model="apellido"/></td>
                </tr>
                <tr>
                    <td>Telefono</td>
                    <td><input type="tel" v-model="telefono"/></td>
                </tr>
                <tr>
                    <td>Correo</td>
                    <td><input type="email" v-model="correo"/></td>
                </tr>
                <tr>
                    <td>Direccion</td>
                    <td><input type="text" v-model="direccion"/></td>
                </tr>
            </table>
            <input class="btn btn-primary" type="submit" value="Guardar Usuario"/>
        </form>
    <div>
    `,
    methods:{
        guardarUsuario(){
            const endpoint="http://localhost:8080/usuario/guardar";
            const opciones={
                method:"POST",
                headers:{'Content-Type':'application/json'},
                body: JSON.stringify({  
                    documento:this.documento,
                    nombre:this.nombre,
                    apellido:this.apellido,
                    telefono:this.telefono,
                    correo:this.correo,
                    direccion:this.direccion
                })
            };

            fetch(endpoint,opciones).then(async response=>{
                Swal.fire({
                    position: 'top-end',
                    icon: 'success',
                    title: 'Usuario Guardado',
                    showConfirmButton: false,
                    timer: 2500
                });

                this.documento="";
                this.nombre="";
                this.apellido="";
                this.telefono="";
                this.correo="";
                this.direccion="";
                this.verUsuarios();
            })
        }
    }
});
app.component("ver-usuario",{

    data(){
        return{
            usuarios:[], 
            apellidoBuscar:"",
            nombreBuscar:"",
            correoBuscar:""
        };
    },
    template:
    `
    <div>
    <h3>USUARIO REGISTRADOS</h3>
        <hr>
        <input class="btn btn-primary" value="VER USUARIOS" v-on:click="verUsuarios">
        <hr>
        FILTROS
        <label>Nombre</label><input type="text" v-model="nombreBuscar" />
        <input type="button" class="btn btn-primary" value="BUSCAR" v-on:click="buscarXnombre">
        <table class="table">
        <label>Apellido</label><input type="text" v-model="apellidoBuscar" />
        <input type="button" class="btn btn-primary" value="BUSCAR" v-on:click="buscarXapellido">
        <table class="table">
        <label>Correo</label><input type="text" v-model="correoBuscar" />
        <input type="button" class="btn btn-primary" value="BUSCAR" v-on:click="buscarXcorreo">
        <table class="table">
            <thead>
                <th>Documento</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Telefono</th>
                <th>Correo</th>
                <th>Direccion</th>
            </thead>
            <tbody>
                <tr v-for="usuario in usuarios">
                    <td>{{usuario.documento}}</td>
                    <td>{{usuario.nombre}}</td>
                    <td>{{usuario.apellido}}</td>
                    <td>{{usuario.telefono}}</td>
                    <td>{{usuario.correo}}</td>
                    <td>{{usuario.direccion}}</td>
                </tr>
            </tbody>
        </table>
    <div>
    `,
    methods:{
        verUsuarios(){
            const endpoint="http://localhost:8080/usuario/consultar";
            const opciones={method:"GET"}

            fetch(endpoint,opciones).then(async response=>{
                this.usuarios=await response.json();
            });
        },
        buscarXapellido(){
            const endpoint="http://localhost:8080/usuario/filtrarxapellido/" + this.apellidoBuscar;
            const opciones={method:"GET"};

            fetch(endpoint,opciones).then(async response=>{
                this.usuarios=await response.json();  
            });
        },

        buscarXnombre(){
            const endpoint="http://localhost:8080/usuario/filtrarxnombre/" + this.nombreBuscar;
            const opciones={method:"GET"};

            fetch(endpoint,opciones).then(async response=>{
                this.usuarios=await response.json();  
            });
        },

        buscarXcorreo(){
            const endpoint="http://localhost:8080/usuario/filtrarxcorreo/" + this.correoBuscar;
            const opciones={method:"GET"};

            fetch(endpoint,opciones).then(async response=>{
                this.usuarios=await response.json();  
            });
        }
    }

});
app.component("consultar-usuario",{
    data(){
        return {
            buscaDoc:"",
            usuario:{}
        }
    },
    template: `
    <div>
    <h3>CONSULTAR USUARIO</h3>
    <label>Nro de Documento</label><input type="text" v-model="buscaDoc">
    <input class="btn btn-primary" type="button" value="BUSCAR" v-on:click="buscarXdocumento">
    <p>
        Documento: {{usuario.documento}}<br>
        Nombres: {{usuario.nombre}}<br>
        Apellidos: {{usuario.apellido}}<br>
        Telefono: {{usuario.telefono}}<br>
        Correo: {{usuario.correo}}<br>
        Direccion: {{usuario.direccion}}
    </p>
    <div>
    `,
    methods:{
        buscarXdocumento(){
            const endpoint="http://localhost:8080/usuario/consultardocumento/" +this.buscaDoc;
            const opciones={method:"GET"};

            fetch(endpoint,opciones).then(async response=>{
                this.usuario=await response.json();
            });
        },
    }
});
app.component("eliminar-usuario",{
    data(){
        return{
            documentoBorrar:"",
        }
    },
    template:`
    <div>
    <h3>ELIMINAR USUARIO</h3>
        <label>Nro de Documento</label><input type="text" v-model="documentoBorrar">
        <input type="button" class="btn btn-danger" value="ELIMINAR" v-on:click="eliminarUsuario">
    <div>
    `
    ,
    methods:{
        eliminarUsuario(){
            const endpoint="http://localhost:8080/usuario/eliminar/" + this.documentoBorrar;
            const opciones={method:"DELETE"};

            fetch(endpoint,opciones).then(async response=>{
                var respuesta=await response.json();
                if(respuesta){
                    Swal.fire({
                        position: 'top-end',
                        icon: 'success',
                        title: 'Usuario Eliminado',
                        showConfirmButton: false,
                        timer: 2500
                      });
                }
                else{
                    Swal.fire({
                        position: 'top-end',
                        icon: 'error',
                        title: 'Usuario no encontrado',
                        showConfirmButton: false,
                        timer: 2500
                      });
                }
            });
        },
    }
});
app.mount("#aplicacion");