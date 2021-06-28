public class IntegerReaderExeption extends RuntimeException {


    public IntegerReaderExeption(String message) {
        super(message);
    }

    public IntegerReaderExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public IntegerReaderExeption(Throwable cause) {
        super(cause);
    }

    public IntegerReaderExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
