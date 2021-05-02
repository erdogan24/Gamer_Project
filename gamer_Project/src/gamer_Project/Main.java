package gamer_Project;

public class Main {

	public static void main(String[] args) {
			
		Gamer gamer = new Gamer(24,"2324343545545","Erdoðan ","Akpolat",1998);
		Game game = new Game(23,"Star wars",260);
		Campaing campaing = new Campaing(22,"Yüzde 40 indirim!!",30);
		
		GamerManager gamerManager = new GamerManager();
		GameManager gameManager = new GameManager();
		CampaingManager campaingManager= new CampaingManager();
		SellManager sellManager = new SellManager();
		
		    gamerManager.save(gamer);
	        System.out.println("*********");
	        
	        gameManager.add(game);
	        System.out.println("*********");
	        
	        campaingManager.add(campaing);
	        System.out.println("*********");
	        
	        sellManager.sell(gamer, game);
	        System.out.println("*********");
	        
	        gamer.setFirstName("Erdoðan");
	        gamerManager.update(gamer);
	        System.out.println("*********");
	        
	        campaing.setCampaingAmount(24);
	        campaingManager.update(campaing);
	        System.out.println("*********");
	        
	        game.setCampaignAmount(campaing.getCampaingAmount());
	        gameManager.update(game);
	        System.out.println("*********");
	        
	        sellManager.sell(gamer,game);
	        System.out.println("*********");
	        
	        gameManager.delete(game);
	        System.out.println("*********");
	        
	        gamerManager.delete(gamer);
	        System.out.println("*********");
	        
	        campaingManager.finish(campaing);
	      
	}

}
