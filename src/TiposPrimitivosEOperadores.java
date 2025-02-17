public class TiposPrimitivosEOperadores {
    public static void main(String[] args) {
        //TIPOS PRIMITIVOS DA LINGUAGEM
        /* int -> valores inteiros
           double -> valores de ponto fluante (dupla precisão)
           char -> caracteres ('a' , '2', '.', unicode)
           boolean -> lógicos (true or false)
         */

        //OPERADORES
        // +, -, /, *, %(Resto)

        //Lista de variaveis inteiras
        int valorTotal = 12
                , soma, numeroAlunos;

        //lista variaveis dupla precisão
        double precoProduto = 57.50
                , taxaTransmissao;

        //lista de variaveis caracteres
        char opcao;

        //lista de booleanas
        boolean estaLigado,
                eFormando = false;

        //ATRIBUIÇÃO DE VALORES
        /*variavel = expressão
          soma = 0;
          opcao = 'b';
          estaLigado = true;
          taxaTransmissao = 1.07;
         */

        //CLASSES E MÉTODOS PARA SAÍDA DE DADOS
        //1) em terminal
    //System.out.println("MSG" + valores);
    // sout print ("msg" + valores);
        // sout printf ("msg, formatos");

        //exemplos println e print
        System.out.println("valor total = " + valorTotal);
        estaLigado = true;
        System.out.println("Está ligado ?" + estaLigado + "\nesta formando?" + eFormando);// \n usado para pular linha
        opcao = 'a';
        System.out.print("preço do produto: " + precoProduto);
        System.out.print("opção: " + opcao);

        //SEQUENCIAS DE SCAPE
        // \n -> new line
        // \t -> tab
        // \a -> bel

        //OS FORMATOS
        /* %d -> int
        %f -> double
        %c -> caractere
        %s boolean e String
         */
        System.out.printf("\nPreço = %f\nopcao = %c\nesta ligado = %s\nvalor total= %d\n", precoProduto, opcao, estaLigado, valorTotal );

        //INTERFACE GRÁFICA
        //#import javax.swing.JOptionPane; (para importar biblioteca de interface gráfica)
        //JOptionPane.showMessageDialog(null, "msg" + valores)
        //
    }
}