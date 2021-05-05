package homework4;

public class GamerManager implements GameService {
	private ValidationService validationService;

	public GamerManager(ValidationService validationService) {
		this.validationService = validationService;
	}

	public void register(Gamer gamer) {
		if (validationService.ValidatePerson(gamer)) {
			System.out.println(gamer.getFirstName() + " kay�t ba�ar�l�.");
		} else {
			System.out.println(" Do�rulama ba�ar�s�z.");
		}

	}

	public void updateInfo(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" kay�t g�ncelleme ba�ar�l�.");

	}

	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" silme i�lemi ba�ar�l�.");

	}
}