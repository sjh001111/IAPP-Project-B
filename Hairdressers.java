public class Hairdressers extends Records{
    public void add(){
        String name = readName("Please enter hairdresser");
        super.add(new Hairdresser(++id, name));
    }
    
    public Hairdresser find(int id){
        return (Hairdresser) super.find(id);
    }
}