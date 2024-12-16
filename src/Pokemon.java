public abstract class Pokemon {

    //    5 private final variables
    private final String name;
    private final int level;
    private final int hp;
    private final String food;
    private final String sound;
    private String type;

//    1 constructor
    public Pokemon( String name, int level, int hp, String food, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.food = food;
        this.sound = sound;
    }

    // 6 getters
    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    public Object getSound() {
        return sound;
    }

    //    1 setter
    public void setType(String newType) {
        this.type = newType;
    }


}
