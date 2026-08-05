public class Exercicio05Break {
    public static void main(String[] args) {
        //Dado do valor de um carro, descubra em quantas vezes ele pode ser pacelado
        //Condição valorParcela >=1000

        double valorCarro = 84750.25;
        double valorParcela;

        for (int i = 1; i <= valorCarro; i++) {
            valorParcela = valorCarro / i;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: "+ i + " Valor: R$"+ valorParcela);
            }

        }

    }
