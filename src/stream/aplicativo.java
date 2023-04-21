package stream;

public class aplicativo {
    public static void main(String[] args) {
        ServicoStreaming netflix = new ServicoStreaming();

        Filme filme1 = new Filme("Matrix", 136);
        Filme filme2 = new Filme("Interestelar", 169);
        Filme filme3 = new Filme("Creed III", 156);
        Filme filme4 = new Filme("Adão Negro", 205);
        Serie serie1 = new Serie("Breaking Bad", 62);
        Serie serie2 = new Serie("Game of Thrones", 73);
        Serie serie3 = new Serie("Peaky Blinders", 36);
        Serie serie4 = new Serie("The Witcher", 4);


        netflix.adicionarFilme(filme1);
        netflix.adicionarFilme(filme2);
        netflix.adicionarFilme(filme3);
        netflix.adicionarFilme(filme4);
        netflix.adicionarSerie(serie1);
        netflix.adicionarSerie(serie2);
        netflix.adicionarSerie(serie3);
        netflix.adicionarSerie(serie4);

        Usuario usuario1 = new Usuario("Lucas");
        Usuario usuario2 = new Usuario("Abigail");
        Usuario usuario3 = new Usuario("Jason");
        Usuario usuario4 = new Usuario("Kyle");

        usuario1.assistirFilme(filme1);
        usuario1.assistirFilme(filme3);
        usuario1.assistirSerie(serie4);
        usuario1.assistirSerie(serie2);

        usuario2.assistirFilme(filme3);
        usuario2.assistirFilme(filme2);
        usuario2.assistirSerie(serie3);

        usuario3.assistirSerie(serie2);

        usuario4.assistirSerie(serie4);
        usuario4.assistirSerie(serie3);
        usuario4.assistirSerie(serie1);


        System.out.println("Usuário " + usuario1.getNome() + " assistiu os filmes:");
        for (Filme filme : usuario1.getFilmesAssistidos()) {
            System.out.println(filme.getNome());
        }

        System.out.println("Usuário " + usuario1.getNome() + " assistiu as séries:");
        for (Serie serie : usuario1.getSeriesAssistidas()) {
            System.out.println(serie.getNome());
        }

        System.out.println("Usuário " + usuario2.getNome() + " assistiu os filmes:");
        for (Filme filme : usuario2.getFilmesAssistidos()) {
            System.out.println(filme.getNome());
        }
        System.out.println("Usuário " + usuario2.getNome() + " assistiu as séries:");
        for (Serie serie : usuario2.getSeriesAssistidas()) {
            System.out.println(serie.getNome());
        }

        System.out.println("Usuário " + usuario3.getNome() + " assistiu os filmes:");
        for (Filme filme : usuario1.getFilmesAssistidos()) {
            System.out.println(filme.getNome());
        }

        System.out.println("Usuário " + usuario3.getNome() + " assistiu as séries:");
        for (Serie serie : usuario1.getSeriesAssistidas()) {
            System.out.println(serie.getNome());
        }

        System.out.println("Usuário " + usuario4.getNome() + " assistiu os filmes:");
        for (Filme filme : usuario2.getFilmesAssistidos()) {
            System.out.println(filme.getNome());
        }

        System.out.println("Usuário " + usuario4.getNome() + " assistiu as séries:");
        for (Serie serie : usuario2.getSeriesAssistidas()) {
            System.out.println(serie.getNome());
        }
    }
}
