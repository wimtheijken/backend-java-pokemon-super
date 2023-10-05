package src;

public class WaterPokemon extends Pokemon{

    private String level;
    private String food;

    public WaterPokemon(String name, String sound, int hp, int xp, String level, String food) {
        super(name, sound, hp, xp);
        this.food = food;
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    void eats(){
        System.out.println("eats");
    }

    void hydroPump(){
        System.out.println("hydroPump");
    }

    @Override
    void pound(){
        System.out.println("Overflow " + this.level);

    }
}
