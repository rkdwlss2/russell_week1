package f1Team;

public class Driver {
    private String driverName;
    private int championshipPoint;
    private String nationality;
    private int age;

    Driver(String driverName,int championshipPoint,String nationality,int age){
        this.driverName = driverName;
        this.championshipPoint = championshipPoint;
        this.nationality = nationality;
        this.age = age;
    }

    public void setDriverName(String name){
        driverName = name;
    }

    public void setChampionshipPoint(int point){
        championshipPoint = point;
    }

    public void setNationality(String nationality){
        this.nationality = nationality;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getDriverName(){
        return driverName;
    }

    public int getChampionshipPoint(){
        return championshipPoint;
    }

    public String getNationality(){
        return nationality;
    }

    public int getAge(){
        return age;
    }

    // 드라이버 포인트 추가
    public void addPoints(int points){
        championshipPoint+=points;
    }
}
