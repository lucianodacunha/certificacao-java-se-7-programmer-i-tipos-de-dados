package aula01;

import java.io.*;

public class TiposPrimitivos {
    public static void main(String[] args){
        PrintStream t = System.out;

        byte bMin = Byte.MIN_VALUE;
        byte bMax = Byte.MAX_VALUE;
        t.println(bMin);
        int ib = 0B10;

        short s = 1;
        char c = 1;
        int i = 1;
        long l = 1l;
        boolean b = true;

        t.println(Character.MIN_VALUE);
        t.println(Character.MAX_VALUE);
        t.println('\u0026');

        int o = 0321; // octal
        t.println(o);
        int h = 0xAB2344; // hexa
        t.println(h);

        double d = 3.1E2;
        float e = 2e3f;

        // usando underlines
        long lit1 = 1_234_345_213l;
        

        String[] keywords = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "true", "try", "void", "volatile", "while"};

        String[] reserved_literals = {"true", "false", "null"};

        char ch = 'a';
        t.println(ch);

        ch++;
        ch++;
        t.println(ch);
    }
}