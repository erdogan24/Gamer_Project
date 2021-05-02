package gamer_Project;

public class SellManager {
	public void sell(Gamer gamer,Game game) {
		Sell sell = new Sell(2,gamer.getFirstName()+" "+gamer.getLastName(),game.getName());
				
		System.out.println(game.getName()+" isimli oyun "+gamer.getFirstName()+" "+gamer.getLastName()
				+" kiþi tarafýndan "+ " % "+ game.getCampaignAmount()+" indirimle "+game.getPriceBeforeCampaign()
				+" türk lirasý karþýlýðýnda satýn alýnmýþtýr..");		
				
		
		System.out.println("Satýþ bilgileri :");
		System.out.println("****************");
		System.out.println("Satýþ Id :"+sell.getId());
		System.out.println("Satýlan Oyun :"+sell.getGameName());
		System.out.println("Satýn alan kiþi :"+sell.getGamerName());
	}
	
	

}
