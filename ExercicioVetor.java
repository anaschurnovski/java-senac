import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioVetor {
    static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("""
                === EXERCÍCIOS ===
                
                1- Notas com Vetor
                2- Temperatura Semana
                3- Lista de Compras
                4- Remover item da lista
                5- Nomes da Turma com menu
                
                Digite o número do exercício:
                """);

        int exemplo = leitor.nextInt();

        switch (exemplo) {

            case 1 -> notasVetor();
            case 2 -> temperaturaSemana();
            case 3 -> listaCompra();
            case 4 -> removerItem();
            case 5 -> nomesTurma();

            default -> System.out.println("Opção inválida");
        }
    }

    static void notasVetor() {

        // jeito 1: criar já com valores
        double[] notas = {7.5, 8.0, 6.0, 9.5, 10.0};

        // jeito 2: criar vazio com tamanho e preencher depois
        String[] nomes = new String[3];

        nomes[0] = "Ana"; // a primeira posição é 0
        nomes[1] = "Bruno";
        nomes[2] = "Carla"; // a última é tamanho -1

        System.out.println("O vetor tem " + notas.length + " notas: ");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "] = " + notas[i]);
        }

        System.out.println("Primeiro nome: " + nomes[0]);
        System.out.println("Último nome: " + nomes[nomes.length - 1]);
    }

    static void temperaturaSemana() {
        double[] temperaturas = {22, 22.5, 19, 28, 30, 24, 21};
        String[] dias = {"Seg", "Ter", "Qua", "Qui", "Sex", "Sab", "Dom"};

        double soma = 0;


        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println("Temperatura de " + dias[i] + ": " + temperaturas[i]);
            soma += temperaturas[i];
        }

        double maior = temperaturas[0];
        double menor = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {

            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }

            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        double media = soma / temperaturas.length;

        System.out.printf("Média %.1f °C%n" +
                "Maior %.1f °C%n" +
                "Menor %.1f °C%n",
                media, maior, menor);
    }

    static void listaCompra() {

        Scanner leitor = new Scanner(System.in);

        ArrayList <String> compras = new ArrayList<>();

        compras.add("Arroz"); // add: coloca no final da lista
        compras.add("Feijão");
        compras.add("Café");
        compras.add("Leite");

        System.out.println("Itens na lista: " + compras.size()); // size: tamanho
        System.out.println("Primeiro item: " + compras.get(0));  // get: pega pela posição

        System.out.println("--- Minha Lista ---");
        for (String item: compras) {               // for-each: para cada item da lista
            System.out.println("- " + item);
        }

        System.out.println("Lista inteira: " + compras);
    }

    static void removerItem() {

        Scanner leitor = new Scanner(System.in);

        ArrayList <String> compras = new ArrayList<>();

        compras.add("Arroz");
        compras.add("Feijão");
        compras.add("Café");
        compras.add("Leite");

        System.out.print("Qual item deseja remover? ");
        String itens = leitor.nextLine();

        if (compras.contains(itens)) {
            compras.remove(itens);
            System.out.println(itens + " removido!");

        } else {
            System.out.println("Este item não existe!");
        }

        System.out.println("--- Lista final ---");
        for (String item: compras) {
            System.out.println("- " + item);
        }
    }

    static void nomesTurma() {
        Scanner leitor = new Scanner(System.in);

        ArrayList <String> nomes = new ArrayList<>();

    }
}

