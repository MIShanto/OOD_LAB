package Comman_pattern_assignment;

import java.util.*;

public class RobotSimulator
{
    private List<Command> commandList = new ArrayList<Command>(); 

    public void takeCommand(Command command)
    {
      commandList.add(command);		
    }

   public void executeCommands()
   {
   
      for (Command command : commandList) 
      {
        command.execute();
      }
      
      commandList.clear();
   }
}
