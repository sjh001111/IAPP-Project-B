public class Customers extends Records{
    public void add(){
        String name = readName("Please enter customer");
        super.add(new Customer(++id, name));
    }
    
    public Customer find(int id){
        return (Customer) super.find(id);
    }
}