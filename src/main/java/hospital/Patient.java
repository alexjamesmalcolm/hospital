package hospital;

public class Patient implements Bleedable {

	static final int DEFAULT_BLOOD = 256;
	private int blood = DEFAULT_BLOOD;

	public int getBloods() {
		return blood;
	}

	public void removeBlood() {
		blood--;
	}

	public void removeBlood(int amount) {
		blood -= amount;
	}

}
