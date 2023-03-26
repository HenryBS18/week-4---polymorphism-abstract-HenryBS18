public class MeleeRobot extends Robot {

    // Constructor
    public MeleeRobot(String name, String type, int maxHealth, int power) {
        super(name, type, maxHealth, power);
    }

    // Override attack method
    @Override
    public void attack() {
        System.out.println("Robot " + getName() + " is using a spear to attack");
    }
}
