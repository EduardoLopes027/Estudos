public class Exercicio04EstruturaDeRepeticao {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1.000.000

        int count = 0;

        while(count <= 1000000){
            System.out.println(count);
            count += 2;
        }
    }
}

/*

        for (int i = 0; i <= 1000000; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

            Nessa resolução o i pode começar de qualquer número que ainda vai mostrar só os pares. Na de cima existe a vulnerabilidade caso eu mude a regra do count.


 */