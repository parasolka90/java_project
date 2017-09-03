package kodilla.good.patterns.challanges0;

class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.getMovies().forEach((s, l) -> l.forEach(e -> System.out.print(e + "!")));
    }
}