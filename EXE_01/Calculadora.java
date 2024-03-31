public class Calculadora {
    
    int numero1;
    int numero2;
    int opcao;

    Calculadora(int num1, int num2, int opc) {

        numero1 = num1;
        numero2 = num2;
        opcao = opc;
    }

    void mostra() {

        switch (opcao) {
            case 1:
            int soma = numero1 + numero2;
            System.out.printf("Resultado: |%d|", soma);    
            break;
            case 2:
            int subtracao = numero1 - numero2;
            System.out.printf("Resultado: |%d|", subtracao);
            break;
            case 3:
            int multiplicacao = numero1 * numero2;
            System.out.printf("Resultado: |%d|", multiplicacao);
            break;
            case 4:
            int divisao = numero1 / numero2;
            System.out.printf("Resultado: |%d|", divisao);
        }
    }
}