package org.agoncal.book.javaee7.chapter12.ex06;

import org.agoncal.book.javaee7.chapter12.Book;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@Named("myBean")
@RequestScoped
public class BookController06 {

  private Book book = new Book();

  public String doCreateBook() {
    createBook(book);
    return "listBooks.xhtml";
  }

  private void createBook(Book book) {
  }

  // Constructors, getters, setters
}
