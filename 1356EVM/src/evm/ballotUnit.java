package evm;
import java.util.ArrayList;
public class ballotUnit {
 ArrayList <Candidate> Participants = new ArrayList<Candidate>();
 
 public void AddCandidate(Candidate can){
	 Participants.add(can);
 }
 
 public void RemoveCandidate(Candidate can){
	 Participants.remove(can);
 }

public ArrayList<Candidate> getParticipants() {
	return Participants;
}

public void setParticipants(ArrayList<Candidate> participants) {
	Participants = participants;
}
 
 
}
