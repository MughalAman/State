public class CharmanderState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charmander käyttää liekkihyökkäystä!");
    }

    @Override
    public void defend() {
        System.out.println("Charmander puolustautuu!");
    }

    @Override
    public void evolve(PokemonContext context) {
        context.setState(new CharmeleonState());
        System.out.println("Charmander kehittyi Charmeleoniksi!");
    }
}
