package gamer_Project;

public class GamerManager {
	public void save(Gamer gamer){
		System.out.println("Kay�t yapan ki�i : "+ gamer.getFirstName()+" "+gamer.getLastName());
	}
	public void update(Gamer gamer) {
		
		System.out.println("Bilgiler g�ncelleniyor..");
		System.out.println("Ad  ve soyad giriniz :"+ gamer.getFirstName()+" "+gamer.getLastName());
		System.out.println("Do�um y�l� giriniz : "+ gamer.getBirthYear());
		System.out.println("Tc no giriniz : "+ gamer.getNationalIdentity());
	}
	public void delete(Gamer gamer) {
		System.out.println("Kayd� silinen ki�i :"+ gamer.getFirstName()+" "+ gamer.getLastName());
		
	}

}
