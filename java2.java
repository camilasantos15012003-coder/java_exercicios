package java1;
import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor total da conta:");
        double valortotal = scanner.nextDouble();

        System.out.println("Quantidade de pessoas:");
        int quantidade = scanner.nextInt();

        double taxa = valortotal * 0.10;
            
        double totalcomTaxa = valortotal + taxa;

        double valorporPessoa = totalcomTaxa / quantidade;

        System.out.println("Valor total com taxa:" + totalcomTaxa);
        
        System.out.println("Valor por pessoa:" + valorporPessoa);

        scanner.close();
    }
}