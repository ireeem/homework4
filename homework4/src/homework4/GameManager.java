package homework4;

public class GameManager implements GameService {
	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+" oyunu ba�ar�yla sisteme eklenmi�tir.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+" oyunu ba�ar�yla silinmi�tir.");

	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+"  oyunu ba�ar�yla g�ncellenmi�tir.");

	}

	@Override
	public void sale(Game game, Gamer gamer) {
	System.out.println(game.getGameName()+" oyununun "+gamer.getFirstName()+" m��terisine sat��� ba�ar�l�.");

	}

	@Override
	public void sale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getGameName()+" oyununun "+gamer.getFirstName()+" m��terisine "+campaign.getCampaignName()+ " kampanyas�yla sat��� ba�ar�l�.");

	}
}