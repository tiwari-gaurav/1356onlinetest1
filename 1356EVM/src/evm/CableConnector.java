package evm;

public class CableConnector extends ballotUnit implements ControlUnit {
 String Constituency="Ponda";
 int voted,voters;

@Override
public int candidateVote(Candidate c) {
	// TODO Auto-generated method stub
	return c.countVote;
}
 /*public boolean OnballotButton(){
	 System.out.println("Ballot Button Color: Blue");
	
 }*/

public CableConnector(String constituency) {
	super();
	Constituency = constituency;
}
 public void ShowResults(){
	 Candidate cd;
	 System.out.println("=========================");
	 for(int i=0;i<Participants.size();i++){
		 cd= Participants.get(i);
		 System.out.printf("Candidate:" +cd.name+ " " + "Age:" +cd.age+ " " + "Sex:" +cd.sex+ " " + "VoteSymbol:" +cd.VoteSymbol);
		 System.out.printf("\n");
		 
		 System.out.println("=========================");
	 }
 }
}
