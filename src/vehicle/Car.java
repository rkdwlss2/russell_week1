package vehicle;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Car extends Vehicle {
    private String engineManufacturer;
    private int speed;
    private static final Map<String ,String> engineMap = new HashMap<>();
    static {
        engineMap.put("ferrari","mercedes power unit");
        engineMap.put("mercedes","mercedes power unit");
        engineMap.put("alphine","mercedes power unit");
        engineMap.put("williams","mercedes power unit");
        engineMap.put("mclaren","mercedes power unit");
        engineMap.put("redbull","redbull power unit");
        engineMap.put("visacash","redbull power unit");
    }
    Car() throws IOException {
        //super();
        // setCar();
    }

    public void setCar(){
        // 특정 제조사는 엔진이 동일하기 때문에 아래와 같이 제조사 명에 따라 엔진을 선택하였습니다.
        String teamName = super.getName().toLowerCase();
        // 보유한 팀이면
        if (engineMap.containsKey(teamName)){
            engineManufacturer = engineMap.get(teamName);
        }
        else{
            // 이외의 제조사인 경우 직접 입력
            setEnginemanu();
        }
    }

    public void Print(){
        super.Print();
        System.out.println("팀명 : "+ getEngineManufacturer());
    }

    public void setEnginemanu(){
        // 이외의 제조사인 경우 엔진 입력
        System.out.println("엔진제조사명 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        engineManufacturer = sc.next();
    }
    public void drive(){
        setSpeed(getSpeed() + 10);
        System.out.println("자동차 주행중입니다 속도 :"+ getSpeed());
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getEngineManufacturer() {
        return engineManufacturer;
    }
}