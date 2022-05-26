package log4j;

import org.apache.log4j.Logger;

public class MainLog4j {
    static Logger log = Logger.getLogger(MainLog4j.class);

    public static void main(String[] args) {

        log.info("This is Logger Info");

        Thread threadA = new Thread(new ProcessA());
        Thread threadB = new Thread(new ProcessB());

        threadA.start();
        threadB.start();

    }
}

