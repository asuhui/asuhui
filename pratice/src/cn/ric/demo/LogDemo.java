package cn.ric.demo;


import org.apache.log4j.Logger;

public class LogDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("LogDemo");
        // trace<debug<info<warn<error<fatal
        logger.trace("trade level");
        logger.debug("debug level");
        logger.info("info level");
        logger.warn("warn level");
        logger.error("error level");
        logger.fatal("fatal level");
    }
}
