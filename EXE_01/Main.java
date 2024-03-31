import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        ArrayList<Calculadora> operacao = new ArrayList<Calculadora>();

        System.out.printf("Informe primeiro Numero: ");
        int numero1 = ler.nextInt();
        System.out.printf("Informe segundo Numero: ");
        int numero2 =ler.nextInt();
        System.out.printf("- ESCOLHA UMA DAS OPCOES -");
        System.out.printf("\n{1} - Soma | {2} - Subtracao | {3} - Multiplicacao | {4} - Divisao\n");
        int opcao = ler.nextInt();

        Calculadora Calculadora = new Calculadora(numero1, numero2, opcao);

        operacao.add(Calculadora);

        ler.close();

        operacao.get(0).mostra();
    }

}