package Ex_16_Threads;

import java.util.Date;

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
        Date start = new Date();

        while ((new Date().getTime() - start.getTime()) < 30_000L) {
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
    }
}
