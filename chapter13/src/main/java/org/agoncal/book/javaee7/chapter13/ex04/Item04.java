package org.agoncal.book.javaee7.chapter13.ex04;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@MappedSuperclass
public class Item04 {

    // ======================================
    // =             Attributes             =
    // ======================================
    @Id
    @GeneratedValue
    protected Long id;
    protected String title;
    protected Float price;
    protected String description;
    protected Integer availableInStock;

    // ======================================
    // =            Constructors            =
    // ======================================

    public Item04() {
    }

    public Item04(String title, Float price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    // ======================================
    // =          Getters & Setters         =
    // ======================================

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAvailableInStock() {
        return availableInStock;
    }

    public void setAvailableInStock(Integer availableInStock) {
        this.availableInStock = availableInStock;
    }

    public void decreaseAvailableStock() {
        if (availableInStock == null)
            availableInStock = 0;
        availableInStock--;
    }

    public void increaseAvailableStock() {
        if (availableInStock == null)
            availableInStock = 0;
        availableInStock++;
    }
}