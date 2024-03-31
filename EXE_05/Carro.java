public class Carro {
    
    String modelo;
    String marca;
    int ano;
    int velocidade;

    Carro(String marca, String modelo, int ano, int velocidade) {

        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    boolean VereficarAutomoveis(String vereficar) {
        if(vereficar.equals(modelo)) {
            return true;
        }else {
            return false;
        }
    }

    void automovelAcao(int velocidade) {

        this.velocidade = velocidade;
    }

    void automovelMostrar() {

        System.out.printf("\nMarca: %s | Modelo: %s | Ano: %d | velocideda: %d", this.marca, this.modelo, this.ano, this.velocidade);
    }
}

