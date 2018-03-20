package br.com.felpudo.cardsfelpudo.Model;


public class DadosDoPersonagem {

    private int imagem;
    private String titulo;
    private String descricao;

    public DadosDoPersonagem(int imagem, String titulo, String descricao) {
        this.imagem = imagem;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
