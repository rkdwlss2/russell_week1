package f1Team;

public class Entry {
    private String result;
    private int point;
    private boolean retired;
    private int pitstopCount;

    public int performPitstop(){
        point++;
        return point;
    }

    public void setPoint(int point){
        this.point+=point;
    }

    public void retire(boolean status){
        retired=status;
    }

}
