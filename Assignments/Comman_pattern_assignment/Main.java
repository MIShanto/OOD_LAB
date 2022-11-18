package Comman_pattern_assignment;

import java.util.Random;

class Main
{
	public static void main(String[] args)
	{
		RobotSimulator robotSimulator = new RobotSimulator();
		Robot robot = new Robot();


		// Give commands randomly
        for(int i = 0; i < 10; i++)
        {    
            int randomCommand = new Random().nextInt(5);

            switch(randomCommand)
            {
                case 0:
                robotSimulator.takeCommand(new WalkForwardCommand(robot));
                break;

                case 1:
                robotSimulator.takeCommand(new GoBackwardCommand(robot));
                break;

                case 2:
                robotSimulator.takeCommand(new TurnLeftCommand(robot));
                break;

                case 3:
                robotSimulator.takeCommand(new TurnRightCommand(robot));
                break;

                case 4:
                robotSimulator.takeCommand(new StopCommand(robot));
                break;
            }
        }
		

		robotSimulator.executeCommands();
	}
}

