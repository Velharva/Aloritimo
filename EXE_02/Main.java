import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        ArrayList<Biblioteca> livro = new ArrayList<Biblioteca>();

        String nome = "", titulo = "";
        int ano = 0, opcao = 0;

        do {

            System.out.printf("\n\n# MENU BIBLIOTECA #");
            System.out.printf("\n{1} - Cadastrar Livro | {2} - Conlsutar Livro | {3} - Sair\n\n");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                System.out.printf("\nInforme nome do Autor(a): ");
                nome = ler.next();
                System.out.printf("Informe Titulo do Livro: ");
                titulo = ler.next();
                System.out.printf("Informe ano de Publicacao do Livro: ");
                ano = ler.nextInt();
                break;
                case 2:
                System.out.printf("\n\nLista de livro na Biblioteca:\n");
                for(int i = 0; i < livro.size(); i++) {
                    System.out.printf("\nAutor(a): %s | Livro: %s | Publicacao: %d", nome, titulo, ano);
                }
                break;
            }
        }while(opcao != 3);
            System.out.println("\n\nPrograma Encerrado!");
            ler.close();

            Biblioteca Biblioteca = new Biblioteca(nome, titulo, ano);

            livro.add(Biblioteca);
    }
}