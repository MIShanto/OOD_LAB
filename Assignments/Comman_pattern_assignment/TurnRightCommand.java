package Comman_pattern_assignment;

public class TurnRightCommand implements Command
{
    Robot robot;

    TurnRightCommand(Robot robot)
    {
        this.robot = robot;
    }

    @Override
    public void execute() 
    {
        robot.TurnRight();
        
    }
    
}
