package java1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("FICHA DE MATRICULA");

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Idade:");
        int Idade = scanner.nextInt();

        System.out.println("Curso:");
        String curso = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Cidade:");
        String cidade = scanner.nextLine();

        System.out.println("Telefone:");
        int telefone = scanner.nextInt();
    }
}