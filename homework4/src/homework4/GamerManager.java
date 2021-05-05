package homework4;

public class GamerManager implements GameService {
	private ValidationService validationService;

	public GamerManager(ValidationService validationService) {
		this.validationService = validationService;
	}

	public void register(Gamer gamer) {
		if (validationService.ValidatePerson(gamer)) {
			System.out.println(gamer.getFirstName() + " kayýt baþarýlý.");
		} else {
			System.out.println(" Doðrulama baþarýsýz.");
		}

	}

	public void updateInfo(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" kayýt güncelleme baþarýlý.");

	}

	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" silme iþlemi baþarýlý.");

	}
}