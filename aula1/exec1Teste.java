import java.util.Scanner;

public class exec1Teste{

public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int x, cont, soma;

    cont = 1;
    soma = 0;

    while(cont <= 10){
        System.out.print("Digite um número: ");
        x = input.nextInt();
        soma = soma + x;
        cont++;
    }
    System.out.print("A soma dos números é: "+soma);
}
}