package stream;

import java.util.ArrayList;
import java.util.List;

class ServicoStreaming {
    private final List<Usuario> usuarios = new ArrayList<>();
    private final List<Filme> filmes = new ArrayList<>();
    private final List<Serie> series = new ArrayList<>();

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public void removerFilme(Filme filme) {
        this.filmes.remove(filme);
    }

    public void adicionarSerie(Serie serie) {
        this.series.add(serie);
    }

    public void removerSerie(Serie serie) {
        this.series.remove(serie);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public List<Serie> getSeries() {
        return series;
    }
}

class Usuario {
    private final String nome;
    private final List<Filme> filmesAssistidos = new ArrayList<>();
    private final List<Serie> seriesAssistidas = new ArrayList<>();

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void assistirFilme(Filme filme) {
        this.filmesAssistidos.add(filme);
    }

    public void assistirSerie(Serie serie) {
        this.seriesAssistidas.add(serie);
    }

    public String getNome() {
        return nome;
    }

    public List<Filme> getFilmesAssistidos() {
        return filmesAssistidos;
    }

    public List<Serie> getSeriesAssistidas() {
        return seriesAssistidas;
    }
}

class Filme {
    private final String nome;
    private final int duracao;

    public Filme(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }
}

class Serie {
    private final String nome;
    private final int numeroEpisodios;

    public Serie(String nome, int numeroEpisodios) {
        this.nome = nome;
        this.numeroEpisodios = numeroEpisodios;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }
}