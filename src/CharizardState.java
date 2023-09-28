public class CharizardState implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Charizard käyttää voimakasta tulimyrskyä!");
    }

    @Override
    public void defend() {
        System.out.println("Charizard puolustautuu lujasti!");
    }

    @Override
    public void evolve(PokemonContext context) {
        System.out.println("Charizard ei voi enää kehittyä!");
    }
}
