package homework4;

public class GameManager implements GameService {
	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" oyunu başarıyla sisteme eklenmiştir.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" oyunu başarıyla silinmiştir.");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+"  oyunu başarıyla güncellenmiştir.");

	}

	@Override
	public void sale(Game game, Gamer gamer) {
	System.out.println(game.getGameName()+" oyununun "+gamer.getFirstName()+" müşterisine satışı başarılı.");

	}

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getGameName()+" oyununun "+gamer.getFirstName()+" müşterisine "+campaign.getCampaignName()+ " kampanyasıyla satışı başarılı.");

	}
}