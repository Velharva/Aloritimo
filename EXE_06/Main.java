import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        ArrayList<Contato> Agenda = new ArrayList<Contato>();

        int opcao = 0, telefone = 0, registro = 0, vereficar = 0, i = 0;
        String nome = "";
        boolean retorno;

        do{

            System.out.printf("\n\n[1] - Adiconar contato | [2] - Excluir contato | [3] - Buscar contato | [4] - Sair\n\n");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                System.out.printf("\n\nInforme nome do Contato: ");
                nome = ler.next();
                System.out.printf("Informe numero do Contato: ");
                telefone = ler.nextInt();
                Agenda.add(new Contato(nome, telefone));
                registro++;
                break;
                case 2:
                System.out.printf("\n\nQual numero deseja Excluir da Agenda: ");
                vereficar = ler.nextInt();
                for (i = registro - 1; i >= 0; i--) {
                    retorno = Agenda.get(i).Vereficar(vereficar);
                    if (retorno) {
                        Agenda.remove(i);
                        registro--;
                        System.out.println("\n\nContato removido.");
                        break; 
                    }else if(i == registro) {
                        System.out.println("\n\nContato nao encontrado.");
                        break;
                    }
                }
                break;
                case 3:
                System.out.printf("\n\nInforme qual numero deseja buscar: ");
                vereficar = ler.nextInt();
                for(i = 0; i < registro; i++) {
                    retorno = Agenda.get(i).Vereficar(vereficar);
                    if (retorno) {
                        Agenda.get(i).MostrarAgenda();
                    }
                }
                case 4:
                break;
                default:
                System.out.println("\n\nOpcao invalida!!!");
                break;
            }

        }while(opcao != 4);

            System.out.println("\n\nPrograma Encerrado!!!");
            ler.close();
    }
}
