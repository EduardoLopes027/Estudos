import java.util.Scanner;

public class Exercicio02Condicionais {
    public static void main (String args[]){

        Scanner leitor = new Scanner(System.in);

        double salario;
        double porcentagem;
        double valorTaxa;

        System.out.print("Digite o salário anual: R$");
        salario = leitor.nextDouble();

        if (salario <= 34712){
            porcentagem = 9.70;
        } else if (salario > 34712 && salario <= 68508) {
            porcentagem = 37.35;
        } else{
            porcentagem = 49.50;
        }
        valorTaxa = salario * (porcentagem / 100);
        System.out.println("Porcentagem da taxa tributaria: "+ porcentagem + "%");
        System.out.println("Você pagará uma taxa de R$" + valorTaxa);
        leitor.close();
    }
}
