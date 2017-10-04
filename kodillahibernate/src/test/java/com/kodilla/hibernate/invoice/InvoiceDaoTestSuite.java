package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ItemDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Red dead Redemption 2");
        Product product2 = new Product("Mario Odyssey");
        Item item1 = new Item(product1,new BigDecimal(280.99),1);
        Item item2 = new Item(product2, new BigDecimal(250.99),2);
        Invoice invoice1 = new Invoice("25");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);



        BigDecimal price1 = invoice1.getItems().get(0).getPrice();
        int quantity1 = invoice1.getItems().get(0).getQuantity();
        BigDecimal value1 = invoice1.getItems().get(0).getValue();

        BigDecimal price2 = invoice1.getItems().get(1).getPrice();
        int quantity2 = invoice1.getItems().get(1).getQuantity();
        BigDecimal value2 = invoice1.getItems().get(1).getValue();

        //Then
        Assert.assertEquals(new BigDecimal(280.99), price1);
        Assert.assertEquals(1, quantity1);

        Assert.assertEquals(new BigDecimal(250.99), price2);
        Assert.assertEquals(2, quantity2);


        //Cleanup
        try {
            productDao.delete(invoice1.getItems().get(0).getId());
            productDao.delete(invoice1.getItems().get(1).getId());
            itemDao.delete(invoice1.getItems().get(0).getId());
            itemDao.delete(invoice1.getItems().get(1).getId());
        } catch (Exception e) {
            System.out.println("entities not found");
        }
        }
}
