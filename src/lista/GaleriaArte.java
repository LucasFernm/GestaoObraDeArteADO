package lista;

import modelo.ObraDeArte;

public class GaleriaArte {
    private No inicio, atual, aux;

    public void inserir(ObraDeArte obra) {
        if (inicio == null) {
            inicio = new No(obra, null);
            aux = inicio;
        } else {
            atual = new No(obra, null);
            aux.setProx(atual);
            aux = atual;
        }
    }

    public void exibir() {
        No x = inicio;
        while (x != null) {
            System.out.println(x.getDados());
            x = x.getProx();
        }
    }

    public No[] pesquisar(int id) {
        No r = inicio;
        No raux = null;
        ObraDeArte obra;
        No[] v = null;
        while (r != null) {
            obra = (ObraDeArte) r.getDados();
            if (id == obra.getId()) {
                v = new No[2];
                v[0] = r;
                v[1] = raux;
                return v;
            }
            raux = r;
            r = r.getProx();
        }
        return v;
    }

    public boolean remover(int id) {
        No[] v = pesquisar(id);

        if (v != null) {
            if (v[0] == inicio) {
                inicio = v[0].getProx();
                v[0].setProx(null);
            } else if (v[0] == atual) {
                atual = v[1].getProx();
                v[1].setProx(null);
            } else {
                v[1].setProx(v[0].getProx());
                v[0] = null;
            }
            return true;
        }
        return false;
    }
}
