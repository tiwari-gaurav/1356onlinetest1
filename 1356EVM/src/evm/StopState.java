package evm;

public class StopState implements EVMstate{
	public void doAction(Context context) {
	      System.out.println("EVM is in stop state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
}
