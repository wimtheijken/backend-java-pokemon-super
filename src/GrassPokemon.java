package src;

public class GrassPokemon extends Pokemon {
    private int height;
    private int weight;

    public GrassPokemon(String name, String sound, int hp, int xp, int height, int weight) {
        super(name, sound, hp, xp);
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    void leaveBlade(){
        System.out.println("leaveBlade");
    }

    void leafStorm(){
        System.out.println("leafStorm");
    }

    @Override
    void pound(){
        System.out.println("Grass Height " + this.height);

    }
}
