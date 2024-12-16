import java.util.List;

public class ElectricPokemon extends Pokemon {
//   2 private final variables
    private final String name;
    private List<String> attacks;


//    1 constructor
public ElectricPokemon(String name, int level, int hp, String food, String sound) {
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
    public void thunderPunch(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void electroBall(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void thunder(Pokemon pokemon, Pokemon gymPokemon) {
    }

    public void voltTackle(Pokemon pokemon, Pokemon gymPokemon) {
    }
}
