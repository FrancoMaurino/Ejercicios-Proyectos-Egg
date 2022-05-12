'use strict'

//funciones anonimas
//es una funcion que no tiene nombre

var pelicula = function(nombre){
    return "la pelicula es: "+ nombre;
}


function sumame (num1,num2, sumaYMuestra, sumaPorDos){
    var sumar = num1 + num2;
    sumaYMuestra(sumar);
    sumaPorDos(sumar);
    return sumar;
}
//se puede poner una "flecha" sacar los parentesis y la palabra function
sumame(5,7, dato =>{
    console.log("la suma es: ", dato);
},
function(dato){
    console.log("la suma por dos es: ", (dato*2));
});


