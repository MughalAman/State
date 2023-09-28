public class PokemonContext {
    private PokemonState state;

    public PokemonContext() {
        this.state = new CharmanderState();
    }

    public void setState(PokemonState state) {
        this.state = state;
    }

    public void attack() {
        state.attack();
    }

    public void defend() {
        state.defend();
    }

    public void evolve() {
        state.evolve(this);
    }
}
