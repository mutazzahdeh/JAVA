public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        // your code here
    	return super.getringTone();
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unloking via finger print";
    }
    @Override
    public void displayInfo() {
        // your code here   
        System.out.println("Version Number: " + this.getVersionNumber());
        System.out.println("Batter Percentage: " + this.getBatteryPercentage());
        System.out.println("Carrier: " + this.getCarrier());
        System.out.println("RingTone: " + this.getringTone());
    	
    }
}