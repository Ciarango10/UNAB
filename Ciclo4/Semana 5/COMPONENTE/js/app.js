const app= Vue.createApp({});
app.component("boton-contador",{
    data(){
        return {
            contador:0
        };
    },
    methods:{},
    template:`
    <button v-on:click="contador=contador+1">Valor del Contador: {{contador}}</button>
    ` 
});
app.mount("#app");