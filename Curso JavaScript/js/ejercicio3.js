'use strict'

/* Hacher un programa que muestre todos los numeros entre dos numeros */

var num1 = parseInt(prompt("Ingrese el primer numero"));
var num2 = parseInt(prompt("Ingrese el segundo numero"));

document.write("<h1>de "+ num1+" a "+num2+ " estan estos numeros:</h1>");
for (var i = num1; i <= num2 ; i++){
    document.write(i+"<br/>");
}