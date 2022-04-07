public abstract class Pokemon {

    //Variables
    private String name;
    private int hp, level = 0, damage, levelHp, levelDamage;


    //Constructors
    public Pokemon(String name, int hp, int damage, int levelHp, int levelDamage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.levelHp = levelHp;
        this.levelDamage = levelDamage;
    }

    //Abstract methods
    public abstract void speaks();

    public abstract void eats();

    //Methods
    public int takeDamage(String attackerName, int damage) {
        System.out.println(attackerName + " doet " + damage + " damage tegen " + name);
        hp -= damage;
        if (hp <=0) {
           defeated();
        } else {
            System.out.println(name + " heeft nog " + hp + " HP.");
        }
        return hp;
    }

    public void levelUp() {
        System.out.println(name + " is geleveled.");
        damage += levelDamage;
        hp += levelHp;
    }

    public void defeated() {
        System.out.println(name + " is verslagen.");
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getLevelHp() {
        return levelHp;
    }

    public int getLevelDamage() {
        return levelDamage;
    }
}
