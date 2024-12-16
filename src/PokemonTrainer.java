import java.util.List;

public class PokemonTrainer {
    private final String userA;
    private String name;
    private List<Pokemon> pokemons;

//    1 constructor
    public PokemonTrainer(String userA, List<Pokemon> pokemons) {
        this.userA = userA;
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
