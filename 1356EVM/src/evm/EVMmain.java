package evm;

public class EVMmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 CableConnector cc = new CableConnector("Ponda");
 Candidate candidate1 = new Candidate("Kejriwal",35,"M","Broom");
 cc.AddCandidate(candidate1);
 Candidate candidate2 = new Candidate("Sunanda",40,"F","Bulb");
 cc.AddCandidate(candidate2);
 
 Candidate candidate3 = new Candidate("Ajit",55,"M","Computer");
 cc.AddCandidate(candidate3);
 Context context = new Context();

 StartState startState = new StartState();
 startState.doAction(context);
 System.out.println("=========================");
 System.out.println(cc.Participants);
 System.out.println(context.getState().toString());
 cc.ShowResults();
 
 StopState stopState = new StopState();
 stopState.doAction(context);

 System.out.println(context.getState().toString());
 System.out.println("=========================");

 
}
	}


