package org.agoncal.book.javaee7.chapter13.ex04;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@Stateless
public class InventoryEJB04 {

    // ======================================
    // =             Attributes             =
    // ======================================

    @PersistenceContext(unitName = "chapter13PU")
    private EntityManager em;

    // ======================================
    // =           Public Methods           =
    // ======================================

    public void oneItemSold(Item04 item) throws InventoryLevelTooLowException04 {
        item.decreaseAvailableStock();
        sendShippingMessage();

        if (inventoryLevel(item) == 0)
            throw new InventoryLevelTooLowException04();
    }

    private void sendShippingMessage() {
        // Send a message
    }

    private int inventoryLevel(Item04 item) {
        return 0;
    }
}