import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {

//    8 variables (6 in the list)
    private String name;
    private String town;
    private List<Pokemon> pokemons;

//    1 constructor
    public PokemonGymOwner(String userA, String town, List<Pokemon> pokemons) {
        super(userA, pokemons);
        this.town = town;
    }

//      getters
    public String getName() {
        return name;
    }
    public String getTown() {
        return town;
    }
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

//      setters
     public void setName(String name) {
        this.name = name;
    }
    public void setTown (String town) {
        this.town = town;
    }
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
