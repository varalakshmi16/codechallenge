import java.util.Map;
import java.util.TreeMap;

public class Main 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> englishFB=new TreeMap<String,Integer>();
		englishFB.put("Ram",90);
		englishFB.put("Kukku",78);
		englishFB.put("Lachu",81);
		englishFB.put("Devan",89);
		englishFB.put("Pappi",77);
		
		
		Map<String,Integer> mathsFB=new TreeMap<String,Integer>();
		mathsFB.put("Losliya",90);
		mathsFB.put("Santi",78);
		mathsFB.put("Ram",81);
		mathsFB.put("Nakul",85);
		mathsFB.put("Pappi",90);
		
		
				
		System.out.println(ProgramCode.getFeedback(englishFB, mathsFB));		
	}
}
