package comp3111.la2.ex2;

interface Chargeable{
	public void charge();
}

public class Charger {
	public void charge(Chargeable c) {
		c.charge();
	}

}
