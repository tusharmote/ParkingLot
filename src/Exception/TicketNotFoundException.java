package Exception;

public class TicketNotFoundException extends Exception{
    public TicketNotFoundException() {
    }

    public TicketNotFoundException(String message) {
        super(message);
    }
}
