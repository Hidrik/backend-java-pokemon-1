public class ElectricPokemon extends Pokemon {

    private String food = "lightning";
    private String weakness = "ground";
    private String type = "electric";


    //Variables

    //Constructors
    public ElectricPokemon(String name, int hp, int damage, int levelHp, int levelDamage) {
        super(name, hp, damage, levelHp, levelDamage);
    }

    //Methods
    @Override
    public void speaks() {
        System.out.println(getName() + " maakt elektrisch geluidje.");
    }

    @Override
    public void eats() {
        System.out.println(getName() + " absorbeert " + food);
    }

    public void thunderPunch(Pokemon target) {
        if (target.takeDamage(getName(), getDamage()) <= 0) {
            levelUp();
        }
    }

    public void voidBall(Pokemon target) {
        target.takeDamage(getName(), getDamage()* 2);

        takeDamage(getName(), getDamage());

        if (target.getHp() <= 0 && getHp() > 0) {
            levelUp();
        } else if ( getHp() <= 0) {
            System.out.println("Door recoil is " + getName() + " verslagen.");
        }
    }

    //Getters and setters
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

}
