package log4j;

import java.util.Random;

public class ProcessA implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("ProcessA " + i);
            Log4jManagerA.getInstance().getLogger().debug("ProcessA " + i);
            try {
                Thread.sleep(numeroRandom(1000, 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Log4jManagerA.getInstance().close();
    }

    private static int numeroRandom(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
