const app=Vue.createApp({
    data(){
        return{
            nombre:"",
            edad:1,
            id:"",
            nombre:"",
            apellido:"",
            correo:"",
            navegadorWeb:"",
            navegadores:["Firefox"],
            usuarios:[]
        }
    }, 

    methods:{
        incrementar(){
            this.edad=this.edad+1;
        },
        decrementar(){
            this.edad=this.edad-1;
        }, 
        agregarNavegador(){
            this.navegadores.push(this.navegadorWeb);
            this.navegadorWeb="";
        },
        agregarUsuario(){
            this.usuarios.push({
                id:this.id,
                nombre:this.nombre,
                apellido:this.apellido,
                correo:this.correo   
            });
            this.id="";
            this.nombre="";
            this.apellido="";
            this.correo="";
        },
        cargaUsuarios(){
            var endpoint = "http://localhost:8080/usuario/consultar";
            var opciones = {method:"GET"};

            fetch(endpoint,opciones).then(async response=>{
                this.usuarios=await response.json();
                console.log(this.usuarios);
            })
        }
    }
});
app.mount("#aplicacion");