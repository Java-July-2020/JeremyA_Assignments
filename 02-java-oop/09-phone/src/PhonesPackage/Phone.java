package PhonesPackage;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    public abstract void displayInfo();
    
    public void setVerionNumber(String number) {
    	this.versionNumber = number;
    }
    
    public String getVersionNumber() {
    	return this.versionNumber;
    }
    
    public void setbatteryPercentage(int number) {
    	this.batteryPercentage = number;
    }
    
    public int getbatteryPercentage() {
    	return this.batteryPercentage;
    }
    
    public void setCarrier(String carrier) {
    	this.carrier = carrier;
    }
    
    public String getCarrier() {
    	return this.carrier;
    }
    
    public void setRingTone(String ringtone) {
    	this.ringTone = ringtone;
    }
    
    public String getRingTone() {
    	return this.ringTone;
    }
}