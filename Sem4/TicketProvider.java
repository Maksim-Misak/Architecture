package Sem4;

import java.util.ArrayList;

/**
 * Класс автобусного парка, предоставляющий билеты
 */
public class TicketProvider {

    /**
     * Метод передающий купленные билеты
     * @param routeNumber
     * @param numberOfTickets
     * @return купленный билет(ы)
     */
    public ArrayList<Ticket> getTickets(int routeNumber, int numberOfTickets) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        return tickets;
    }
    /**
     * Метод обновляющий информацию о доступных билетах
     * @param ticket
     * @return
     */
    public boolean updateTickets(Ticket ticket) {
        return true;
    }

}
