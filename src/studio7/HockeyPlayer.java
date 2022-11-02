package studio7;

public class HockeyPlayer {

	private String name;
	private int num;
	private boolean right;
	private boolean ambi;
	private int goals;
	private int assists;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public HockeyPlayer() {
		this.name = "";
		this.num = 0;
		this.right = false;
		this.ambi = false;
		this.goals = 0;
		this.assists = 0;
	}
	
	public HockeyPlayer(String name, int num, boolean right, boolean ambi, int goals, int assists) {
		this.name = name;
		this.num = num;
		this.right = right;
		this.ambi = ambi;
		this.goals = goals;
		this.assists = assists;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isAmbi() {
		return ambi;
	}

	public void setAmbi(boolean ambi) {
		this.ambi = ambi;
	}

	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getAssists() {
		return assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int points(int goalNum, int assistNum) {
		setGoals(getGoals()+goalNum);
		setAssists(getAssists()+assistNum);
		return getGoals()+getAssists();
	}
	
	@Override
	public String toString() {
		return "HockeyPlayer [name=" + name + ", num=" + num + ", right=" + right + ", ambi=" + ambi + ", goals="
				+ goals + ", assists=" + assists + "]";
	}
	
	
	
	

}
