'use strict'

/* calculadora que pida dos numeros 
si ponemos mal un numero nos vuelva a pedir
en el body de la pagina en un alert y la consola el resultado 
de suma resta multiplicacion y division */

var num1 = parseInt(prompt("introduce el primer numero",0));
var num2 = parseInt(prompt("introduce el segundo numero",0));

while (num1<0 || num2<0 || isNaN(num1) || isNaN(num2)) {
    num1 = parseInt(prompt("introduce el primer numero",0));
    num2 = parseInt(prompt("introduce el segundo numero",0));
}

var resultado = "la suma es: " + (num1+num2)+"<br/>" +
                "la resta es: "+ (num1-num2)+"<br/>" +
                "la multiplicacion es: "+ (num1+num2)+"<br/>"+
                "la division es: "+ (num1/num2)+ "<br/>";

var resultadoCMD = "la suma es: " + (num1+num2)+ "\n"+
                   "la resta es: "+ (num1-num2)+ "\n"+
                   "la multiplicacion es: "+ (num1+num2)+ "\n"+
                   "la division es: "+ (num1/num2)+ "\n";                

document.write(resultado);       
alert(resultadoCMD);
