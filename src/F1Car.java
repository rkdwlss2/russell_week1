import java.io.IOException;
import java.util.Scanner;

public class F1Car extends Car {
    String driverName;
    double lapTime; // 퀄리파이 레이싱 기록

    F1Car() throws IOException {
        super();
        setF1car();
    }

    public void Print(){
        super.Print();
        System.out.println("드라이버이름 : "+driverName);
        System.out.println("엔진제조사 : "+engineManufacturer);
        System.out.println("laptime : "+lapTime);
    }

    public void setF1car(){
        System.out.println("드라이버명 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        driverName = sc.nextLine();

        System.out.println("주행기록 정수로 입력하세요: ");
        lapTime = sc.nextDouble();
    }
}
