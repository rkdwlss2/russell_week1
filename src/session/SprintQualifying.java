package session;

public class SprintQualifying {
    private int totalLap;
    private int currentLap;

    public void overtake(){
        System.out.println("push push overtake mode");
    }

    public void performPitStop(){
        System.out.println("pit in BOX BOX");
    }

    public int getTotalLap() {
        return totalLap;
    }

    public void setTotalLap(int totalLap) {
        this.totalLap = totalLap;
    }

    public int getCurrentLap() {
        return currentLap;
    }

    public void setCurrentLap(int currentLap) {
        this.currentLap = currentLap;
    }
}
