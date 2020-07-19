public class Samurai extends Human {
    int samuraiCount = 1;
    public Samurai() {
		health = 200;
		samuraiCount++;
	}
    public void deathBlow(Human user) {
        user.health = 0;
        this.health /= 2;
    }  
    public void meditate(Human user) {
        this.health = this.health + (this.health/2);
    }
    public int howMany() {
        return samuraiCount;
    }        
}