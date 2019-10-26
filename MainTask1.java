public class MainTask1 {

        public static void main(String[] args) {
            Robot robot = new Robot();
            robot.work();
            CoffeRobot coffeRobot = new CoffeRobot();
            coffeRobot.work();
            RobotCoocker robotCoocker = new RobotCoocker();
            robotCoocker.work();
            RobotDancer robotDancer = new RobotDancer();
            robotDancer.work();

            Robot[] robots = new Robot[4];
            robots[0] = robot;
            robots[1] = coffeRobot;
            robots[2] = robotCoocker;
            robots[3] = robotDancer;

            for (Robot r : robots) {
                r.work();
            }
        }
    }
