import java.util.Scanner;

public class ExercicioIfElse {

    static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("""
                
                === EXERCÍCIOS ===
                
                1 - Entrada de Cinema
                2 - Login
                3- Nota
                4 - Dia da Semana
                5 - Mês
                
                Digite o número do exercício:
                """);

        int exemplo = leitor.nextInt();

        switch (exemplo) {

            case 1 -> entradaCinema();
            case 2 -> login();
            case 3 -> notaValida();
            case 4 -> diaSemana();
            case 5 -> escolhaMes();

            default -> System.out.println("Opção inválida");
        }
    }

    static void entradaCinema() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");

        int idade = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Tem ingresso? (s/n): ");
        String resposta = leitor.nextLine();

        boolean temIngresso = resposta.equalsIgnoreCase("s");

        if (idade >= 14 && temIngresso) {
            System.out.println("Pode entrar! Bom filme!");

        } else {
            System.out.println("Entrada não permitida");
        }

        leitor.close();

    }

    static void login() {

        Scanner leitor = new Scanner(System.in);

        String usuario, senha, usuarioCorreto, senhaCorreta;

        System.out.println("Digite o usuário: ");
        usuario = leitor.nextLine();
        System.out.println("Digite a senha: ");
        senha = leitor.nextLine();

        usuarioCorreto = "admin";
        senhaCorreta = "java123";

        if (usuario.equalsIgnoreCase(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Acesso liberado!");

        } else {
            System.out.println("Acesso negado.");
        }

    }

    static void notaValida() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota de 0 a 10: ");

        double nota = leitor.nextDouble();

        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota registrada!");

        } else {
            System.out.println("Nota inválida! Digite um valor de 0 a 10");
        }
    }

    static void diaSemana() {

        Scanner leitor = new Scanner(System.in);

        System.out.println(" Digite o dia da semana de 1 a 7: ");

        int dia = leitor.nextInt();

        switch (dia) {

            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");

            default -> System.out.println("Dia inválido!");
        }

        leitor.close();
    }

    static void escolhaMes() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o mês de 1 a 12: ");

        int mes = leitor.nextInt();

        switch (mes) {

            case 1 -> System.out.println("1- O mês é Janeiro e têm 31 dias");
            case 2 -> System.out.println("2- O mês é Fevereiro e têm 28 dias");
            case 3 -> System.out.println("3- O mês é Março e têm 31 dias");
            case 4 -> System.out.println("4- O mês é Abril e têm 30 dias");
            case 5 -> System.out.println("5- O mês éMaio e têm 31 dias");
            case 6 -> System.out.println("6- O mês éJunho e têm 30 dias");
            case 7 -> System.out.println("7- O mês éJulho e têm 31 dias");
            case 8 -> System.out.println("8- O mês é Agosto e têm 31 dias");
            case 9 -> System.out.println("9- O mês é Setembro e têm 30 dias");
            case 10 -> System.out.println("10- O mês é Outubro e têm 31 dias" );
            case 11 -> System.out.println("11- O mês é Novembro e têm 30 dias");
            case 12 -> System.out.println("12- O mês é Dezembro e têm 31 dias");

            default -> System.out.println("Opção inválida.");
        }
    }

    static void cardapio() {

        Scanner leitor = new Scanner (System.in);

        System.out.print("""
                === CARDÁPIO ===
                
                1- X-Burguer R$ 18,20
                2 - X-Salada R$ 20,30
                3- Hot Dog R$ 12,40
                4- Refrigerante R$ 6,00
                
                Digite o produto e a quantidade:
                """);

        String cardapio = leitor.next();

    }

}
