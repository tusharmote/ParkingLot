package Repository;

import Models.Ticket;

import java.util.HashMap;
import Exception.TicketNotFoundException;

public class TicketRepository {
    private HashMap<Integer, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }
    public Ticket get(int ticketId) throws TicketNotFoundException {
        Ticket ticket=ticketMap.get(ticketId);
        if(ticket==null){
            throw new TicketNotFoundException("Ticket not fount at id "+ ticketId);
        }
        return ticket;
    }
    public Ticket put(Ticket ticket){
        ticketMap.put(ticket.getId(),ticket);
        return ticket;
    }

}