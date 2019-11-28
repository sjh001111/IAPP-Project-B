//S119

import java.util.*;
public class Records
{
    protected LinkedList<Record> records = new LinkedList<Record>();
    protected int id = 0;
    protected void add(Record record)
    {
        records.add(record);
    }

    public Record find(int id)
    {   
        for(Record record : records)
        {  
            if (record.matches(id))
                return record;  
        }
        return null;    
    } 

    public int readInt(String message)
    {   
        System.out.print("\t" + message);
        return In.nextInt();    
    }

    public String readName(String message)
    {   
        System.out.print("\t" + message + " Name: ");
        return In.nextLine();    
    }

    public int size()
    {   
        return records.size();    
    }

    public void show()
    {
        for(Record record : records)
        {
            record.show();
        }
    }
}
