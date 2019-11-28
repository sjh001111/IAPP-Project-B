public class Service extends Record{
    private int cost;
    
    public Service(int id, String name, int cost){
        super(id, name);
        this.cost = cost;
    }
    
    public String toString(){
        return "Service: " + id + " " + name + " cost $ " + cost;
    }
    
    public int getCost(){
        return cost;
    }
}