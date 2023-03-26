public class RangedRobot extends Robot {

    public RangedRobot(String name, String type, int maxHealth, int power) {
        super(name, type, maxHealth, power);
    }

    @Override
    public void attack() {
        // implementation for ranged robot attack
        System.out.println("Robot " + getName() + " is using sniper to attack");
    }
}
