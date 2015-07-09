package evm;

public class CableConnector extends ballotUnit implements ControlUnit {
 String Constituency="Ponda";

@Override
public int candidateVote(Candidate c) {
	// TODO Auto-generated method stub
	return c.countVote;
}
 
}
