'use strict'

//funciones

function porConsola (num1,num2){
    console.log("Suma: "+(num1+num2));
    console.log("Resta: "+(num1-num2));
    console.log("Multiplicacion: "+(num1*num2));
    console.log("Division: "+(num1/num2));
    console.log("*************");
}

function porPantalla (num1,num2){
    document.write("Suma: "+(num1+num2)+"</br>");
    document.write("Resta: "+(num1-num2)+"</br>");
    document.write("Multiplicacion: "+(num1*num2)+"</br>");
    document.write("Division: "+(num1/num2)+"</br>");
    document.write("*************");
}

function calculadora(num1, num2, mostrar=false){
   
   if (!mostrar) {
       porConsola(num1,num2);
   }else{
       porPantalla(num1,num2);
        return true;
   }    
}
console.log(calculadora(2,6,true));


