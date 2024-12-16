import java.util.List;

public abstract class Pokemon {

//    5 private final variables
    private final int level;
    private final int hp;
    private final String food;
    private final String sound;
    private String type;
    private String name;


//    1 constructor
    public Pokemon(int level, int hp, String food, String sound) {
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    // 6 getters
    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getFood() {
        return food;
    }

    public String getSound() {
        return sound;
    }


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }


    //    1 setter
    public void setType(String newType) {
        this.type = newType;
    }


}
