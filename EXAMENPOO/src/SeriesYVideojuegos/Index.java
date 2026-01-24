package SeriesYVideojuegos;

public class Index {

    public static void main(String[] args) {

        Serie[] serie = new Serie[5];
        VideoJuego[] juego = new VideoJuego[5];

        serie[0] = new Serie("Saint Seiya", 5, "Masami Kurumada", "Shonen");
        serie[1] = new Serie("Haikyuu", 4, "Haruichi Furudate", "Deporte");
        serie[2] = new Serie("Halo", "Alex Seropiam");
        serie[3] = new Serie("Peaky Blinders", 6, true, "Steven Knight", "Dramatica");
        serie[4] = new Serie("Estamos Muertos", "Chun Sung-il");

        juego[0] = new VideoJuego("Bioshock Infinite", 13, true, "Accion", "Ken Levine");
        juego[1] = new VideoJuego("Helldivers II", 30, true, "Accion", "Johan Pilestedt");
        juego[2] = new VideoJuego("Genshin Impact", 23);
        juego[3] = new VideoJuego("Crash Bandicoot", 12);
        juego[4] = new VideoJuego("Shadow of the Colossus", 10);

        int seriesEntregadas = 0;
        int juegosEntregados = 0;

        for (Serie s : serie) {
            if (s.isEntregado()) {
                seriesEntregadas++;
                s.devolver();
            }
        }

        for (VideoJuego v : juego) {
            if (v.isEntregado()) {
                juegosEntregados++;
                v.devolver();
            }
        }

        System.out.println("Series entregadas: " + seriesEntregadas);
        System.out.println("Videojuegos entregados: " + juegosEntregados);

        Serie serieMayor = serie[0];
        VideoJuego juegoMayor = juego[0];

        for (Serie s : serie) {
            if (s.compareTo(serieMayor) > 0) {
                serieMayor = s;
            }
        }

        for (VideoJuego v : juego) {
            if (v.compareTo(juegoMayor) > 0) {
                juegoMayor = v;
            }
        }

        System.out.println("\nSerie con más temporadas:");
        System.out.println(serieMayor);

        System.out.println("\nVideojuego con más horas:");
        System.out.println(juegoMayor);
    }
}
