import java.util.List;

public class FirePokemon extends Pokemon {
//    2 private final varioables
    private final String name;
    private List<String> attacks;


//    1 constructor
public FirePokemon(String name, int level, int hp, String food, String sound) {
    super(level, hp, food, sound);
    this.name = name;
}

//     1 getter
    public List<String> getAttacks() {
        return attacks;
}
//     1 setter
    public void setAttacks(List<String> attacks) {
    this.attacks = attacks;
}
//    4 methods
    public void inferno(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void pyroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void fireLash(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void flameThrower(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
