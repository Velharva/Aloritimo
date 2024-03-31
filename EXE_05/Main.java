import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        ArrayList<Carro> automovel = new ArrayList<Carro>();

        int opcao = 0, escolha = 0, ano = 0, velocidade = 0, i = 0, registro = 0, aux = 0, acelerar = 0, frear = 0;
        String marca = "", modelo = "", vereficar = "";
        boolean retorno;

        do {
            
            System.out.printf("\n\n[1] - Cadastre Automovel | [2] - Realizar Acao | [3] - Exibir Automoveis | [4] - Sair\n\n");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                System.out.printf("\n\nInforme a marca do Automovel: ");
                marca = ler.next();
                System.out.printf("Informe modelo do Automovel: ");
                modelo = ler.next();
                System.out.printf("Ano de lancamento: ");
                ano = ler.nextInt();
                System.out.printf("Informe Velocidade do veiculo: ");
                velocidade = ler.nextInt();
                automovel.add(new Carro(marca, modelo, ano, velocidade));  
                registro++;  
                break;
                case 2:
                System.out.printf("\n\nInforme qual modelo deseja realizar acao: ");
                vereficar = ler.next();
                for (i = 0; i < registro; i++) {
                retorno = automovel.get(i).VereficarAutomoveis(vereficar);
                    if (retorno) {
                        System.out.printf("\n\n[1] - Acelerar Veiculo | [2] - Reduzir velocidade\n\n");
                        escolha = ler.nextInt();
                        switch (escolha) {
                            case 1:
                            System.out.printf("\n\nQuanto deseja aumentar a velocidade: ");
                            acelerar = ler.nextInt();
                            aux = velocidade + acelerar;
                            automovel.get(i).automovelAcao(aux);
                            break;
                            case 2:
                            System.out.printf("\n\nQuanto deseja reduzir a velocidade: ");
                            frear = ler.nextInt();
                            aux = velocidade - frear;
                            automovel.get(i).automovelAcao(aux);
                            break;
                            default:
                            System.out.printf("\n\nOpcao Invalida!!!");
                            break;
                        }
                    }
                }
                break;
                case 3:
                System.out.print("\n\nInforme qual modelo deseja exibir: ");
                vereficar = ler.next();
                for (i = 0; i < registro; i++) {
                    retorno = automovel.get(i).VereficarAutomoveis(vereficar);
                    if (retorno) {
                        automovel.get(i).automovelMostrar();
                        break; 
                    }
                }
                break;
                case 4:
                break;
                    default:
                    System.out.println("\n\nOpcao Inavalida!!!");
                    break;
                }

        }while(opcao != 4);

            System.out.println("\n\nPrograma Encerrado!!!");
            ler.close();
    }
}
