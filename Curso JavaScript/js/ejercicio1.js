'use strict'

/* programa que pida dos numeros y que nos diga
 cual es el mayor, el menor y si son iguales 
 si los numeros no son numeros o son menores o iguales a 0 
 nos lo vuelva a pedir*/

 var num1 = parseInt(prompt("introduce el primer numero", 0));
 var num2 = parseInt(prompt("introduce el segundo numero", 0));

 while (num1 <= 0 || num2 <= 0 || isNaN(num1) || isNaN(num2)) {
    num1 = parseInt(prompt("introduce el primer numero", 0));
    num2 = parseInt(prompt("introduce el segundo numero", 0));
 }

if (num1 == num2) {
    alert("los numeros son iguales");
} else if(num1 > num2) {
    alert("el numero mayor es : " + num1);
    alert("el numero menor es : " + num2);
} else if (num2 > num1){
    alert("el numero mayor es : " + num2);
    alert("el numero menor es : " + num1);
}else{
    alert("introduce numeros correctos");
}

