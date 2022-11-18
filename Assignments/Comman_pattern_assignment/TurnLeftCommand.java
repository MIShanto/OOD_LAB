package Comman_pattern_assignment;

public class TurnLeftCommand implements Command
{
    Robot robot;

    TurnLeftCommand(Robot robot)
    {
        this.robot = robot;
    }

    @Override
    public void execute() 
    {
        robot.TurnLeft();
        
    }
    
}
