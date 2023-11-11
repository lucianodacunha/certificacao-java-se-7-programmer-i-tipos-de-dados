package aula04;

class Item {
    int valor = 10;
}

class CicloDeVida {
    public static void main(String...a){
        Item i1 = new Item(); // criando um novo objeto
        Item i2 = i1;
        i1 = null; // Item ainda está acessível.
        i2 = null; // Item nao esta mais acessivel.

        // objetos inacessiveis são elegiveis para o gc.
        if (true){
            Item i3 = new Item();
        }
        // i3 esta inacessivel.

    }
}