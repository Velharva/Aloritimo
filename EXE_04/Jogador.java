public class Jogador {
    
    String usuario;
    int nivel;
    int pontuacao;

    Jogador(String nome, int level, int pontos) {

        usuario = nome;
        nivel = level;
        pontuacao = pontos;
    }

    boolean vereficador(String busca) {

        if(usuario.equals(busca)){
            return true;
        }else{
            return false;
        }
    }

    void Alterar(int level, int pontos) {
        
        nivel = level;
        pontuacao = pontos;
    }

    void Mostrar() {
        
        System.out.printf("\nPerfil = Nome do Usuario: %s | Nivel: %d | Pontuacao: %d", usuario, nivel, pontuacao);
    }
}