package lesson5;

import java.util.concurrent.CyclicBarrier;

public class Road extends Stage {
    CyclicBarrier cbFromRoad = new CyclicBarrier(4);

    public Road(int length) {

        this.length = length;
        this.description = "Дорога " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            cbFromRoad.await();
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
            System.out.println(c.getName() + " закончил этап: " + description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
