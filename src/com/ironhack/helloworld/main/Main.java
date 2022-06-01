package com.ironhack.helloworld.main;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Goodbye world!");
        System.out.println(productFormatter(" Esto es un nombre ", "  31/05/2022  "));

        /*
        ----TIPOS DE DATOS----
         --Primitivos--
            int, boolean, double, char, float, byte, short, long
         --Wrappers-- (envuelve tipo de dato primitivo): extiende las capacidades de los tipos
            de datos utilizando una clase.
            Integer por ejemplo, s un entero con algunos metodos que nos va a facilitar la vida.
            Pero lo tomaremos como un int (ver ejemplo abajo).
            Integer, Long, Boolean, Double, etc
        --Classes--
            String, Date, Calendar, Math
        */

        int x = 10;
        Integer y = 10;
        System.out.println(x+y);
        System.out.println(x);
        System.out.println(y);
        // Si ponemos un punto después de x o y, vemos que las funcionalidades son distintas. Con y, que es in Integer
        // puedo hacer más cosas.

        // VEAMOS QUE PASA CON double y float

        double d = 1.1;
        // Escribo tipo de dato, una variable d cualquiera y le asigno un numero. Está OK
        // float f = 1.2;
        // Con float no puedo, me da error. Como tiene un decimal, me dice que lo convierta a double ya que ocupa menos.
        // ¿Cómo se corrige? Casting it to float.
        float f = (float )1.2; // definiendo antes del número
        // float f = 1.2f;  o poniendole la f o F al lado derecho del número

        /*
        ----OPERADORES BÁSICOS----
         - Suma +
         - Resta -
         - Multiplicación *
         - División /
         - Módulo %
        */

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        // Para el exponencial tenemos una libreria que se llama Math que tiene pow:
        System.out.println(Math.pow(10, 2)); //10 es la base y el 2 para decir al cuadrado
        // Para raiz cuadrada
        System.out.println(10);

        // ----CONDICIONALES----

        if (x>10){
            System.out.println("x es mayor a 10");
        }else {
            System.out.println("x es menor o igual a 10");
        }

        // Usando el else if

        if (x>10){
            System.out.println("x es mayor a 10");
        }else if (x == 10){
            System.out.println("x igual a 10");
        }else {
            System.out.println("x es menor a 10");
        }

        // ----SWITCH---- lo usamos cuando queremos evaluar una expresión

        int day = 1;
        switch(day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default: // es el equvalente al else
                System.out.println("Fin de semana");
                break;

            // envés de default podemos poner también que en caso de ser 6 o 7, ponga weekend:
            // case 6:
            // case 7:
            // System.out.println("Fin de semana");
            // break;
        }


        // AND se escribe &&
        // OR se escribe ||

        // ----OPERADORES TERNARIOS----
        // Sintaxis:
        // <condición> ? <expr 1> : <expr 2>;
        /* Es como las condiciones que estabamos haciendo de if y else, pero lo reducimos
        todo a una línea.
        Ponemos una condición, que es lo que se tiene que cumplir, le preguntamos si eso es verdad.
        En caso de ser verdadero, nos lanza la expr 1 y en caso contrario la expre 2.

        -- Explicación profe--

        Los operadores ternarios son opradores que tienen tres fases, cond, expr 1 y 2.
        Por ejemplo, quiero evaluar con un op ternario si el día es de semana, que me coloque weekday
        y en caso contrario, weekday.
         */

        String result = "";

       result = (day > 5 && day < 6) ? "Weekday" : "Weekend";
        System.out.println(result);

        System.out.println(result = day > 5 && day < 6 ? "Weekday" : "Weekend");

        // ----STREAM METHODS----

        String message = "Hello World";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.charAt(0)); //Trae la letra que está en el índice
        System.out.println(message.toUpperCase().charAt(1));

        // EJERCICIO DE CLASE --PROFESOR WAY--
        String productName = "    this is an awesome product   ";
        String publishDate = "   31/05/2022  ";
        String productFormatted = productFormatter(productName, publishDate);


        // ---- BUCLES ----

        // Creamos un Array
        String[] names = {"Alba", "Rocío", "Vedrana", "Blanca"};

        System.out.println("=== FOR === ");
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("=== WHILE === ");
        int i=0;
        while(i< names.length){
            System.out.println(names[i]);
            i++;
        }

        /* Diferencia entre i++ y ++i (++i no muy usado, 99% del tiempo se usa i++):
        En Java, los operadores ++i e i++ se conocen como operadores de incremento.
        El ++i se conoce como el operador de preincremento, mientras que el operador i++
        se conoce como el operador de posincremento. Como su nombre lo indica, el operador de incremento posterior
        incrementa la variable después de ser utilizado, y el operador de incremento previo incrementa
        la variable antes de ser utilizado. Estos también son operadores unarios. */

        System.out.println("=== DO WHILE === ");
        i=0;
        do {
            System.out.println(names[i++]);
        } while (i< names.length);

        System.out.println("=== FOREACH ===");
        for(String name: names) {
            System.out.println(name);
        }

        System.out.println("=== STREAM ===");
        Arrays.stream(names).forEach(System.out::println);
        Arrays.stream(names).forEach(name -> System.out.println(name));

    }

/* Ejercicio de clase
    private static String productFormatter(String name, String date) {
        return name.trim().replace(" ", "_").toUpperCase() + date.trim();
    }
*/

// Ejercicio de clase --PROFESOR WAY--
    private static String productFormatter(String productName, String publishDate) {
        String name = productName.trim();
        String date = publishDate.trim();
        return (name + date).toUpperCase().replace(" ", "_");

        // 0 también
        // return (productName.trim() + "_" + publishDate.trim()).toUpperCase().replace(" ", "_");
        // O con concat sin usar operadores
        // return (productName.trim().concat( "_").concat(publishDate.trim())).toUpperCase().replace(" ", "_");


    }

}









