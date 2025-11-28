package promowarn.common.io;

public class Logger {
    private String prefix;

    public Logger(String prefix) {
        this.prefix = prefix;
    }

    public Logger() {
        this.prefix = "";
    }
    public void info (String s) {
        System.out.println ("" + " [info] " + "[" + prefix + "]:" + s );
    }

}
