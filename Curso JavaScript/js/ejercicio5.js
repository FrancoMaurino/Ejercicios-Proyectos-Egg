'use strict'

/*muestre todos los numeros divisores de un numero
 introducido en un prompt */

 var num = parseInt(prompt("Ingrese un numero",1));

 for(var i=1 ;i<=num;i++){
    if (num %i == 0) {
        console.log("divisor: "+ i)
    }    
 }