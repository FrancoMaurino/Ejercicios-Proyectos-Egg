'use strict'


/* mostrar la media y la suma de los numeros introducidos por el
usuario hasta ingresar un numero negativo */

var suma = 0;
var contador = 0;

do {
    var numero = parseInt(prompt("introduce un numero hasta que ingreses un negativo", 0))

    if (isNaN(numero)) {
        numero=0

    }else if(numero>= 0 ){
        
        suma += numero; // = suma = suma + numero;
        
        contador++;
    }

} while (numero > 0); 

alert("la suma es " + suma);
alert("el promedio de todos los numeros es " +(suma/contador));