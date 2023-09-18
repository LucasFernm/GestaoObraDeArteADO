package lista;

public class No {
    private Object dados;
    private No prox;

    public No(Object dados, No prox) {
        this.dados = dados;
        this.prox = prox;
    }

    public Object getDados() {
        return dados;
    }

    public void setDados(Object dados) {
        this.dados = dados;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
}
