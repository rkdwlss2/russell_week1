package f1Team;

public class Driver {
    private String driverName;
    private int championshipPoint;
    private String nationality;
    private int age;

    // 드라이버 포인트 추가
    public void addPoints(int points){
        championshipPoint+=points;
    }
}
