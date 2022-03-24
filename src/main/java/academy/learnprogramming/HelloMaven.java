package academy.learnprogramming;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


public class HelloMaven {
    private final static Log logger= LogFactory.getLog(HelloMaven.class);

    public static void main(String[] args) {
        //System.out.println("Hello Maven");
        logger.info("Hello Maven");
    }
}
