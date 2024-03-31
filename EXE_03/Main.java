import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        ArrayList<ContaBancaria> banco = new ArrayList<ContaBancaria>();

        int opcao = 0, operacao = 0, vereficar = 0, conta = 0, saldo = 0, registro = 0, aux = 0, deposito = 0, saque = 0, i = 0;
        String nome = "";
        boolean retorno;

        do{
            System.out.printf("\n\n{1} - Cadastrar Conta |{2} - Realizar Operacoes |{3} - Exibir conta |{4} - Sair\n\n");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                System.out.printf("\n\nInforme nome do Usuario: ");
                nome = ler.next(); 
                System.out.printf("Numero da conta: ");
                conta = ler.nextInt();
                System.out.printf("Informe saldo atual: ");
                saldo = ler.nextInt();
                banco.add(new ContaBancaria(nome, conta, saldo));
                registro++;
                break;
                case 2:
                System.out.printf("\n\nInforme numero da Conta para realizar a Operacao:\n\n");
                vereficar = ler.nextInt();
                for(i = 0; i < registro; i++) {
                    retorno = banco.get(i).verificarConta(vereficar);
                    if(retorno) {
                        System.out.printf("\n\n{1} - Depositar | {2} - Sacar | {3} - consulta\n\n");
                        operacao = ler.nextInt();
                        switch (operacao) {
                            case 1:
                            System.out.printf("\n\nQuanto deseja depositar: ");
                            deposito = ler.nextInt();
                            aux = saldo + deposito;
                            banco.get(i).alterarSaldo(aux);
                            break;
                            case 2:
                            System.out.printf("\n\nQuanto deseja sacar: ");
                            saque = ler.nextInt();
                            aux = saldo - saque;
                            banco.get(i).alterarSaldo(aux);
                            break;
                            case 3:
                            banco.get(i).consultarSaldo();
                            break;
                            default:
                            System.out.printf("\n\nOperacao Invalida!!!");
                            break;
                        }
                    } 
                }
                break;
                case 3:
                for(i = 0; i < registro; i++) {
                    retorno = banco.get(i).verificarConta(vereficar);
                    banco.get(i).mostrarConta();
                }
                break;
                default:
                System.out.printf("\n\nOpcao Inavalida!!!");
                break;
            }

        }while(opcao != 4);
            System.out.printf("\n\nFinalizada Sessacao1!!!");

            ler.close();
    }
}