'use strict'

//if

var edad = 18;
var nombre = "Juan";

/* 
Mayor: <
Menor: >
Mayor o igual: <=
Menor o igual: >=
Igual: ==
Distinto: !=
*/

if(edad > 18){
   
    alert(nombre + " tiene "+ edad +" años, es mayor de edad")
   
    if (edad <= 33) {
        alert("todavia eres millenial")
    }else if (edad >=70) {
        alert("eres anciano")
    }else{
        alert("ya no eres millenial")
    }

}else{
    alert(nombre + " tiene "+ edad +" años, es menor de edad")
}

//OPERADORES LOGICOS
/* 
and: &
or: ||
negación: !
*/

year=2020;

//and
if (year >= 2000 && year <= 2020) {
    console.log("estamos en la era actual")
} else {
    console.log("estamos en la era post moderna")
}

//or
if (year == 2008 || year >= 2018 && year == 2028) {
    console.log("el año termina en 8")
} else {
    console.log("año no registrado")
}