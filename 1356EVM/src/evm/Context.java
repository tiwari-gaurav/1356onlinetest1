package evm;

public class Context {
	private EVMstate state;

	   public Context(){
	      state = null;
	   }

	   public void setState(EVMstate state){
	      this.state = state;		
	   }

	   public EVMstate getState(){
	      return state;
	   }
}
