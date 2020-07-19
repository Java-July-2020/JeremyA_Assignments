package PhonesPackage;

public class iPhone extends Phone implements Ringable {
    public iPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return "iPhone " + this.getVersionNumber() + " rings " + this.getRingTone();
    }
    @Override
    public String unlock() {
    	return "Unlock";
    }
    @Override
    public void displayInfo() {
    	System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());
    }
}
