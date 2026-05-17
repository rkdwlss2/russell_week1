package session;

public class Qualifying {
    private int currentRound;

    public void startRound(){
        System.out.println("start Qualifying");
    }

    public void setGridPosition(int position){
        System.out.println("set position "+position);
    }

    public void eliminateDriver(){
        System.out.println("retired driver");
    }


}
