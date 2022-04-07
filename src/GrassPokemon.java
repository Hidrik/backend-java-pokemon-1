public class GrassPokemon extends Pokemon {

    //Variables
    private String food = "grass";
    private String weakness = "fire";
    private String type = "grass";
    private int leach;
    private int levelLeach;

    //Constructors
    public GrassPokemon(String name, int hp, int damage, int levelHp, int levelDamage, int leach, int levelLeach) {
        super(name, hp, damage, levelHp, levelDamage);
        this.leach = leach;
        this.levelLeach = levelLeach;
    }

    //Methods
    @Override
    public void speaks() {
        System.out.println(getName() + " maakt een ritselend geluidje.");
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eet " + food);
    }

    @Override
    public void levelUp() {
        System.out.println(getName() + " is geleveled.");
        this.setDamage(getDamage() + getLevelDamage());
        this.setHp(getHp() + getLevelHp());
        this.leach += levelLeach;
    }


    public void grassFlick(Pokemon target) {
        if (target.takeDamage(getName(), getDamage()) <= 0) {
            levelUp();
        }
    }

    public void leach(Pokemon target) {

        if (target.takeDamage(getName(), getDamage()) <= 0) {
            levelUp();
        }

        this.setHp(getHp() + leach);

        System.out.println("Door leach heeft " + getName() + " nu " + getHp() + " HP.");




    }

    //Getters and setters
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
