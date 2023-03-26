public class RobotClient {
    public static void main(String[] args) {
        // create component robots
        Robot[] componentRobots = {
            new MeleeRobot("Melee 1", "melee", 100, 50),
            new MeleeRobot("Melee 2", "melee", 100, 50),
            new RangedRobot("Ranged 1", "ranged", 80, 70),
            new RangedRobot("Ranged 2", "ranged", 80, 70),
            new SupportRobot("Support 1", "support", 120, 50, 50)
        };

        for (Robot robot : componentRobots) {
            System.out.println(robot.getName() + " type: " + robot.getType() + ", health: " + robot.getHealth() + ", power: " + robot.getPower());
        }
        System.out.println();

        // demonstrate movement and communication of smaller robots
        System.out.println("Demonstrating movement and communication of smaller robots:");
        for (Robot componentRobot : componentRobots) {
            componentRobot.move();
            if (componentRobot instanceof MeleeRobot) {
                ((MeleeRobot) componentRobot).attack();
            } else if (componentRobot instanceof RangedRobot) {
                ((RangedRobot) componentRobot).attack();
            } else if (componentRobot instanceof SupportRobot) {
                ((SupportRobot) componentRobot).heal(componentRobot);
            }
            System.out.println();
        }

        // create central brain
        CentralBrain centralBrain = new CentralBrain("Transformer", 0, 0, componentRobots);

        // combine component robots into a larger robot
        centralBrain.combine();
        System.out.println(centralBrain.getName() + " health: " + centralBrain.getHealth());
        System.out.println(centralBrain.getName() + " power: " + centralBrain.getPower());
        System.out.println();

        // demonstrate movement and attack of larger robot
        System.out.println("Demonstrating movement and attack of larger robot:");
        centralBrain.move();
        centralBrain.attack();
        System.out.println();

        centralBrain.defend();
        System.out.println();

        centralBrain.heal(centralBrain);
        System.out.println();

        // demonstrate separation of larger robot into component robots
        System.out.println("Demonstrating separation of larger robot into component robots:");
        centralBrain.separate();
        System.out.println();

        System.out.println("Enemy Defeated!");
    }
}
