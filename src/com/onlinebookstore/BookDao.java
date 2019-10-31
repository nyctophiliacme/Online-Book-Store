/*

 */
package com.onlinebookstore;

import java.sql.Date;


public interface BookDao {
    public boolean addBook(Book b);

    public boolean updatePrice(Book b, double price);

    public boolean updateQty(Book b, int qty);

    public boolean updateNextStock(Book b, Date date);

// Calling procedure to add employee using callable stmt....works only in ORACLE DB and not in Derby
//  public boolean addEmpProc(Emp e);
}
