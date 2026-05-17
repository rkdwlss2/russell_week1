package session;

public class Practice {
    private int number;
    private double fatestLaptime;

    public void testSetup(){
        System.out.println("practice setup");
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getFatestLaptime() {
        return fatestLaptime;
    }

    public void setFatestLaptime(double fatestLaptime) {
        this.fatestLaptime = fatestLaptime;
    }
}
