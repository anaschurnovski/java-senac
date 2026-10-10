import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {

        troco();
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

        System.out.print("Digite o ano em que você nasceu: ");
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

        System.out.print("Digite o preço do produto: R$ ");
        double preco = leitor.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = leitor.nextInt();

        double total = quantidade * preco;

        System.out.printf("%d X R$ %.2f = R$ %.2f", quantidade, preco, total);

        leitor.close();

    }

    public static void exercicio05() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double graus = leitor.nextDouble();

        double fahrenheit = graus * 9 / 5 + 32;

        System.out.printf("%.1f °C = %.1f °F ", graus, fahrenheit);


        leitor.close();

    }

    public static void calculadoraGorjeta() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da conta: R$ ");
        double conta = leitor.nextDouble();

        System.out.print("Digite a porcentagem da gorjeta: ");
        double gorjetaPct = leitor.nextDouble();

        System.out.print("Digite o total de pessoas na mesa: ");
        int pessoas = leitor.nextInt();

        double gorjetaValor = conta / gorjetaPct;
        double total = conta + gorjetaValor;
        double valorIndividual = total / pessoas;

        System.out.printf("=== COMANDA ===\n"  +
                "Gorjeta: R$ %.2f%n" +
                "Total: R$ %.2f%n" +
                "Cada pessoa paga: R$ %.2f%n ", gorjetaValor, total, valorIndividual);



        leitor.close();

    }

    public static void consumoCarro() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a quantidade de KM rodado do carro: ");
        double km = leitor.nextDouble();

        System.out.print("Digite quantidade de litros gasto: ");
        double litros = leitor.nextDouble();

        double consumo = km / litros;

        System.out.printf("""
                Km rodados: %.0f
                Litros gastos: %.1f
                Consumo: %.2f km/l
                """, km, litros, consumo);

        leitor.close();

    }

    public static void folhaPagamento() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor da hora trabalhada no mês: R$ ");
        double valorHora = leitor.nextDouble();

        System.out.print("Digite as horas trabalhadas no mês: ");
        double horas = leitor.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = salarioBruto / 100;
        double inssDesc = inss * 9;
        double salarioLiquido = salarioBruto - inssDesc;


        System.out.printf("""
                === FOLHA DE PAGAMENTO ===
                Valor da hora: R$ %.2f
                Horas trabalhadas: %.2f
                Salário bruto: R$ %.2f
                INSS: R$ %.2f
                Salário líquido: R$ %.2f
                """, valorHora, horas, salarioBruto, inssDesc, salarioLiquido);

        leitor.close();

    }

    public static void troco() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor inteiro do troco: R$ ");
        int valor = leitor.nextInt();

        int nota100 = valor / 100;
        int resto = valor % 100;

        int nota50 = resto / 50;
        resto = resto % 50;

        int nota20 = resto / 20;
        resto = resto % 20;

        int nota10 = resto / 10;
        resto = resto % 10;

        int nota5 = resto / 5;
        resto = resto % 5;

        int nota2 = resto / 2;
        resto = resto % 2;

        int moeda = resto;

        System.out.printf("""
                Valor do troco inteiro: %d
                %d notas de R$ 100
                %d notas de R$ 50
                %d notas de R$ 20
                %d notas de R$ 10
                %d notas de R$ 5
                %d notas de R$ 2
                %d moeda R$ 1
                """, valor, nota100, nota50, nota20, nota10, nota5, nota2, moeda);

        leitor.close();

    }

}
