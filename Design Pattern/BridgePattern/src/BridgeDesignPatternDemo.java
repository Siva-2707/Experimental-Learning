
public class BridgeDesignPatternDemo {

	public static void main(String[] args) {
		
		//The bridge pattern enables decoupling
		Tv sony = new Sony(new LGRemote());
		
		sony.play();
		sony.increaseVolume();
		sony.decreaseVolume();
		
	}

}

abstract class Tv{
	protected Remote remote;
	public Tv(Remote remote) {
		this.remote = remote;
	}
	abstract void play();
	 void increaseVolume() {
		 remote.increaseVolume();
	 }
	 void decreaseVolume() {
		 remote.decreaseVolume();
	}
}

abstract class Remote {
	abstract void increaseVolume();
	abstract void decreaseVolume();
}

class Sony extends Tv{

	public Sony(Remote remote) {
		super(remote);
	}

	@Override
	void play() {
		System.out.println("Playing Sony TV");
		
	}
	
}


class LG extends Tv{

	public LG(Remote remote) {
		super(remote);
	}

	@Override
	void play() {
		System.out.println("Playing LG TV");
		
	}
	
}


class SonyRemote extends Remote{

	@Override
	void increaseVolume() {
		System.out.println("Increasing volume using sony remote");
	}

	@Override
	void decreaseVolume() {
		System.out.println("Decreasing volume using sony Remote");
	}
	
}

class LGRemote extends Remote{

	@Override
	void increaseVolume() {
		System.out.println("Increasing volume using LG remote");
	}

	@Override
	void decreaseVolume() {
		System.out.println("Decreasing volume using LG remote");
	}
	
}