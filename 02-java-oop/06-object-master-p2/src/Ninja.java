public class Ninja extends Human{
    public Ninja() {
	    stealth = 10;
            }
    public void steal(Human user) {
        user.health -= this.stealth;
        this.health += this.health;
    }  
    public void runAway() {
        this.health -= 10;
	}         
}