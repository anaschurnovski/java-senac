import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {

        exercicio04();
    }

    public static void exemplo01() {

        System.out.println("Exibe o código do metódo: Exemplo 01");
    }

    public static void exemplo02() {

        System.out.println("Exibe o código do metódo: Exemplo 02");
    }

    public static void exercicio01() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = leitor.nextInt();

        int idadeAnoQueVem = idade + 1;
        System.out.printf("Olá, %s! Ano que vem você terá %d anos.",
                nome, idadeAnoQueVem);

        leitor.close();
    }

    public static void exercicio02() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o ano em que você nasceu: ");
        int ano = leitor.nextInt();

        int idade = 2026 - ano;
        System.out.printf("Em 2026 você terá aproximadamente %d anos", idade);

        leitor.close();

    }

    public static void exercicio03() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println(nome + ", digite o seu sobrenome: ");
        String sobrenome = leitor.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = leitor.nextDouble();

        System.out.printf("""
                
                === FICHA PESSOAL ===
                
                NOME COMPLETO: %s %s
                IDADE: %d anos
                ALTURA: %.2f cm
                """, nome, sobrenome, idade, altura);


        leitor.close();

    }

    public static void exercicio04() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço do produto: R$ ");
        double preco = leitor.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quantidade = leitor.nextInt();

        double total = quantidade * preco;

        System.out.printf("%d X R$ %.2f = R$ %.2f", quantidade, preco, total);


        leitor.close();

    }

}
