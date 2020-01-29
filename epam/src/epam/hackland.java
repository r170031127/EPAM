package epam;
import java.util.*;
public class hackland {
     public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt(),i;
	String[] s=new String[n];
	for(i=0;i<n;i++)
	{
		s[i]=sc.next();
	}
	Map<String, Integer> map = new TreeMap<>(Collections.reverseOrder());
    for (String vote : s) {
        if (map.containsKey(vote)) {
            map.put(vote, map.get(vote) + 1);
        } else {
            map.put(vote, 1);
        }
    }
    System.out.println(Collections.max(map.entrySet(), Map.Entry.comparingByValue())
            .getKey());
	sc.close();
}

}
