package Comman_pattern_assignment;

public class StopCommand implements Command
{
    Robot robot;

    StopCommand(Robot robot)
    {
        this.robot = robot;
    }

    @Override
    public void execute() 
    {
        robot.Stop();
        
    }
    
}
