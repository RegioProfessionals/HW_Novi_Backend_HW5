import java.util.List;

public class PokemonGymOwner extends PokemonTrainer {

//    8 variables (6 in the list)
    private String name;
    private String town;
    private static List<Pokemon> pokemons;

//    1 constructor
    public PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name, pokemons);
        this.town = town;
        System.out.println(this.getName() + this.town + this.getPokemons());
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
