package aula02;

import java.io.*;

class Item {
    int valor = 10;
}

class DiferencaEntreVariaveis {
    public static void main(String... a){
        PrintStream t = System.out;

        int c = 1;
        int b = c;
        c++;

        t.println(c);
        t.println(b);

        Item i1 = new Item();
        i1.valor = 10;
        Item i2 = i1;
        i2.valor = 20;

        t.println(i1.valor);
        t.println(i2.valor);

    }
}