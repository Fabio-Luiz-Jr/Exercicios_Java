import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        byte n;
        long Sequencia[], aux;
        Scanner inpt = new Scanner(System.in);

        Sequencia = new long[2];
        Sequencia[1] = 1;
        System.out.println("Digite o tamanho da sequência(até 92): ");
        n = inpt.nextByte();
        inpt.close();

        for(int i = 0; i < n; i++){
            System.out.println(Sequencia[1]);
            aux = Sequencia[0] + Sequencia[1];
            Sequencia[0] = Sequencia[1];
            Sequencia[1] = aux;
        }

    }
}
