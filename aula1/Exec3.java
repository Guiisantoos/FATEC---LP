import java.util.Scanner;
public class Exec3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        int custoFab = input.nextInt();

        double distribuidor = custoFab * 0.32;
        double impostos = custoFab * 0.41;

        double total = custoFab + distribuidor + impostos;

        System.out.println("O valor do carro com impostos é: " + total) ;
    }
}
