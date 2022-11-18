package Comman_pattern_assignment;

public class WalkForwardCommand implements Command
{
    Robot robot;

    WalkForwardCommand(Robot robot)
    {
        this.robot = robot;
    }

    @Override
    public void execute() 
    {
        robot.WalkForward();
        
    }
    
}
