import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ArrayList<Pizza> cardapio = new ArrayList<>();
    static ArrayList<Pedido> pedidos = new ArrayList<>();
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarCardapio();

        int opcao;
        do {
            System.out.println("\n[1] Novo Pedido");
            System.out.println("[2] Cancelar Pedido");
            System.out.println("[3] Relatório de Pedidos");
            System.out.println("[0] Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    fazerNovoPedido();
                    break;
                case 2:
                    cancelarPedido();
                    break;
                case 3:
                    gerarRelatorioPedidos();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void inicializarCardapio() {
        List<String> ingredientesMussarela = new ArrayList<>();
        ingredientesMussarela.add("Queijo mussarela");
        cardapio.add(new Pizza("Mussarela", 30.0, ingredientesMussarela));

        List<String> ingredientesCalabresa = new ArrayList<>();
        ingredientesCalabresa.add("Queijo mussarela");
        ingredientesCalabresa.add("Calabresa");
        cardapio.add(new Pizza("Calabresa", 35.0, ingredientesCalabresa));
    }

    private static void fazerNovoPedido() {
        Pedido pedido = new Pedido();

        System.out.println("Selecione as pizzas disponíveis:");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println((i + 1) + ". " + cardapio.get(i));
        }

        int opcao;
        do {
            System.out.print("Escolha uma pizza (0 para finalizar): ");
            opcao = ler.nextInt();
            if (opcao > 0 && opcao <= cardapio.size()) {
                Pizza pizzaSelecionada = cardapio.get(opcao - 1);
                pedido.adicionarPizza(pizzaSelecionada);
                System.out.println("Pizza " + pizzaSelecionada.getNome() + " adicionada ao pedido.");
            } else if (opcao != 0) {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        System.out.print("Informe o endereço de entrega: ");
        ler.nextLine(); 
        String endereco = ler.nextLine();
        pedido.setEnderecoEntrega(endereco);

        pedidos.add(pedido);
        System.out.println("Pedido realizado com sucesso:");
        System.out.println(pedido);
    }

    private static void cancelarPedido() {
        System.out.print("Digite o número do pedido a ser cancelado: ");
        int numeroPedido = ler.nextInt();
        if (numeroPedido > 0 && numeroPedido <= pedidos.size()) {
            Pedido pedido = pedidos.get(numeroPedido - 1);
            pedido.cancelarPedido();
            System.out.println("Pedido cancelado com sucesso.");
        } else {
            System.out.println("Número de pedido inválido.");
        }
    }

    private static void gerarRelatorioPedidos() {
        System.out.println("\nRELATÓRIO DE PEDIDOS");
        System.out.println("---------------------");
        System.out.println("Total de pedidos realizados: " + pedidos.size());
        double totalPreco = 0;
        for (Pedido pedido : pedidos) {
            totalPreco += pedido.calcularTotal();
        }
        System.out.println("Média de preço dos pedidos: R$" + (pedidos.isEmpty() ? 0 : totalPreco / pedidos.size()));
    }
}