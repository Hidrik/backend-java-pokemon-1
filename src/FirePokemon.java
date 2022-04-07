public class FirePokemon extends Pokemon {

    //Variables
    private String food = "fireballs";
    private String weakness = "water";
    private String type = "fire";

    //Constructors
    public FirePokemon(String name, int hp, int damage, int levelHp, int levelDamage) {
        super(name, hp, damage, levelHp, levelDamage);
    }

    //Methods
    @Override
    public void speaks() {
        System.out.println(this.getName() + " spuwt vuur!");
    }

    @Override
    public void eats() {
        System.out.println(this.getName() + " eet " + this.food);
    }

    //Getters and setters
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


}
