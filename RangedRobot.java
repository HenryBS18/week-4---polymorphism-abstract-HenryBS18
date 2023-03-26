public class RangedRobot extends Robot {

    public RangedRobot(String name, String type, int maxHealth, int power) {
        super(name, type, maxHealth, power);
    }

    @Override
    public void attack(Robot robot) {
        // implementation for ranged robot attack
        System.out.println(getName() + " is shooting a projectile at " + robot.getName());
        robot.setHealth(robot.getHealth() - getPower());
    }
}
