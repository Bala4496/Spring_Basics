package ua.bala.spring_rest.exception_handler;

import java.rmi.NoSuchObjectException;

public class NoSuchEmployeeException extends NoSuchObjectException {
    /**
     * Constructs a <code>NoSuchObjectException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since 1.1
     */
    public NoSuchEmployeeException(String s) {
        super(s);
    }
}
