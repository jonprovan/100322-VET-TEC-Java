package day04;

public class SportsFan {
	
	private String team;
	
	public SportsFan() {
		team = "Phillies";
	}
	
	public SportsFan(String team) {
		this.team = team;
	}
	
	public String getTeam() {
		return this.team;
	}
	
	public void setTeam(String team) {
		if (team == null || team.isEmpty())
			throw new IllegalArgumentException("Team cannot be empty");
		this.team = team;
	}
	
	@Override
	public String toString() {
		return team + " fan";
	}

}
