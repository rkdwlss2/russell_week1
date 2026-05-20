package vehicle;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class F1Car extends Car implements Runnable{
    private String brandName;
    private String drs;
    private String upgradeDate;
    private final AtomicBoolean isInfit = new AtomicBoolean(false);
    private String driverName;
    private double lapTime; // 퀄리파이 레이싱 기록

    public F1Car() throws IOException {
        super();
        setF1car();
    }

    public void Print(){
        super.Print();
        System.out.println("드라이버이름 : "+ getDriverName());
        System.out.println("엔진제조사 : "+engineManufacturer);
        System.out.println("laptime : "+ getLapTime());
    }

    public void setF1car(){
        System.out.println("드라이버명 입력하세요: ");
        Scanner sc = new Scanner(System.in);
        setDriverName(sc.nextLine());

        System.out.println("주행기록 정수로 입력하세요: ");
        setLapTime(sc.nextDouble());
    }

    public void enterPit(){
        boolean success = isInfit.compareAndSet(false,true);
        if (success){
            System.out.println(driverName+" pit in");
        }
    }

    public void exitPit(){
        boolean success = isInfit.compareAndSet(true,false);
        if (success){
            System.out.println(driverName+" pit out");
        }
    }

    public void verifyWeight(){
        System.out.println("this car is verifying Weight");
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getDrs() {
        return drs;
    }

    public void setDrs(String drs) {
        this.drs = drs;
    }

    public String getUpgradeDate() {
        return upgradeDate;
    }

    public void setUpgradeDate(String upgradeDate) {
        this.upgradeDate = upgradeDate;
    }



    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getLapTime() {
        return lapTime;
    }

    public void setLapTime(double lapTime) {
        this.lapTime = lapTime;
    }

    @Override
    public void run() {
        drive();
    }
}
