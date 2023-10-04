package src;

public class ElectricPokemon extends Pokemon {

    private String secondType; // dit heb ik tijdens de huiswerklas gemaakt
    private String defence;
    private String attack;

    public ElectricPokemon(String name, String sound,int hp, int xp, String defence, String attack, String secondType) {
        super(name, sound, hp, xp);
        this.defence = defence;
        this.attack = attack;
        this.secondType = secondType;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getSecondType() {
        return secondType;
    }

    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }

    void electroBall(){
        System.out.println("electroBall");
    }

    void voltTackle(){
        System.out.println("voltTackle");
    }
    @Override
    void pound(){
        System.out.println("Electric " + this.attack);
    }
}
