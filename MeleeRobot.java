public class MeleeRobot extends Robot {

    public MeleeRobot(String name, String type, int maxHealth, int power) {
        super(name, type, maxHealth, power);
    }

    @Override
    public void attack() {
        // implementation for melee robot attack
        System.out.println("Robot " + getName() + " is using a spear to attack");
    }
}
