public class Wizard extends Human{
    public Wizard() {
        health = 50;
        intelligence = 8;
            }
    public void heal(Human user) {
		user.health += this.intelligence;
	}  
    public void fireball(Human user) {
		user.health -= this.intelligence * 3;
	}     
}