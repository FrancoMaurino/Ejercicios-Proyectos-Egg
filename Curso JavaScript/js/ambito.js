'use strict'

function holaMundo(texto){    
    var hola_mundo = "texto dentro de la funcion";
    console.log(texto);
    //si se puede llamar una variable de afuera de la funcion desde dentro
    console.log(num);
    console.log(hola_mundo);
}

var num =12;
var texto="hola soy una variable global";
holaMundo(texto);
//no se puede llamar una variable dentro de una funcion
console.log(hola_mundo);

