public class WaterPokemon extends Pokemon {

    //Variables
    private String food = "cristal clear";
    private String weakness = "grass";
    private String type = "water";

    //Constructors
    public WaterPokemon(String name, int hp, int damage, int levelHp, int levelDamage) {
        super(name, hp, damage, levelHp, levelDamage);
    }

    //Methods
    @Override
    public void speaks() {
        System.out.println(this.getName() + " klinkt als een stromende rivier.");
    }

    @Override
    public void eats() {
        System.out.println(this.getName() + " drinkt " + this.food);
    }

    //Getters and setters
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


}
