public class RangedRobot extends Robot {

    // Constructor
    public RangedRobot(String name, String type, int maxHealth, int power) {
        super(name, type, maxHealth, power);
    }

    // Override attack method
    @Override
    public void attack() {
        System.out.println("Robot " + getName() + " is using sniper to attack");
    }
}
