package vehicle;

public class SafetyCar {
    private String brandName;
    private int lapCounter;
    private int maxSpeed;

    SafetyCar(String brandName,int lapCounter,int maxSpeed){
        this.brandName = brandName;
        this.lapCounter = lapCounter;
        this.maxSpeed = maxSpeed;
    }

    public void deploy(){
        System.out.println("Safety Car has been deployed.");
    }

    public void withdraw(){
        System.out.println("Safety Car withdrawn.");
    }

}
