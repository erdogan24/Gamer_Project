package gamer_Project;

public class CampaingManager {
	
	public void add(Campaing campaing) {
		
		System.out.println("Kampanya sezonu  baþladý.. :"+ campaing.getCampaingName());
	}
	public void finish(Campaing campaing) {
		
		System.out.println("Kampanya bitti..");
	
	}
	public void update(Campaing campaing) {
		
		System.out.println("Kampanya güncellendi.. :"+ campaing.getCampaingName());
		System.out.println("Yeni kampanya hakkýnda bilgiler :");
		System.out.println("Yeni kampanya adý :" +campaing.getCampaingName());
		System.out.println("Kampanya miktarý :" + campaing.getCampaingAmount());
	
	}
}
	
