package evm;

public class EVMmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 CableConnector cc = new CableConnector("Ponda");
 Candidate candidate1 = new Candidate("Kejriwal",35,"M","Broom");
 Candidate candidate2 = new Candidate("Sunanda",40,"F","Bulb");
 
 Context context = new Context();

 StartState startState = new StartState();
 startState.doAction(context);

 System.out.println(context.getState().toString());

 

 
}
	}


