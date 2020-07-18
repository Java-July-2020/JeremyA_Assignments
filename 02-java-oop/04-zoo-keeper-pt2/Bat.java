public class Bat {
    int energyLevel = 300;
    public void fly() {
		System.out.println("*Flp*Flp*Flp*");
		energyLevel -= 50;
	}
	public void eatHumans() {
		System.out.println("*Munch*Munch*Munch*");
		energyLevel += 25;
	}
	public void attackTown() {
		System.out.println("*Brnt*Brnt*Brnt*");
		energyLevel -= 100;
    }
    public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
}