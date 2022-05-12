'use strict'

/*Hacer un programa que nos diga si un numero es par o impar
1_Ventana prompt
2_Si no es valido que nos pida de nuevo el numero
*/

var num = parseInt(prompt("Ingrese un numero",0));

while (isNaN(num)) {
    var num = parseInt(prompt("Ingrese un numero",0));   
}

if (num%2==0) {
    alert("Es un numero par");
}else{
    alert("No es un numero par");
}

