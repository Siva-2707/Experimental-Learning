
public class AdapterPatternDemo {

	public static void main(String[] args) {
		DVDPlayer player = new SivaDVDPlayer();
		GameAdapterForDVDPlayer adapter = new GameAdapterForDVDPlayer(player);
		adapter.playGame();
	}

}

interface GamingConsole{
	public void insertCD();
	public void playGame();
}

interface DVDPlayer{
	public void insertDisk();
	public void playMovie();
}

class PS2 implements GamingConsole{

	@Override
	public void insertCD() {
		System.out.println("Inserting Game Cd");
		
	}

	@Override
	public void playGame() {
		System.out.println("Playing game");		
	}
	
}

class SivaDVDPlayer implements DVDPlayer{
	public SivaDVDPlayer() {
		System.out.println("Siva's DVD player is getting used");
	}
	@Override
	public void insertDisk() {
		System.out.println("Inserting disk into Siva's DVD player");
	}

	@Override
	public void playMovie() {
		System.out.println("Playing movie");
		
	}
	
}

class GameAdapterForDVDPlayer implements GamingConsole {
	
	private DVDPlayer dvdPlayer;
	public GameAdapterForDVDPlayer(DVDPlayer dvdPlayer) {
		System.out.println("Using Adapter for Playing movies in GamingConsole");
		this.dvdPlayer = dvdPlayer;
	}

	@Override
	public void insertCD() {
		dvdPlayer.insertDisk();
	}

	@Override
	public void playGame() {
		dvdPlayer.playMovie();
	}
	
	
	
	
}