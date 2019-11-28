public class Booking{
    private int id;
    private Hairdresser hairdresser;
    private Customer customer;
    private Service service;
    
    public Booking(int id, Hairdresser hairdresser, Customer customer, Service service){
        this.id = id;
        this.hairdresser = hairdresser;
        this.customer = customer;
        this.service = service;
    }
    
    public String toString(){
        return id + " Hairdresser: " + hairdresser.getName() + " Customer: " + customer.getName() + " Service: " + service.getName() + " cost $" + service.getCost();
    }
    
    public void show(){
        System.out.println("\t" + toString());  
    }
}