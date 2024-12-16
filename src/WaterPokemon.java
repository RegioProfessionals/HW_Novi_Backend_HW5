import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    // 2 private final varaiabelen
    private final String name;
    private List<String> attacks;



//    1 constructor
    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(level, hp, food, sound);
        this.name = name;
    }

//    1 getter
    public List<String> getAttacks() {
        return attacks;
    }
//    1 setter
    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
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
