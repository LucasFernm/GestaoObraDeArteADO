package modelo;

public class ObraDeArte {
    private static int contador = 1;
    private int id;
    private String nomeArtista;
    private String tituloObra;
    private int anoCriacao;
    private String tipoArte;
    private String descricao;
    private String localizacaoGaleria;
    private double valorEstimado;

    public ObraDeArte(String nomeArtista, String tituloObra, int anoCriacao, String tipoArte, String descricao,
                      String localizacaoGaleria, double valorEstimado) {
        this.id = contador++;
        this.nomeArtista = nomeArtista;
        this.tituloObra = tituloObra;
        this.anoCriacao = anoCriacao;
        this.tipoArte = tipoArte;
        this.descricao = descricao;
        this.localizacaoGaleria = localizacaoGaleria;
        this.valorEstimado = valorEstimado;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        ObraDeArte.contador = contador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getTituloObra() {
        return tituloObra;
    }

    public void setTituloObra(String tituloObra) {
        this.tituloObra = tituloObra;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getTipoArte() {
        return tipoArte;
    }

    public void setTipoArte(String tipoArte) {
        this.tipoArte = tipoArte;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocalizacaoGaleria() {
        return localizacaoGaleria;
    }

    public void setLocalizacaoGaleria(String localizacaoGaleria) {
        this.localizacaoGaleria = localizacaoGaleria;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    // Getters e setters

    @Override
    public String toString() {
        return "ObraDeArte{" +
                "id=" + id +
                ", nomeArtista='" + nomeArtista + '\'' +
                ", tituloObra='" + tituloObra + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", tipoArte='" + tipoArte + '\'' +
                ", descricao='" + descricao + '\'' +
                ", localizacaoGaleria='" + localizacaoGaleria + '\'' +
                ", valorEstimado=" + valorEstimado +
                '}';
    }


}
