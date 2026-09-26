import java.util.Arrays;

public class OlaMundo {

    public static void main(String[] args) {

        // System.out.println("Hello World");

        // EXERCICIO 02 - cartão de visita

//        System.out.println("Ana Julia Rodrigues Schurnovski");
//        System.out.println("22 anos");
//        System.out.println("Estagiária");

        /** System.out.println("Ana Julia Rodrigues Schunovski \n" +
                "22 anos \n" +
                "Estagiária"); **/


        // EXERCICIO 03 - estrutura de prints - print e println
        /** System.out.print("Olá, ");
        System.out.println("turma de Java!");
        System.out.println("Esta frase fica na linha de baixo.");
        System.out.print("E esta, mais embaixo ainda."); */

        // EXERCICIO 04 - estrutura de prints e comentários
        /** //TÍTULO
        System.out.println("=== CAFÉ COADO ===");

        //DESCRIÇÃO
        System.out.println("Ingredientes: 500 ml de água e 4 colheres de pó");

        //PASSO A PASSO
        System.out.println("1. Ferva a água");
        System.out.println("2. Coloque o filtro no suporte");
        System.out.println("3. Coloque o pó no filtro");
        System.out.println("4. Despeje a água quente devagar");
        System.out.print("5. Sirva!"); */

        // EXERCICIO 05 - juntando texto e variável com +
        String nome = "Ana";
        int idade = 22;
        double altura = 1.63;
        boolean estudante = true;

         //System.out.println("Nome: " + nome + ", idade: " + idade);

        /** System.out.println("=== FICHA PESSOAL ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.print("Estudante? " + estudante); */

        // EXERCICIO 06 - calculo simples
        /**int numero01 = 17;
        int numero02 = 5;

        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Subtração: " + (numero01 - numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));
        System.out.println("Divisão: " + (numero01 / numero02));
        System.out.println("Resto da Divisão: " + (numero01 % numero02)); */

        // EXERCICIO 07 - calculo pessoas na mesa
        double conta = 180.00;
        int qtdPessoas = 4;
        double taxa = conta * 0.1;
        double total = conta + taxa;
        double valorInd = total / qtdPessoas;

        System.out.println("Conta: R$ " + conta + "\n" +
                "Serviço (10%): R$ " + taxa + "\n" +
                "Total: R$ " + total + "\n" +
                "Cada um paga: R$" + valorInd + "\n");

    }
}

// ctrl + alt + l = formatação do cod

// psvm - atalho de estrtutura - public static void main(String[] args) {}
// sout - atalho do println - System.out.println("");
// souf - atalho do printf - System.out.printf("");
