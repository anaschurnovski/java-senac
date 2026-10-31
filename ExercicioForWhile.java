import java.util.Scanner;

public class ExercicioForWhile {
    static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("""
                           
                === EXERCÍCIOS ===
                
                1 - Contador
                2 - Contagem Regressiva
                3 - Soma até zero
                4- Validar nota
                5- Validar senha
                6- Calculadora
                7- Tabuada
                
                Digite o número do exercício:
                """);

        int exemplo = leitor.nextInt();

        switch (exemplo) {

            case 1 -> contarAteDez();
            case 2 -> contagemRegressiva();
            case 3 -> soma();
            case 4 -> validarNota();
            case 5 -> validarLogin();
            case 6 -> calculadora();
            case 7 -> tabuada();

            default -> System.out.println("Opção inválida");
        }
    }

    static void contarAteDez() {

        int contador = 1;             // 1) começa em 1

        while (contador <= 10) {     // 2) enquanto a condição for verdadeira

            System.out.println(contador);
            contador++;              // 3) avança (o mesmo que contador = contador + 1)
        }

        System.out.println("Acabou! O contador parou em " + contador);
    }

    static void contagemRegressiva() {

        int contador = 10;

        while (contador >= 1) {

            System.out.println(contador);
            contador--;
        }
        System.out.println("Lançar! " + contador);
    }

    static void soma() {

        Scanner leitor = new Scanner(System.in);

        int soma = 0;
        int contador = 0;

        System.out.println("Digite um número (0 para parar): ");
        int numero = leitor.nextInt();

        while (numero != 0) {

            soma += numero;
            contador++;

            System.out.println("Digite um número (0 para parar):");
            numero = leitor.nextInt();
        }

        System.out.println("soma: " + soma);
        System.out.println("números digitados: " + contador);

        leitor.close();

    }

    static void validarNota() {

        Scanner leitor = new Scanner(System.in);

        double nota;

        do {
            System.out.println("Digite a nota (0 a 10): ");
            nota = leitor.nextDouble();

            if (nota < 0 || nota > 10) {

                System.out.println("Nota inválida, tente novamente.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota registrada: " + nota);

        leitor.close();
    }

    static void validarLogin() {

        Scanner leitor = new Scanner(System.in);

        double senha;
        int tentativas = 0;

        do {
            System.out.println("Digite a senha: ");
            senha = leitor.nextDouble();
            tentativas++;

            if (senha != 1234 && tentativas < 3) {

                System.out.println("Senha inválida, tente novamente (Apenas 3 tentativas)");
            }

        } while (senha != 1234 && tentativas < 3);

        System.out.println("Bloqueado!");

        leitor.close();
    }

    static void calculadora() {

        Scanner leitor = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();


            System.out.print("Primeiro número: ");
            double a = leitor.nextDouble();
            System.out.print("Segundo número: ");
            double b = leitor.nextDouble();

            switch (opcao) {

                case 1 -> System.out.printf("Resultado: %.2f%n", a + b);
                case 2 -> System.out.printf("Resultado: %.2f%n", a - b);
                case 3 -> System.out.printf("Resultado: %.2f%n", a * b);
                case 4 -> {

                    if (b == 0) {
                        System.out.println("Não é possível dividir por zero!");
                    } else {
                        System.out.printf("Resultado: %.2f%n", a / b);
                    }
                }

                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }

        } while (opcao != 0);
    }

    static void tabuada() {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Tabuada de qual número? ");
        int numero = leitor.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %3d%n", numero, i, numero * i);
        }

        leitor.close();
    }

    static void somaPares() {

    }
}
