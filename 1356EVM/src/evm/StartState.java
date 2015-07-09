package evm;

public class StartState implements EVMstate{
	public void doAction(Context context) {
	      System.out.println("EVM is in start state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Start State";
	   }
}
