import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class program1 {
	public static void main(String[] args) {
		program1 classgrades = new program1();
		classgrades.printClasslist();
		classgrades.printClassList2();

}
Map<String,String> classgrades = new HashMap<String,String>();
public program1() 
{
classgrades.put("Bob", "A");
classgrades.put("Mary", "C");
classgrades.put("Sarah","B");
classgrades.put("philip","A");
classgrades.put("greg","F");
}

public void printClasslist()
{
Iterator<Entry<String,String>> entries = classgrades.entrySet().iterator();
while (entries.hasNext())
{
Entry<String,String> entry = entries.next();
System.out.println("KEY = " +entry.getKey() + " ,VALUE = " + entry.getValue());
}
}


public void printClassList2() {
	for (Map.Entry<String,String> entry : classgrades.entrySet()) {
      System.out.println("key = " + entry.getKey() + " , value = " + entry.getValue());
	}
	
	
for ( String key : classgrades.keySet()) {
	System.out.println(" Key = " + key);
	}


for (String value : classgrades.values()) {
System.out.println(" value = " + value);	
}
}
public static void main1(String[] args) {
	program1 myClassList = new program1();
	myClassList.printClasslist();
}

}


