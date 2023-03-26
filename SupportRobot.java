public class SupportRobot extends Robot {
    private int healingPower;

    public SupportRobot(String name, String type, int maxHealth, int power, int healingPower) {
        super(name, type, maxHealth, power);
        this.healingPower = healingPower;
    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    @Override
    public void move() {
        System.out.println("Robot " + getName() + " is moving to allies location");
    }

    @Override
    public void attack() {
        // implementation for support robot attack
        System.out.println("Robot " + getName() + " is using a stun gun to immobilize ");
    }

    public void heal(Robot robot) {
        // implementation for support robot heal
        System.out.println("Robot " + getName() + " is using magic spell to heal allies");
        int newHealth = robot.getHealth() + healingPower;
        if (newHealth > robot.getMaxHealth()) {
            newHealth = robot.getMaxHealth();
        }
        robot.setHealth(newHealth);
    }
}
