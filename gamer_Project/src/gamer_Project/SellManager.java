package gamer_Project;

public class SellManager {
	public void sell(Gamer gamer,Game game) {
		Sell sell = new Sell(2,gamer.getFirstName()+" "+gamer.getLastName(),game.getName());
				
		System.out.println(game.getName()+" isimli oyun "+gamer.getFirstName()+" "+gamer.getLastName()
				+" ki�i taraf�ndan "+ " % "+ game.getCampaignAmount()+" indirimle "+game.getPriceBeforeCampaign()
				+" t�rk liras� kar��l���nda sat�n al�nm��t�r..");		
				
		
		System.out.println("Sat�� bilgileri :");
		System.out.println("****************");
		System.out.println("Sat�� Id :"+sell.getId());
		System.out.println("Sat�lan Oyun :"+sell.getGameName());
		System.out.println("Sat�n alan ki�i :"+sell.getGamerName());
	}
	
	

}
