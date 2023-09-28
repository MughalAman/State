public class CharmeleonState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charmeleon käyttää tulihyökkäystä!");
    }

    @Override
    public void defend() {
        System.out.println("Charmeleon puolustautuu voimakkaammin!");
    }

    @Override
    public void evolve(PokemonContext context) {
        context.setState(new CharizardState());
        System.out.println("Charmeleon kehittyi Charizardiksi!");
    }
}
