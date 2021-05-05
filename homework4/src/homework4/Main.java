package homework4;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer(1,"Ýrem ","Can","5623","2002");
		Game game=new Game(1,"CS GO",70);
		Campaign campaign=new Campaign(1,"FPS oyunlarý");
		GamerManager gamerManager=new GamerManager(new MernisManager());
		GameManager gameManager=new GameManager();
		gamerManager.register(gamer);
		gamerManager.updateInfo(gamer);
		gamerManager.delete(gamer);
		
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		gameManager.sale(game, gamer);
		gameManager.sale(game, gamer, campaign);
	}

}