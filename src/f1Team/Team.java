package f1Team;

public class Team {
    private String teamName;
    private int constructorPoint;
    private int budget;

    // 팀포인트 추가
    public void addPoints(int point){
        constructorPoint+=point;
    }

    public void upgradeCar(){
        System.out.println("upgrade front wing");
    }
}
