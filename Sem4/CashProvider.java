package Sem4;

/**
 * Класс контрагента, отвечающего за оплату билетов
 */
public class CashProvider {
    public long card;
    public boolean isAuthorized;

    /**
     * Метод, удостоверяющий клиента
     * @param customer
     * @return
     */
    public boolean authorization(Customer customer) {
        return isAuthorized;
    }

    /** 
     * Метод, осуществляющий оплату билета(ов)
     */
    public void buyTicket(int price) {
        if (isAuthorized) {
            
        }
    }

}
