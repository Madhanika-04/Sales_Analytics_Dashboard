public class salesmanager{
     //Array list to store multiple storage data
     //Arraylist = no fixed size , ordered
    //for search heapmap can be used
    public salesmanager{
    private ArrayList<sales> list = new ArrayList<>();


    // function to add sale
    public void addsale(sales sales){
        list.add(sale);
    }


    public void viewAllSales(){
        if( list.isEmpty()){
            System.out.println("Empty DataBase - No records available");
            return
        }
        for(sales sales : list){
System.out.println("Transaction ID:",sale.getTransId());
System.out.println("Product Name:",sale.getProductName());
System.out.println("Customer Name",sale.getCusName());
System.out.println("Category",sale.getCategory());
System.out.println("Quantity",sale.getquantity());
System.out.println("PricePer",sale.getPriceperunit());
System.out.println("Date of purchase",sale.getDate());
System.out.println("Total Price",sale.getTotalPrice());
        }

    }
    


}
