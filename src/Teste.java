import java.util.Scanner;

public class Teste {

    Scanner sc = new Scanner(System.in);

    public static Livro obterLivro() {

        Scanner sc = new Scanner(System.in);

        Livro livro = new Livro();

        System.out.println("Titulo");
        String str = sc.next();
        livro.setAutor(str);

        System.out.println("Autor");
        str = sc.nextLine();
        livro.setAutor(str);

        System.out.println("Editora");
        str = sc.nextLine();
        livro.getEditora();
        
        str = sc.nextLine();
        livro.setEditora(str);

        return livro;
    }

    static public void mostralivro(Livro livro) {
        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
        System.out.println(livro.getEditora());
    }

    static public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Livro novo = null;

        PilhaV pilha = new PilhaV();
        int n = 0;

        do {
            System.out.println("Tamanho");
            n = sc.nextInt();

        } while (!pilha.settamanho(n));

        boolean ok = false;
        int i = 0;

        while (i < n) {
            System.out.println("digite");
            System.out.println("1_para empilhar");
            System.out.println("2_para desempilhar");
            System.out.println("3_para fechar o programa");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    //empilhar
                    novo = obterLivro();
                    ok = pilha.push(novo);
                    if (ok) {
                        System.out.println("sucesso");
                    } else {
                        System.out.println("Pilhha cheia");
                    }
                    i++;
                    novo = null;
                    break;
                case 2:
                    //desenpilhar
                    novo = pilha.pop();
                    if (novo == null) {
                        System.out.println("Pilha vazia!");
                    } else {
                        mostralivro(novo);
                    }
                    break;
                case 3:
                    System.out.println("Termino");
                    break;
            }
        }
    }
}
