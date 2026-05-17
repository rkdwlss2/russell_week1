package vehicle;

public class SafetyCar {
    private String brandName;
    private int lapCounter;
    private int maxSpeed;

    SafetyCar(String brandName,int lapCounter,int maxSpeed){
        this.setBrandName(brandName);
        this.setLapCounter(lapCounter);
        this.setMaxSpeed(maxSpeed);
    }

    public void deploy(){
        System.out.println("Safety Car has been deployed.");
    }

    public void withdraw(){
        System.out.println("Safety Car withdrawn.");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getLapCounter() {
        return lapCounter;
    }

    public void setLapCounter(int lapCounter) {
        this.lapCounter = lapCounter;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
