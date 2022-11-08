package Sem4;

import java.util.ArrayList;
import java.util.Date;

/**
 * Класс клиент, отвечающий за взаимодействие с приложением для покупки билетов
 */
public class Customer {
    public int id;
    public Ticket tickets;
    public CashProvider cash;

    /**
     * Метод приобретения билета на автобус
     * 
     * @param ticket
     * @return true, если билет был приобретён успешно
     */
    public boolean buyTicket(Ticket ticket) {
        return true;
    }

    /**
     * Метод поиска билетов
     * @param date
     * @param numberOfTickets
     * @return экземпляр класса Ticket подходящий под условия
     */
    public ArrayList<Ticket> searchTickets(Date date, int routeNumber, int numberOfTickets) {
        ArrayList<Ticket> tickets = new ArrayList<>();
        return tickets;
    }

}
