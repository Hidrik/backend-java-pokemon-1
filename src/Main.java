public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 120, 50, 20, 15);
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 130, 35, 15, 20, 25, 5);
        FirePokemon charmander = new FirePokemon("Charmander", 125, 30, 10, 25);
        WaterPokemon squirtle = new WaterPokemon("Squirtle", 120, 25, 5, 30);

        pikachu.thunderPunch(bulbasaur);

        bulbasaur.leach(pikachu);

        pikachu.voidBall(bulbasaur);

        bulbasaur.grassFlick(pikachu);



//        pikachu.speaks();
//        pikachu.eats();
//        bulbasaur.speaks();
//        bulbasaur.eats();
//        charmander.speaks();
//        charmander.eats();
//        squirtle.speaks();
//        squirtle.eats();
    }
}
