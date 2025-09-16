import java.util.Scanner;
public class Exec1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ano, mes, dia;

        System.out.print("Quantos anos você tem? ");
        ano = input.nextInt();

        System.out.print("Quantos meses desde o seu último aniversário? ");
        mes = input.nextInt();

        System.out.print("Quantos dias? ");
        dia = input.nextInt();

        int idade = (ano*365)+(mes*30)+(dia);

        System.out.println("A idade em dias é: " + idade);
    }
}
