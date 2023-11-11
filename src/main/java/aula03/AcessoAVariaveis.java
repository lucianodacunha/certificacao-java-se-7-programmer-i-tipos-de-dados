package aula03;

import java.io.*;


class AcessoAVariaveis {
    public static void main(String... a){
        PrintStream t = System.out;
        Item i1 = new Item("Java", 11);

        i1.imprime();

    }
}

class Item {
    String nome;
    int valor;

    public Item(String nome, int valor){
        this.nome = nome; // acessando a variavel da instancia
        this.valor = valor; // usamos o this para evitar o shadowing

    }

    public void imprime(){
        System.out.println("Nome: " + nome + ", valor: " + valor);
    }
}