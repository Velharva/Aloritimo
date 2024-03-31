public class Contato {

    String nome;
    int telefone;

    Contato(String nome, int telefone) {

        this.nome = nome;
        this.telefone = telefone;
    }

    boolean Vereficar(int vereficar) {

        if(telefone == vereficar) {
            return true;
        }else {
            return false;
        }
    }

    void MostrarAgenda() {

        System.out.printf("\nCONTATO = Nome: %s | Telefone: %d", this.nome, this.telefone);
    }
}
