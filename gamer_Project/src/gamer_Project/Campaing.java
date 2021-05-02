package gamer_Project;

public class Campaing {
	private int id ;
	private String campaingName;
	private int campaingAmount;
	
	public Campaing(int id, String campaingName, int campaingAmount) {
		this.id = id;
		this.campaingName = campaingName;
		this.campaingAmount = campaingAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public int getCampaingAmount() {
		return campaingAmount;
	}

	public void setCampaingAmount(int campaingAmount) {
		this.campaingAmount = campaingAmount;
	}
	

}
