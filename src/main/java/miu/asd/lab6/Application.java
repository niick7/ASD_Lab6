package miu.asd.lab6;

public class Application {
  public static void main(String[] args){
    LoggerAdapter adapter = new LoggerAdapter();
    adapter.log(LogLevel.DEBUG, "debug");
    adapter.log(LogLevel.FATAL, "fatal");
    adapter.log(LogLevel.ERROR, "error");
    adapter.log(LogLevel.WARNING, "warning");
    adapter.log(LogLevel.INFO, "info");
    adapter.log(LogLevel.TRACE, "trace");
  }
}
