public class PilhaV {

    private int tamanho, topo;
    private Livro[] vetor;

    public PilhaV()
    {
        tamanho = 0;
        topo = -1;
        vetor = null;
    }

    public boolean vazia() {
        return (topo == -1);
    }

    public boolean cheia() {
        return ((topo + 1) == topo);
    }

    public boolean push(Livro livro) {
        if (cheia()) {
            return false;
        }
        topo++;
        vetor[topo] = livro;
        return true;
    }

    public Livro pop() {
        if (vazia()) {
            return null;
        }
        Livro tira = vetor[topo];
        vetor[topo] = null;
        topo--;
        return tira;
    }
    public boolean settamanho(int aux) {
        if (aux > 2 && aux < 100) {
            tamanho = aux;
            vetor = new Livro[topo];
            return true;
        }
        return false;
    }
}
