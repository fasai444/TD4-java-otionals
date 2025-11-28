package promowarn.common.io;

public class LogManager {
    public static final Logger getLogger (String prefix) {
        return new Logger(prefix);
    }
}
