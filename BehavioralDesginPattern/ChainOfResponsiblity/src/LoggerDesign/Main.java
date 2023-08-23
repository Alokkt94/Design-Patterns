package LoggerDesign;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));

        logProcessor.log(1,"This is Log level");
        logProcessor.log(2,"This is Debug level");
        logProcessor.log(3,"This is Error Level");
    }
}
