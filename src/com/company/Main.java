package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Hasta ahora, a la funcion Scanner la llamaba escaner, pero por tener mas claro lo que era, ahora que ya lo tengo, voy a usar sc para abreviar
        System.out.println("Introduce un numero entre 0 y 9999 para abrir el menu: " + "\n");

        int numero = sc.nextInt();

        if (numero < 0 && numero >9999) {

            System.out.println("Has introducido un numero fuera del rango 0-9999");


        } else {

            System.out.println("1. Realiza la tarea del ejercicio 10");
            System.out.println("2. Realiza la tarea del ejercicio 11");
            System.out.println("3. Realiza la tarea del ejercicio 12");

        }

        int opcion = sc.nextInt();

        // Y dependiendo de la opcion introducida mediante if primeramente compruebo que el digito introducido
        // es una opción correcta, y en caso de que no lo sea imprimo el aviso "Has introducido una opción que no existe"

        switch (opcion) {
            case 1: realizaEjercicio10();
                break;
            case 2: realizaEjercicio11();
                break;
            case 3: realizaEjercicio12();
                break;
            case 4: if (numero < 1 || numero > 4) {
                    System.out.println("Has introducido una opción que no existe");
                }
                // Pero si la opcion es correcta, con else if dependiendo de si el numero es 1 o 2 o 3 o 4, inicia los ejercicios 5,6,7,8 respectivamente

                break;
        }


    }



    public static void realizaEjercicio10 () {

        Scanner escaner = new Scanner(System.in);
        System.out.println("EJERCICIO 10"+"\n");
        System.out.println("Introduce un numero entre 0 y 9.999");
        int numero = escaner.nextInt();
        escaner.close();
        //Cuando he ido a hacerlo, directamente puse lo que hicimos en la tarea 1,

        // int numero = 12;
        // System.out.println(numero.length()); pero me ha dado error y directamente he pensado, claro el lenght es valido con la cadena String
        // Por tanto, he buscado en google como convertir caracteres numericos enteros a cadena y lo he hecho con:

        String numeroIntroducido = Integer.toString(numero);

        // Ahora mediante if y el caracter || (El simbolo || se obtiene pulsando alt + !)

        // Si el numero es menor de 0 o mayor de 9999, nos imprime el mensaje de que esta fuera del rango
        if (numero<0||numero>9999) {
            System.out.println("El número que has introducido esta fuera del rango (0-9,999)");
        }
        // Si el numero esta entre 0 y 9999 (ambos incluidos), nos dirá el numero de cifras que tienes el numero, mediante el length ya que ahora
        // si lo podemos usar al haber convertido el entero en cadena string

        else if (numero>=0||numero<=9999) {
            System.out.println("Has introducido el número " + numero + " y tiene " + numeroIntroducido.length() + " cifras ");
        }


    }

    public static void realizaEjercicio11 () {

        Scanner escaner = new Scanner(System.in);
        System.out.println("EJERCICIO 11"+"\n");
        System.out.println("Introduce un numero entre 0 y 9999");
        int numero = escaner.nextInt();
        escaner.close();

        //En primer lugar con un primer if le digo que si el numero introducido noe sta en el rango de 0-9999, pues que imprimar el aviso
        if (numero < 0 || numero > 9999) {
            System.out.println("El numero introducido esta fuera del rango 0-9999");
        }

        // En caso de introducir un numero que esta dentro del rango hacemos lo siguiente
        //Para numeros de 4 cifras, por ejemplo 1234:

        else if (numero > 999) {

            int a = numero / 10;  // int a = 1234 / 10 = 123 ya que al tenerlo dentro de un int, el numero es sin decimales
            int b = a / 10;  // int b = 123 / 10 = 12
            int c = b / 10;  // int c = 12 / 10 = 1

            //Ahora extraemos digitos

            int d = numero % 10;  //Con este codigo, lo que hacemos es extraer a un numero su ultimo digito por tanto para 1234, nos queda un 4
            int e = a % 10; //Con este codigo, a=123 por tanto, nos queda un 3
            int f = b % 10; //Con este codigo, b=12 por tanto, nos queda un 2
            int g = c % 10; //Con este codigo, c=1 por tanto, nos queda un 1

            System.out.println("El numero al revés es " + d + e + f + g);

        }

        //Para numeros de 3 cifras, por ejemplo 123, empleo el mismo planteamento que para cuatro cifras:


        else if (numero > 99) {
            int a = numero / 10;
            int b = a / 10;

            //Ahora extraigo digitos

            int c = numero % 10;
            int d = a % 10;
            int e = b % 10;

            System.out.println("El numero al revés es " + c + d + e);

        }

        //y por ultimo para numeros de 2 cifras, por ejemplo 12, empleo el mismo planteamento que para cuatro cifras:

        else if (numero > 9) {
            int a = numero / 10;

            //Ahora extraigo digitos

            int b = numero % 10;
            int c = a % 10;


            System.out.println("El numero al revés es " + b + c);


        }
    }

                public static void realizaEjercicio12 () {


                Scanner escaner = new Scanner(System.in);
                    System.out.println("EJERCICIO 12"+"\n");
                System.out.println("Introduce un numero entre 0 y 9999");
                int numero = escaner.nextInt();
                escaner.close();

                //En primer lugar con un primer if le digo que si el numero introducido noe sta en el rango de 0-9999, pues que imprimar el aviso
                if (numero<0||numero>9999) {
                    System.out.println("El numero introducido esta fuera del rango 0-9999");
                }

                // En caso de introducir un numero que esta dentro del rango hacemos lo siguiente
                //Para numeros de 4 cifras, por ejemplo 1234:

                else if (numero > 999){

                    int a = numero /10;  // int a = 1234 / 10 = 123 ya que al tenerlo dentro de un int, el numero es sin decimales
                    int b = a /10;  // int b = 123 / 10 = 12
                    int c = b/10;  // int c = 12 / 10 = 1

                    //Ahora extraemos digitos

                    int d= numero % 10;  //Con este codigo, lo que hacemos es extraer a un numero su ultimo digito por tanto para 1234, nos queda un 4
                    int e= a % 10; //Con este codigo, a=123 por tanto, nos queda un 3
                    int f= b % 10; //Con este codigo, b=12 por tanto, nos queda un 2
                    int g= c % 10; //Con este codigo, c=1 por tanto, nos queda un 1

                    // Ahora lo que hacemos es comparar el primer digito con el ultimo

                    if (g==d){

                        System.out.println("El numero " + numero + " es capicúa");
                    }

                    else {
                        System.out.println("El numero " + numero + " no es capicúa");
                    }

                }

                //Para numeros de 3 cifras, por ejemplo 123, empleo el mismo planteamento que para cuatro cifras:


                else if (numero > 99){
                    int a = numero /10;
                    int b = a /10;

                    //Ahora extraigo digitos

                    int c= numero % 10;
                    int d= a % 10;
                    int e= b % 10;

                    // Ahora lo que hacemos es comparar el primer digito con el ultimo

                    if (e==c){

                        System.out.println("El numero " + numero + " es capicúa");
                    }

                    else {
                        System.out.println("El numero " + numero + " no es capicúa");
                    }

                }

                //y por ultimo para numeros de 2 cifras, por ejemplo 12, empleo el mismo planteamento que para cuatro cifras:

                else if (numero > 9){
                    int a = numero /10;

                    //Ahora extraigo digitos

                    int b= numero % 10;
                    int c= a % 10;


                    // Ahora lo que hacemos es comparar el primer digito con el ultimo

                    if (c==b){

                        System.out.println("El numero " + numero + " es capicúa");
                    }

                    else {
                        System.out.println("El numero " + numero + " no es capicúa");
                    }

                }

                else if (numero < 10){

                        System.out.println("Introduce minimo dos cifras");
                    }


    }






}








