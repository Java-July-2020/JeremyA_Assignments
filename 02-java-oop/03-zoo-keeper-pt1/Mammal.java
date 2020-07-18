public class Mammal {
	int energyLevel;

	public Mammal() {
		energyLevel = 9000;
	}

	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
}