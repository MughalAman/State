public interface PokemonState {
    void attack();
    void defend();
    void evolve(PokemonContext context);
}
