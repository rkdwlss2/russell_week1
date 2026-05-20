package vehicle;

import java.io.IOException;
import java.util.Scanner;

public class Car extends Vehicle {
    String engineManufacturer;
    private int speed;
    Car() throws IOException {
        //super();
        // setCar();
    }

    public void setCar(){
        // 특정 제조사는 엔진이 동일하기 때문에 아래와 같이 제조사 명에 따라 엔진을 선택하였습니다.
        if (super.name.equals("ferrari")||super.name.equals("mercedes")||super.name.equals("alphine")||super.name.equals("williams")||super.name.equals("mclaren")){
            engineManufacturer="mercedes power unit";
        }else if (super.name.equals("redbull")||super.name.equals("visacash")){
            engineManufacturer="redbull power unit";
        }
        else{
            // 이외의 제조사인 경우 직접 입력
            setEnginemanu();
        }
    }

    public void Print(){
        super.Print();
        System.out.println("팀명 : "+ engineManufacturer);
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
}