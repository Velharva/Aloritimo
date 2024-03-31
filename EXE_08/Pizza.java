import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pizza {
    private String nome;
    private double valor;
    private List<String> ingredientes;

    public Pizza(String nome, double valor, List<String> ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return nome + " - R$" + valor;
    }
}

class Pedido {
    private List<Pizza> pizzas;
    private String enderecoEntrega;
    private boolean cancelado;

    public Pedido() {
        pizzas = new ArrayList<>();
        enderecoEntrega = "";
        cancelado = false;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public void cancelarPedido() {
        cancelado = true;
    }

    public double calcularTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getValor();
        }
        return total;
    }

    public boolean isCancelado() {
        return cancelado;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido:");
        for (Pizza pizza : pizzas) {
            sb.append("\n- ").append(pizza.getNome()).append(" - R$").append(pizza.getValor());
        }
        sb.append("\nEndereço de entrega: ").append(enderecoEntrega);
        sb.append("\nTotal: R$").append(calcularTotal());
        return sb.toString();
    }
}

