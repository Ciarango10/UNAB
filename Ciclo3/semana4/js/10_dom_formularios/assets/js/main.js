const mostrarValores = () => {
    let formulario = document.forms['formulario'];
    let nombres = formulario['nombres'].value;
    let apellidos = formulario['apellidos'].value;
    let correo = formulario['correo'].value;

    let texto = nombres + '<br/>' + apellidos + '<br/>' + correo;
    document.getElementById('informacion').innerHTML = texto;
}

const mostrarValores2 = () => {
    const nombres = document.getElementById('nombres').value;
    const apellidos = document.getElementById('apellidos').value;
    const correo = document.getElementById('correo').value;

    let texto = nombres + '<br/>' + apellidos + '<br/>' + correo;
    document.getElementById('informacion').innerHTML = texto;
}

const focus = () => {
    document.getElementById('nombres').focus();
}