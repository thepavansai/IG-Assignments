import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MovieManager {

    static class Movie implements Comparable<Movie> {
        private String name;
        private String language;
        private LocalDate releaseDate;
        private String director;
        private String producer;
        private int duration;

        public Movie(String name, String language, LocalDate releaseDate, String director, String producer, int duration) {
            this.name = name;
            this.language = language;
            this.releaseDate = releaseDate;
            this.director = director;
            this.producer = producer;
            this.duration = duration;
        }

        public String getName() {
            return name;
        }

        public String getLanguage() {
            return language;
        }

        public LocalDate getReleaseDate() {
            return releaseDate;
        }

        public String getDirector() {
            return director;
        }

        public String getProducer() {
            return producer;
        }

        public int getDuration() {
            return duration;
        }

        @Override
        public int compareTo(Movie other) {
            return this.language.compareTo(other.language);
        }

        @Override
        public String toString() {
            return "Movie{" +
                    "name='" + name + '\'' +
                    ", language='" + language + '\'' +
                    ", releaseDate=" + releaseDate +
                    ", director='" + director + '\'' +
                    ", producer='" + producer + '\'' +
                    ", duration=" + duration +
                    '}';
        }
    }

    static class DirectorComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie m1, Movie m2) {
            return m1.getDirector().compareTo(m2.getDirector());
        }
    }

    static class DurationComparator implements Comparator<Movie> {
        @Override
        public int compare(Movie m1, Movie m2) {
            return Integer.compare(m1.getDuration(), m2.getDuration());
        }
    }

    public List<Movie> createMovieSet() {
        List<Movie> movieList = new ArrayList<>();

        return movieList;
    }

    public void sortByLanguage(List<Movie> movieList) {
        Collections.sort(movieList);
    }

    public void sortByDirector(List<Movie> movieList) {
        Collections.sort(movieList, new DirectorComparator());
    }

    public void sortByDuration(List<Movie> movieList) {
        Collections.sort(movieList, new DurationComparator());
    }

    public static void main(String[] args) {
        MovieManager manager = new MovieManager();
        List<Movie> movies = manager.createMovieSet();
        movies.add(new Movie("Baahubali: The Beginning", "Telugu", LocalDate.of(2015, 7, 10), "S.S. Rajamouli", "Shobu Yarlagadda", 159));
        movies.add(new Movie("Baahubali: The Conclusion", "Telugu", LocalDate.of(2017, 4, 28), "S.S. Rajamouli", "Shobu Yarlagadda", 168));
        movies.add(new Movie("Magadheera", "Telugu", LocalDate.of(2009, 7, 31), "S.S. Rajamouli", "Allu Aravind", 186));
        movies.add(new Movie("Gabbar Singh", "Telugu", LocalDate.of(2012, 5, 11), "Harish Shankar", "Bandla Ganesh", 150));
        movies.add(new Movie("Vunnadhi Okate Zindagi", "Telugu", LocalDate.of(2017, 10, 5), "K. Radha Krishna", "Sree Vishnu", 130));
        movies.add(new Movie("Chirutha", "Telugu", LocalDate.of(2007, 9, 28), "Puri Jagannadh", "A. M. Rathnam", 150));

        System.out.println("Movies before sorting:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        manager.sortByLanguage(movies);
        System.out.println("\nMovies sorted by language:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        manager.sortByDirector(movies);
        System.out.println("\nMovies sorted by director:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        manager.sortByDuration(movies);
        System.out.println("\nMovies sorted by duration:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}