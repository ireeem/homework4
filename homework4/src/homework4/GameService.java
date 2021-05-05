package homework4;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	void sale(Game game,Gamer gamer);
	void sale(Game game,Gamer gamer,Campaign campaign);
}
