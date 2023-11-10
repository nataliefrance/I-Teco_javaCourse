package Ex_16_Threads;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Road {
    private int person = 0;
    private int car = 0;


    public void incrementPersons() {
        try {
            while (true) {
                Thread.sleep(2000L);
                person++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void incrementCars() {
        try {
            while (true) {
                Thread.sleep(5000L);
                car++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void startMoving() {
        LocalTime startTime = LocalTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Начинаем работу: " + dtf.format(startTime));

        while ((LocalTime.now().isBefore(startTime.plusSeconds(30)))) {
            if (person >= 4) {
                System.out.println("Светофор для пешеходов включён");
                person = 0;
            }
            if (car >= 3) {
                System.out.println("Светофор для машин включён");
                car = 0;
            }
        }
        System.out.println("Светофор выключился");
        LocalTime endTime = LocalTime.now();
        System.out.println("Завершили работу: " + dtf.format(endTime));
        System.exit(0);
    }
}
