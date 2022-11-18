package Comman_pattern_assignment;

public class GoBackwardCommand implements Command
{
    Robot robot;

    GoBackwardCommand(Robot robot)
    {
        this.robot = robot;
    }

    @Override
    public void execute() 
    {
        robot.GoBackward();
        
    }
    
}