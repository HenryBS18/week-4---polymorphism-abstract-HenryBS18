public class MeleeRobot extends Robot {
    private int armor;

    public MeleeRobot(String name, String type, int maxHealth, int power) {
        super(name, type, maxHealth, power);
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    @Override
    public void attack(Robot robot) {
        // implementation for melee robot attack
        System.out.println(getName() + " is using a sword to attack " + robot.getName());
        robot.setHealth(robot.getHealth() - (getPower() - ((MeleeRobot) robot).getArmor()));
    }
}
