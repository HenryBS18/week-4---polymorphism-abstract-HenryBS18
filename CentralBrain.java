public class CentralBrain extends Robot implements CombiningRobot {
    // Declare variables
    private Robot[] componentRobots;

    // Constructor
    public CentralBrain(String name, int maxHealth, int power, Robot[] componentRobots) {
        super(name, "central brain", maxHealth, power);
        this.componentRobots = componentRobots;
    }

    // Getter and Setter
    public Robot[] getComponentRobots() {
        return componentRobots;
    }

    public void setComponentRobots(Robot[] componentRobots) {
        this.componentRobots = componentRobots;
    }

    // Override move method
    @Override
    public void move() {
        System.out.println("Robot " + getName() + " is moving the whole robot.");
    }

    // Override attack method
    @Override
    public void attack() {
        System.out.println("Robot " + getName() + " is using an ultimate to attack enemy");
    }

    // Override defend method
    @Override
    public void defend() {
        System.out.println("Robot " + getName() + " is using shield to defend");
    }

    // Override heal method
    @Override
    public void heal() {
        System.out.println("Robot " + getName() + " is healing itself.");
    }

    // Override combine method
    @Override
    public void combine() {
        System.out.println("Robot " + getName() + " is combining the robots.");
        setMaxHealth(0);
        setHealth(0);
        setPower(0);
        for (Robot componentRobot : componentRobots) {
            setMaxHealth(getMaxHealth() + componentRobot.getMaxHealth());
            setHealth(getHealth() + componentRobot.getHealth());
            setPower(getPower() + componentRobot.getPower());
        }
    }

    // Override seperate method
    @Override
    public void separate() {
        System.out.println("Robot " + getName() + " is separating the robots.");
        for (Robot componentRobot : componentRobots) {
            componentRobot.setHealth(getHealth() * componentRobot.getMaxHealth() / getMaxHealth());
        }
        setMaxHealth(0);
        setHealth(0);
        setPower(0);
    }
}
