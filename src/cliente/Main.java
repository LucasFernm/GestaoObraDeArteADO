package cliente;

import lista.GaleriaArte;
import lista.No;
import modelo.ObraDeArte;

public class Main {
    public static void main(String[] args) {
        // Criando algumas obras de arte
        ObraDeArte obra1 = new ObraDeArte("Leonardo da Vinci", "Mona Lisa", 1503, "Pintura", "Retrato famoso", "Galeria 1", 1000000);
        ObraDeArte obra2 = new ObraDeArte("Vincent van Gogh", "A Noite Estrelada", 1889, "Pintura", "Impressionismo", "Galeria 2", 800000);
        ObraDeArte obra3 = new ObraDeArte("Michelangelo", "O David", 1504, "Escultura", "Escultura em mármore", "Galeria 3", 1200000);

        // Criando uma galeria de arte
        GaleriaArte galeria = new GaleriaArte();

        // Inserindo as obras na galeria
        galeria.inserir(obra1);
        galeria.inserir(obra2);
        galeria.inserir(obra3);

        // Exibindo todas as obras na galeria
        System.out.println("Obras na Galeria de Arte:");
        galeria.exibir();

        // Pesquisando e exibindo informações de uma obra por ID
        int idPesquisa = 2; // Altere o ID de acordo com a obra desejada
        No[] resultadoPesquisa = galeria.pesquisar(idPesquisa);
        if (resultadoPesquisa != null) {
            ObraDeArte obraEncontrada = (ObraDeArte) resultadoPesquisa[0].getDados();
            System.out.println("\nObra Encontrada por ID " + idPesquisa + ":");
            System.out.println(obraEncontrada);
        } else {
            System.out.println("\nObra não encontrada.");
        }

        // Removendo uma obra da galeria por ID
        int idRemocao = 1; // Altere o ID de acordo com a obra a ser removida
        if (galeria.remover(idRemocao)) {
            System.out.println("\nObra com ID " + idRemocao + " removida com sucesso.");
        } else {
            System.out.println("\nNão foi possível remover a obra com ID " + idRemocao + ".");
        }

        // Exibindo novamente as obras na galeria após a remoção
        System.out.println("\nObras na Galeria de Arte Após Remoção:");
        galeria.exibir();
    }
}
