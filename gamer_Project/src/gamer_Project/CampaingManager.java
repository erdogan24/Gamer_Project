package gamer_Project;

public class CampaingManager {
	
	public void add(Campaing campaing) {
		
		System.out.println("Kampanya sezonu  ba�lad�.. :"+ campaing.getCampaingName());
	}
	public void finish(Campaing campaing) {
		
		System.out.println("Kampanya bitti..");
	
	}
	public void update(Campaing campaing) {
		
		System.out.println("Kampanya g�ncellendi.. :"+ campaing.getCampaingName());
		System.out.println("Yeni kampanya hakk�nda bilgiler :");
		System.out.println("Yeni kampanya ad� :" +campaing.getCampaingName());
		System.out.println("Kampanya miktar� :" + campaing.getCampaingAmount());
	
	}
}
	
