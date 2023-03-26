public abstract class Robot {
    // Declare variables
    private String name;
    private String type;
    private int health;
    private int maxHealth;
    private int power;

    // Constructor
    public Robot(String name, String type, int maxHealth, int power) {
        this.name = name;
        this.type = type;
        this.health = maxHealth;
        this.maxHealth = maxHealth;
        this.power = power;
    }

    // Getter and Setter 
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getPower() {
        return power;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setPower(int power) {
        this.power = power;
    }

    // Move function to move robots to enemy location
    public void move() {
        System.out.println("Robot " + name + " is moving to enemy location.");
    }

    // Attack function to attack enemy
    public void attack() {
        System.out.println("Robot " + name + " is attacking an enemy.");
    }

    // Defend function to defend against enemy's attack
    public void defend() {
        System.out.println("Robot " + name + " is defending against an enemy attack.");
    }

    // Heal function to heal the robots
    public void heal() {
        System.out.println("Robot " + name + " is healing itself.");
    }
}
