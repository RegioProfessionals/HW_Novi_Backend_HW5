import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
//    2 private final variables
    private final String name;
    private List<String> attacks = Arrays.asList("LeafStorm", "SolarBeam", "LeechSeed", "LeaveBlade");


//    1 constructor
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
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

    //    4 methods
    public void leafStorm(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void solarBeam(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leechSeed(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void leaveBlade(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
