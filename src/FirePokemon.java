package src;

public class FirePokemon extends Pokemon {

    private String special;
    private int accuracy;

    public FirePokemon(String name, String sound, int hp, int xp, String special, int accuracy) {
        super(name, sound, hp, xp);
        this.special = special;
        this.accuracy = accuracy;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    void inferno(){
        System.out.println("inferno");
    }

    void pyroBall(){
        System.out.println("pyroBall");
    }

    @Override
    void pound(){
        System.out.println("Burning " + this.special);

    }
}
