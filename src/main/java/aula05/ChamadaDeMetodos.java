package aula05;

class ChamadaDeMetodos {
    public static void main(String... a){
        Pessoa p = new Pessoa();
        p.setNome("Java"); // sem retorno, mas argumento obrigatório.
        System.out.println("Pessoa: " + p.getNome()); // com retorno.
        p.setItens("caderno", "computador", "celular", "fone", "livro");
        // outra forma de passar um array.
        p.setItens(new String[] {"caderno", "computador"});
        System.out.println("Imprime itens: "); // podemos iterar sobre varargs;
        for(int i = 0; i < p.itens.length; i++)
            System.out.print(p.itens[i] + " ");
        
        Pessoa p2 = null;

        /**
         * Passando um argumento para o método main utilizando o varargs.
         * Uma varargs é um array, mas um array não e um varargs.
         */
        if (a.length > 0)
            for (int i = 0; i < Integer.parseInt(a[0]); i++)
                p2 = new Pessoa(); // Criando pessoas
        
        System.out.println("\nquantidade de pessoas: " + Pessoa.quantidade);
    }
}

class Pessoa {
    String nome;
    static int quantidade = 0;
    String[] itens;

    Pessoa(){
        quantidade++;
    }

    void setNome(String nome){
        this.nome = nome; // obrigatorio a utilização do this, shadowing.
    }

    String getNome(){
        return this.nome; // opcional a utilização do  this.
    }

    /**
     * Recebe um nro variavel de parametros, 0 a varios.
     * Porém, caso existe outro metodo, que sobrecarregue este, mas que não
     * receba parametro, o Java executara o metodo mais especifico.
     * Caso na chamada, nao seja passado parametros, o metodo chamado será o 
     * sem parametros.
     */
    void setItens(String... itens){
        this.itens = itens;
    }

}