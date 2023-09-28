public class App {
    public static void main(String[] args) {
        PokemonContext pokemon = new PokemonContext();

        for (int i = 0; i < 5; i++) {
            pokemon.attack();
            pokemon.defend();
            pokemon.evolve();
        }
    }
}
