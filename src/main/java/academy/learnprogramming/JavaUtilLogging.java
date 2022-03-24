package academy.learnprogramming;

import java.util.logging.Logger;

public class JavaUtilLogging {

    private static final Logger logger = Logger.getLogger(JavaUtilLogging.class.getPackage().getName());

    public static void main(String[] args) {
        //System.out.println("Logging from java.util.logging");
        logger.info("Logging from java.util.logging");
    }
}
