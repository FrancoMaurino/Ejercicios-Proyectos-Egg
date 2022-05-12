'use strict'

//tabla de multiplicar de un numero introducido por pantalla

var num = parseInt(prompt("ingrese un numero", 1));

document.write("<h1>Tabla del " +num +"<h1/>" );
for(var i =0 ; i<= 10; i++){
    document.write(i+" x "+num+ " = " + (i*num)+ "<br/>" );
}

//todas las tablas

for(var c=1;c<=10;c++){
document.write("<h1>Tabla del "+c+"<h1/>");
    for(var i =0 ; i<= 10; i++){
        document.write(i+" x "+c+ " = " + (c*i)+ "<br/>" );
    }
}