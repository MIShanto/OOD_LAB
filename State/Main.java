package State;

public class Main 
{
    public static void main(String[] args) 
    {
        AlertStateContext stateContext = new AlertStateContext();
        
        stateContext.setState(new Vibration());

		stateContext.alert();
		stateContext.alert();

		stateContext.setState(new Silent());

		stateContext.alert();
		stateContext.alert();
		stateContext.alert();	    
    }
}
