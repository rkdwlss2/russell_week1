package f1Team;

public class Entry {
    private String result;
    private int point;
    private boolean retired;
    private int pitstopCount;


    public int performPitstop(){
        setPoint(getPoint() + 1);
        return getPoint();
    }

    public void setPoint(int point){
        this.point+=point;
    }

    public void retire(boolean status){
        setRetired(status);
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getPoint() {
        return point;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public int getPitstopCount() {
        return pitstopCount;
    }

    public void setPitstopCount(int pitstopCount) {
        this.pitstopCount = pitstopCount;
    }
}
