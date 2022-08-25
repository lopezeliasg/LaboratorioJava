package com.company;

public class tp_5 {
    public static void main(String[] args) {
        //definimos cada nro en una variable
        double  numero_1 = 6,
                numero_2 = 5,
                numero_3 = 2,
                numero_4 = 3,
                numero_5 = 7,
                numero_6 = 30,
                numero_7 = 1;
        // operaciones combinadas
        double  multi = numero_3 / numero_4 * numero_5 / numero_3,
                resta = numero_1 / numero_2 - multi,
                suma = resta + numero_3 / numero_6,
                div = numero_7 / numero_4 / numero_2,
                result = suma / div;
        //mostramos el resultado
        System.out.println("El resultado de la operacion propuesta es: " + result);
    }
}