//S119
import java.util.LinkedList;

public class Root
{
    private Hairdressers hairdressers;
    private Customers customers;
    private Services services;
    private LinkedList<Booking> bookings = new LinkedList<Booking>();
    private int bookingId = 1;

    public Root()
    {
        hairdressers = new Hairdressers();
        customers = new Customers();
        services = new Services();
        menu(); 
    }

    private void menu()
    {
        char action = readAction();
        switch (action)
        {
            case 'H': hairdressers(); break;
            case 'C': customers(); break;
            case 'S': services(); break;
            case 'B': booking(); break;
            case 'R': report(); break;
            case 'X': exit(); break;
        }
    }

    private char readAction()
    {
        System.out.print("Please enter your choice (H, C, S, B, R, X): ");
        return In.nextUpperChar();
    }

    private void hairdressers()
    {
        hairdressers.add();
        menu();
    }

    private void customers()
    {
        customers.add();
        menu();
    }

    private void services()
    {
        services.add();
        menu();
    }

    private void booking(){
        int hairdresserId = readId("Hairdresser");
        Hairdresser hairdresser = hairdressers.find(hairdresserId);
        int customerId = readId("Customer");
        Customer customer = customers.find(customerId);
        int serviceId = readId("Service");
        Service service = services.find(serviceId);
        bookings.add(new Booking(bookingId++, hairdresser, customer, service));
        menu();
    }

    private int readId(String message){
        System.out.print("\t" + message + "id: ");
        return In.nextInt();
    }

    private void report(){
        System.out.println("Hairdressers");
        hairdressers.show();
        System.out.println("Customers");
        customers.show();
        System.out.println("Services");
        services.show();
        System.out.println("Bookings");
        
        for(Booking booking : bookings)
        {
            booking.show();
        }
        menu();
    }

    private void exit()
    {
        System.out.println("Goodbye");
    }

    public String toString(){
        return "";
    }
}
