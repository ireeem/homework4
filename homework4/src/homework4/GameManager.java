package homework4;

public class GameManager implements GameService {
	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" oyunu baþarýyla sisteme eklenmiþtir.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" oyunu baþarýyla silinmiþtir.");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+"  oyunu baþarýyla güncellenmiþtir.");

	}

	@Override
	public void sale(Game game, Gamer gamer) {
	System.out.println(game.getGameName()+" oyununun "+gamer.getFirstName()+" müþterisine satýþý baþarýlý.");

	}

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getGameName()+" oyununun "+gamer.getFirstName()+" müþterisine "+campaign.getCampaignName()+ " kampanyasýyla satýþý baþarýlý.");

	}
}