public class SupportRobot extends Robot {
    // Declare variables
    private int healingPower;

    // Constructor
    public SupportRobot(String name, String type, int maxHealth, int power, int healingPower) {
        super(name, type, maxHealth, power);
        this.healingPower = healingPower;
    }

    // Getter and Setter
    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    // Override move method
    @Override
    public void move() {
        System.out.println("Robot " + getName() + " is moving to allies location");
    }

    // Override attack method
    @Override
    public void attack() {
        System.out.println("Robot " + getName() + " is using a stun gun to immobilize ");
    }

    // Override heal method
    public void heal() {
        System.out.println("Robot " + getName() + " is using magic spell to heal allies");
    }
}
