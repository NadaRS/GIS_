package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class InvoiceHeader {
    private int invoiceNum =1;
    private Date invoiceDate;
    private String customerName;
    private ArrayList<String> aL;
    private Object invHeaderArray;



    public int getInvoiceNum() {

        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {

        this.invoiceNum += invoiceNum;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = new Date();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    void setInvHeaderArray() {
        Scanner s = null;
        ArrayList<String> aL = null;
        try {
            s = new Scanner(new File("InvoiceHeader.csv"));
            aL = new ArrayList<String>();
            while (s.hasNext()) {
                aL.add(s.next());
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            s.close();
        }
        invHeaderArray = aL.toArray();
    }

    public Object getInvHeaderArray() {
        return invHeaderArray;
    }
}
