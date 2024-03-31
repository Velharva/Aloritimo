import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        ArrayList<Mercado> Estoque = new ArrayList<Mercado>();

        int opcao = 0, escolha = 0, codigo = 0, quantidade = 0, valor = 0, vereficar = 0, registro = 0, i = 0,  aux = 0, aumentar = 0, diminuir = 0;
        String produto = "";
        boolean retorno;

        do{

            System.out.printf("\n\n[1] - Adicionar produto | [2] - Atualizar Armazem | [3] - Removere Produto | [4] - Exibir | [5] - Sair\n\n");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                System.out.printf("\n\nInforme nome do Produto: ");
                produto = ler.next();
                System.out.printf("Informe codigo do Produto: ");
                codigo = ler.nextInt();
                System.out.printf("Informe quantidade do Produto: ");
                quantidade = ler.nextInt();
                System.out.printf("Informe valor do Produto: ");
                valor = ler.nextInt();
                Estoque.add(new Mercado(produto, codigo, quantidade, valor));
                registro++;
                break;
                case 2: 
                System.out.printf("\n\nInforme codigo do Produto: ");
                vereficar = ler.nextInt();
                for(i = 0; i < registro; i++) {
                    retorno = Estoque.get(i).Vereficador(vereficar);
                    if(retorno) {
                        System.out.printf("\n\n[1] - Aumentar quantidade | [2] - Diminuir quantidade | [3] - Aumentar valor | [4] - Diminuir valor\n\n");
                        escolha = ler.nextInt();
                        switch (escolha) {
                            case 1:
                            System.out.printf("\n\nQuanto deseja aumentar: ");
                            aumentar = ler.nextInt();
                            aux = quantidade + aumentar;
                            Estoque.get(i).AlterarQuant(aux);
                            break;
                            case 2:
                            System.out.printf("\n\nQuanto deseja diminuir: ");
                            diminuir = ler.nextInt();
                            aux = quantidade - diminuir;
                            Estoque.get(i).AlterarQuant(aux);
                            break;
                            case 3:
                            System.out.printf("\n\nQuanto deseja aumentar: ");
                            aumentar = ler.nextInt();
                            aux = valor + aumentar;
                            Estoque.get(i).AlterarValor(aux);
                            break;
                            case 4:
                            System.out.printf("\n\nQuanto deseja diminuir: ");
                            diminuir = ler.nextInt();
                            aux = valor - diminuir;
                            Estoque.get(i).AlterarValor(aux);
                            break;
                            default:
                            System.out.println("\n\nOpcao invalida!!!");
                            break;
                        }
                    }
                }
                break;
                case 3:
                System.out.printf("\n\nQual produto deseja remover do estoque: ");
                vereficar = ler.nextInt();
                for (i = registro - 1; i >= 0; i--) {
                    retorno = Estoque.get(i).Vereficador(vereficar);
                    if (retorno) {
                        Estoque.remove(i);
                        registro--;
                        System.out.println("\n\nProduto removido.");
                        break; 
                    }else if(i == registro) {
                        System.out.println("\n\nProduto nao encontrado.");
                        break;
                    }
                }
                case 4:
                System.out.printf("\n\nInforme codigo do Produto: ");
                vereficar = ler.nextInt();
                for(i = 0; i < registro; i++) {
                    retorno = Estoque.get(i).Vereficador(vereficar);
                    if(retorno) {
                        Estoque.get(i).MostrarEstoque();
                        break;
                    }
                }
                break;
                case 5:
                break;
                default:
                System.out.println("\n\nOpcao invalida!!!");
                break;
            }

        }while(opcao != 5);

            System.out.println("\n\nPrograma Encerrado!!!");
            ler.close();
    }
}