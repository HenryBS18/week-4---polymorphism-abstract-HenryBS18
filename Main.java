public class Main {
    public static void main(String[] args) {
        // Create robots
        Robot[] componentRobots = {
            new MeleeRobot("Zilong", "melee", 100, 15),
            new MeleeRobot("Alucard", "melee", 100, 17),
            new RangedRobot("Layla", "ranged", 80, 23),
            new RangedRobot("Lesley", "ranged", 80, 25),
            new SupportRobot("Estes", "support", 120, 10, 30)
        };

        // Robots data
        for (Robot robot : componentRobots) {
            System.out.println("Robot " + robot.getName() + ", type: " + robot.getType() + ", health: " + robot.getHealth() + ", power: " + robot.getPower());
        }
        System.out.println();

        // Small Robots move and attack
        System.out.println("Small Robots move and attack:");
        for (Robot componentRobot : componentRobots) {
            componentRobot.move();
            if (componentRobot instanceof MeleeRobot) {
                ((MeleeRobot) componentRobot).attack();
            } 
            else if (componentRobot instanceof RangedRobot) {
                ((RangedRobot) componentRobot).attack();
            } 
            else if (componentRobot instanceof SupportRobot) {
                ((SupportRobot) componentRobot).heal();
            }
            System.out.println();
        }

        // Create Large Robot
        CentralBrain centralBrain = new CentralBrain("Transformer", 0, 0, componentRobots);

        // Combine Small Robot into Large Robot
        centralBrain.combine();
        System.out.println("Robot " + centralBrain.getName() + " health: " + centralBrain.getHealth());
        System.out.println("Robot " + centralBrain.getName() + " power: " + centralBrain.getPower());
        System.out.println();

        // Large robot move, attack, defend and heal
        System.out.println("Robot " + centralBrain.getName() + " move, attack, defend and heal:");
        centralBrain.move();
        centralBrain.attack();
        centralBrain.defend();
        centralBrain.heal();
        System.out.println();

        // Large robot seperate into smaller robot
        System.out.println("Large robot seperate into smaller robot:");
        centralBrain.separate();
        System.out.println();

        System.out.println("Enemy Defeated!");
    }
}
