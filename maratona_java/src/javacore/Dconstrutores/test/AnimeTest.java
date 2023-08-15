package javacore.Csobrecargametodos.test;

import javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.setTipo("Isekai");
        //anime.setEpisodios(86);
        //anime.setNome("Mushoku Tensei");
        anime.init(
                "Mushoku Tensei", "Isekai",
                86
        );
        anime.setGenero("Acão");
        anime.imprime();
    }
}
