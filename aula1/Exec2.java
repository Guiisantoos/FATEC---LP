import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o cumprimento do terreno: ");
        int cumprimento = input.nextInt();
        
        System.out.print("Digite o largura do terreno: ");
        int largura = input.nextInt();

        int area = cumprimento * largura;

        System.out.println("A área do terreno é: " + area);
    }
}
