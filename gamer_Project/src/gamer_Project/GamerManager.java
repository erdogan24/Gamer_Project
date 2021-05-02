package gamer_Project;

public class GamerManager {
	public void save(Gamer gamer){
		System.out.println("Kayýt yapan kiþi : "+ gamer.getFirstName()+" "+gamer.getLastName());
	}
	public void update(Gamer gamer) {
		
		System.out.println("Bilgiler güncelleniyor..");
		System.out.println("Ad  ve soyad giriniz :"+ gamer.getFirstName()+" "+gamer.getLastName());
		System.out.println("Doðum yýlý giriniz : "+ gamer.getBirthYear());
		System.out.println("Tc no giriniz : "+ gamer.getNationalIdentity());
	}
	public void delete(Gamer gamer) {
		System.out.println("Kaydý silinen kiþi :"+ gamer.getFirstName()+" "+ gamer.getLastName());
		
	}

}
