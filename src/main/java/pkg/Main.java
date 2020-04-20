package pkg;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        final Level VIOLATION = Level.getLevel("VIOLATION");
        final Level REQUEST = Level.getLevel("REQUEST");
        for (int i = 1; i <= n; i++) {
            logger.log(VIOLATION, "Zöld erdőben jártam,");
            logger.info("Kék ibolyát láttam,");
            logger.warn("El akart hervadni,");
            logger.log(REQUEST, "Szabad-e locsolni?");
            logger.fatal("Igen!");
            try {
                Thread.sleep(10); // egy kis késleltetés
            } catch (InterruptedException e) {}
        }
    }
}