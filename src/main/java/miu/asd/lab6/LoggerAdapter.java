package miu.asd.lab6;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerAdapter implements LoggerUtil {
  private static final Logger logger = LogManager.getLogger(LoggerUtil.class);

  public LoggerAdapter(){};

  @Override
  public void log(LogLevel logLevel, String message) {
    if(logLevel.equals(LogLevel.ERROR))
      logger.error("error... " + message);
    else if(logLevel.equals(LogLevel.INFO))
      logger.info("info... " + message);
    else if(logLevel.equals(LogLevel.DEBUG))
      logger.debug("debugging... " + message);
    else if(logLevel.equals(LogLevel.FATAL))
      logger.fatal("fatal... " + message);
    else if(logLevel.equals(LogLevel.WARNING))
      logger.warn("warning... " + message);
    else
      logger.trace("trace..." + message);
  }
}
