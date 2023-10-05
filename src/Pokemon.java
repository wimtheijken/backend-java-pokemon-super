package src;

public abstract class Pokemon {
    private String name;
    private String sound;
    private int hp; //(health points)
    private int xp; // (experience points)

    public Pokemon(String name, String sound, int hp, int xp) {
        this.name = name;
        this.sound = sound;
        this.hp = hp;
        this.xp = xp;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    void speaks(){
        System.out.println(sound);
    }

    abstract void pound();
}
