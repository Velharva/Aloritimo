public class Mercado {
    
    String produto;
    int codigo;
    int quantidade;
    int valor;

    Mercado(String produto, int codigo, int quantidade, int valor) {

        this.produto = produto;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    boolean Vereficador(int vereficar) {

        if(codigo == vereficar) {
            return true;
        }else {
            return false;
        }
    }

    void AlterarQuant(int quantidade) {

        this.quantidade = quantidade;
        System.out.printf("\n\nAtualizado: Prod = %s | Quant = %d", this.produto, this.quantidade);
    }

    void AlterarValor(int valor) {

        this.valor = valor;
        System.out.printf("\n\nAtualizado: Prod = %s | Quant = %d", this.produto, this.valor);
    }

    void MostrarEstoque() {

        System.out.printf("\nESTOQUE: prod = %s | Codigo = %d | Quant = %d | Valor = %d", this.produto, this.codigo, this.quantidade, this.valor);
    }

}
