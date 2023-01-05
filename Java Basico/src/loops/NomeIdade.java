package loops;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
          System.out.println("Digite seu Nome: ");
          nome = scan.next();
          if (nome.equals("0")) break;

          System.out.println("Digite sua idade: ");
          idade = scan.nextInt();
        }
        scan.close();

        System.out.println("Ultimo nome " + nome);
    }
}