public class ContaBancaria {
    String titular;
    int conta;
    int saldo;

    public ContaBancaria(String Nome, int Conta, int Saldo) {
        titular = Nome;
        conta = Conta;
        saldo = Saldo;
    }

    public boolean verificarConta(int verificar) {
        return conta == verificar;
    }

    public void alterarSaldo(int Saldo) {
        saldo = Saldo;
    }

    public void consultarSaldo() {
        System.out.printf("\n\nSaldo atual da conta %d: $%d\n", conta, saldo);
    }

    public void mostrarConta() {
        System.out.printf("\nNome do titular: %s | Num. Conta: %d | Saldo Atual: $%d\n", titular, conta, saldo);
    }
}