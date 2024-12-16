public class WaterPokemon  extends Pokemon {
    // 2 private final varaiabelen
    private final String name;
    private String food;
    private final String sound;


//    1 constructor
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp);
        this.name = name;
        this.food = food;
        this. sound = sound;
    }

//    1 getter
    public boolean getAttacks() {
    }

//    4 methodes
    public void surf(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroPump(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void hydroCanon(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void rainDance(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
