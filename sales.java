
//import necessary package 
import java.time.LocalDate;


public class sales{
// Variable declaration
// Private - other class cannot access these variables (data security)
private int transactionID;
private String productName;
private int qty;
private Double priceperunit ;
private String cusName;
private LocalDate date;
private String Category;
private Double totalAmt;

    //parameterized constructor
    public Sales(int transId, String cusName,String Pname,String Category ,int Qty, Double price, LocalDate date){
    
    this.date = date;
    this.transactionID= transId;
    this.cusName = cusName;
    this.productName = Pname;
    this.qty = Qty;
    this.priceperunit = price;
    this.Category= Category;
    }

//Getter and Setter function to access private variables from another class and to make modification
//Getter and Setter function have public access specifier 
//Getter(read) and Setter(write)

     public String getProductName(){
        return productName;
    } 
    public String getcusName(){
        return cusName;
    } 
    public int getTransId(){
        return transactionID;
    }
    public  int getquantity(){
        return qty;
    }
    public Double getPriceperunit(){
        return priceperunit;
    }
    public LocalDate getDate(){
        return date;
    }
    public String getCategory(){
        return Category;
    }
    public  Double getTotalPrice(){
        return qty * priceperunit;
    }

}