public class Services extends Records{
    public void add(){
        String name = readName("Please enter service");
        int cost = readInt("Please enter service price:$ ");
        super.add(new Service(++id, name, cost));
    }
    
    public Service find(int id){
        return (Service) super.find(id);
    }
}