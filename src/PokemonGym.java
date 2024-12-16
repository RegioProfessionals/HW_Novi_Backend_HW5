import java.util.List;

interface PokemonGym {

    public abstract void enteredTheGym(PokemonTrainer player1);

    public abstract void printPokemon(List<Pokemon> pokemons);

    public abstract Pokemon selectPokemon(String pokemon, PokemonTrainer trainer);

    public abstract void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon);

    public abstract Pokemon chooseGymPokemon(PokemonGymOwner gymOwner);

    public abstract Pokemon choosePokemon(PokemonTrainer trainer);

    public abstract int randomAttackByGymOwner();

    public abstract String chooseAttackPlayer(Pokemon p);

    public abstract void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack);

    public abstract void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon);

    public abstract void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym);
}

