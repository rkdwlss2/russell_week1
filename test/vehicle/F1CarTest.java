import org.junit.jupiter.api.Test;
import vehicle.F1Car;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


class F1CarTest {

    @Test
    void pitRaceConditionTest()
            throws InterruptedException, IOException {

        // Given
        F1Car car = new F1Car();
        car.recruitF1Driver("noris");

        Runnable enterTask = () -> {

            for (int i = 0; i < 1000; i++) {
                car.enterPit();
            }
        };


        Thread t1 =
                new Thread(enterTask, "ENTER-1");

        Thread t2 =
                new Thread(enterTask, "ENTER-2");

        // When
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("테스트 종료");

        //Then
        assertEquals(1,car.getPitInSuccessCount().get());
    }

    @Test
    void pitRaceConditionCountTest()
            throws InterruptedException, IOException {

        // Given
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

        // When
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        System.out.println("테스트 종료 피트인 갯수 : "+car.getPitInSuccessCount().get());

        //Then
        assertTrue(
                car.getPitInSuccessCount().get() > 0
        );
    }
}