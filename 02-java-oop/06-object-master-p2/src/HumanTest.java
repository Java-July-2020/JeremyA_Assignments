public class HumanTest {
    public static void main (String[] args) {
        Human homoSapien = new Human();
		System.out.println("homoSapien's Health:" + homoSapien.health);
		
		Wizard azuki = new Wizard();
		System.out.println("Azuki's Health:" + azuki.health);
		System.out.println("Azuki's Intelligence:" + azuki.intelligence);
		
		Ninja atashi = new Ninja();
		System.out.println("Atashi's Health:" + atashi.health);
		System.out.println("Atashi's Stealth:" + atashi.stealth);
		
		Samurai aragoshi = new Samurai();
		System.out.println("Aragoshi's Health:" + aragoshi.health);
		
		azuki.heal(atashi);
		System.out.println("Azuki healed Atashi. Atashi's health: " + atashi.health);
		
		azuki.fireball(aragoshi);
		System.out.println("Azuki shot a fireball at Aragoshi. Aragoshi's health: " + aragoshi.health);
		
		atashi.steal(aragoshi);
		System.out.println("Atashi stole health from Aragoshi. Aragoshi's health: " + aragoshi.health);
		System.out.println("Atashi's new health: " + atashi.health);
		
		atashi.runAway();
		System.out.println("Atashi ran away. Atashi's health: " + atashi.health);
		
		aragoshi.deathBlow(azuki);
		System.out.println("Aragoshi deathblew Azuki. Azuki's health: " + azuki.health);
		System.out.println("Aragoshi's health: " + aragoshi.health);
		
		aragoshi.meditate(aragoshi);
		System.out.println("Aragoshi meditated. Aragoshi's health: " + aragoshi.health);
		
		System.out.println("Samurais: " + aragoshi.howMany());
		

	}
}