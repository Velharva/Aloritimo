import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        ArrayList<Jogador> jogo = new ArrayList<Jogador>();

        int opcao = 0, nivel = 0, pontuacao = 0, registro = 0, i =0;
        String usuario = "", busca = "";
        boolean retorno;

        do {
            System.out.printf("\n\n{1} - Cadastrar jogador |{2} - Alterar Dados |{3} - Exiber Dados |{4} - Sair\n\n");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                System.out.printf("\n\nInforme Nome para Usuario: ");
                usuario = ler.next(); 
                System.out.printf("Informe o Nivel do jogador: ");
                nivel = ler.nextInt();
                System.out.printf("Informe a Pontuacao do jogador: ");
                pontuacao = ler.nextInt();
                jogo.add(new Jogador(usuario, nivel, pontuacao)); 
                registro++;
                break;
                case 2:
                System.out.printf("\nInforme perfil que deseja alterar: ");
                busca = ler.next();
                for(i = 0; i < registro; i++) {
                    retorno = jogo.get(i).vereficador(busca);
                    if(retorno) {
                        System.out.printf("\nInforme novo Nivel: ");
                        nivel = ler.nextInt();
                        System.out.printf("Informe nova Pontuacao: ");
                        pontuacao = ler.nextInt();
                        jogo.get(i).Alterar(nivel, pontuacao);
                        break;
                    }
                }
                break;
                case 3:
                for(i = 0; i < registro; i++) {
                    retorno = jogo.get(i).vereficador(busca);
                    jogo.get(i).Mostrar();
                }
                break;
            }

        }while(opcao != 4);
            System.out.println("\n\nPrograma Encerrado!!!");

            ler.close();
    }
}