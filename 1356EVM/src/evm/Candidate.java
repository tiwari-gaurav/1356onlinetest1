package evm;

public class Candidate {
String name;
int age;
String sex;
String VoteSymbol;
int countVote;
public Candidate(String name, int age, String sex,String VoteSymbol) {
	super();
	this.name = name;
	this.age = age;
	this.sex = sex;
	this.VoteSymbol= VoteSymbol;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getVoteSymbol() {
	return VoteSymbol;
}
public void setVoteSymbol(String voteSymbol) {
	VoteSymbol = voteSymbol;
}

}
