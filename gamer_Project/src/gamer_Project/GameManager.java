package gamer_Project;

public class GameManager {
		public void add(Game game) {
			System.out.println("Eklenen Oyun :"+ game.getName());
		}
		public void delete(Game game) {
			System.out.println("Silinen Oyun :"+game.getName());
		}
		public void update(Game game) {
			System.out.println("G�ncellenen Oyun :"+game.getName());
		}

}
