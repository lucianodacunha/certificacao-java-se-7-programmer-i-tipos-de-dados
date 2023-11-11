package aula07;

import java.io.*;


class Strings {
    String vazio;

    public static void main(String... a){
        PrintStream t = System.out;

        // podemos criar de duas formas
        String s1 = new String("Java");
        String s2 = "Legal";
        t.println(s1);

        // String são imutaveis
        s1 = s1.toUpperCase();
        t.println(s1);

        // outros metodos
        String s3 = s1.concat(" ").concat(s2);
        t.println(s3);
        t.println(s3.charAt(6));
        t.println(s3.length());

        String s4 = "";
        t.println(s4.isEmpty());
        s4 = " ";
        t.println(s4.isEmpty()); // vazio, sem espaços
        t.println(s4.isBlank()); // vazio, pode conter espaços
        s4 = "Java ";
        t.println(s4.intern());
        t.println(s4.length());
        s4 = s4.trim();
        t.println(s4.length());

        t.println(s4.substring(2, 4));
        t.println(s4.equals("java"));
        t.println(s4.equalsIgnoreCase("java"));

        t.println(s4.endsWith("va"));
        t.println(s4.indexOf("v"));

        String s5 = null;
        // t.println(s5.isEmpty());

        // t.println(vazio); // impossível acessar variavel static

        // String s6 = null;
        // t.println(s6);

        // String s7 = new String(null); // nao compila
        // t.println(s7);

        // Não compila pois String possui diversos construtores que recebem um argumento: o compilador não sabe qual deles você deseja invocar pois os tipos que são argumentos do construtor não possuem herança entre si (um não herda necessariamente do outro).        

        String s8 = "certificacao";
        t.println(s8.lastIndexOf("a"));

        StringBuilder sb = new StringBuilder("guilherme");
        System.out.println(sb.indexOf("e") + sb.lastIndexOf("e"));
        System.out.println(sb.indexOf("k") + sb.lastIndexOf("k"));

    }
}