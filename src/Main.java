package src;

public class Main {
    public static void main(String[] args) {

        ElectricPokemon pikachu = new ElectricPokemon("Pikachu","pika pika", 100, 10, "electroBall", "voltTackle", "Normal");
        WaterPokemon sharpedo = new WaterPokemon("Sharpedo", "jam jam", 100, 10, "hydroPump", "eats");
        FirePokemon moltres = new FirePokemon("Moltres", "fire fire", 100, 10, "inferno", 50);
        GrassPokemon bayleef = new GrassPokemon("Bayleef", "gras gras", 100, 10, 100, 158);

        System.out.println(pikachu.getName());
        System.out.println("Say's: " + pikachu.getSound());
        pikachu.pound();
        pikachu.electroBall();
        pikachu.voltTackle();
        System.out.println();
        System.out.println(sharpedo.getName());
        System.out.println("Say's: " + sharpedo.getSound());
        sharpedo.eats();
        sharpedo.hydroPump();
        sharpedo.pound();
        System.out.println();
        System.out.println(moltres.getName());
        System.out.println("Say's: " + moltres.getSound());
        moltres.inferno();
        moltres.pound();
        moltres.pyroBall();
        System.out.println();
        System.out.println(bayleef.getName());
        System.out.println("Say's: " + bayleef.getSound());
        bayleef.leafStorm();
        bayleef.pound();
        bayleef.speaks();

    }
}
