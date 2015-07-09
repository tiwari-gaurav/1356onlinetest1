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
 		
}
