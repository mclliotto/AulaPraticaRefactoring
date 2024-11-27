public abstract class Statement {

    public abstract String value(Customer aCustomer);
 
    public String statement(Customer aCustomer) {
       return value(aCustomer);
    }
 }
 