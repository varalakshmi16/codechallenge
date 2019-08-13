import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProgramCode 
{
	public static Map<String,Integer> getFeedback(Map<String,Integer> english,Map<String,Integer> maths)
	{
		//Write a program to create a map contain feedback of all english and maths teachers together.
		//If the teacher teaches both subjects , add the maximum FB in the final map. 
	
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		Set<String> keyset1=english.keySet();
		Set<String> keyset2=maths.keySet();
		
		for(String s1:keyset1)
		{
			map.put(s1,english.get(s1));
		}

		for(String s2:keyset2)
		{
			if(map.containsKey(s2))				
			{			
				if(english.get(s2) > maths.get(s2))
				{
					map.put(s2, english.get(s2));
				}
				else
				{
					map.put(s2, maths.get(s2));
				}
			}
			else{
				map.put(s2, maths.get(s2));
			}
	
		}
		
		return map;
	}
}
