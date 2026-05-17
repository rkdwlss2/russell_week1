package f1Team;

public class Team {
    private String teamName;
    private int constructorPoint;
    private int budget;

    // 팀포인트 추가
    public void addPoints(int point){
        setConstructorPoint(getConstructorPoint() + point);
    }

    public void upgradeCar(){
        System.out.println("upgrade front wing");
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getConstructorPoint() {
        return constructorPoint;
    }

    public void setConstructorPoint(int constructorPoint) {
        this.constructorPoint = constructorPoint;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
