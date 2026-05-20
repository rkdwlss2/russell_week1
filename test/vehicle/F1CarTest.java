import org.junit.jupiter.api.Test;
import vehicle.F1Car;

import java.io.IOException;

class F1CarTest {

    @Test
    void pitRaceConditionTest()
            throws InterruptedException, IOException {

        F1Car car = new F1Car();
        car.recruitF1Driver("noris");

        Runnable enterTask = () -> {

            for (int i = 0; i < 1000; i++) {
                car.enterPit();
            }
        };

        Runnable exitTask = () -> {

            for (int i = 0; i < 1000; i++) {
                car.exitPit();
            }
        };

        Thread t1 =
                new Thread(enterTask, "ENTER-1");

        Thread t2 =
                new Thread(enterTask, "ENTER-2");

        Thread t3 =
                new Thread(exitTask, "EXIT-1");

        Thread t4 =
                new Thread(exitTask, "EXIT-2");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("테스트 종료");
    }
}