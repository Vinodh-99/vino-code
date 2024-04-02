package JavaCoursse;

import java.util.*;

public class task
{
	public static void main(String[] args) 
	{
		String [] sa= {"Java","Python","Angular","Python","CSS","HTML","Java","Java"};
		Map<String, Integer> m = new HashMap<>();
		for(String s:sa)
		{
			m.put(s,m.getOrDefault(s,0)+1);
		}
		System.out.println("Word count "+m);
		
	}
}
