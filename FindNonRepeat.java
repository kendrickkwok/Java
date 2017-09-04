import java.lang.*;
import java.util.HashMap;
import java.util.Map;

public class FindNonRepeat {
	
        public static void main (String args[])
        {
            System.out.println(findNonRepeat("abcdefghabdefgh"));
        }
        
	public static void matrix (int rows, int columns) {

	}
        
        public static char findNonRepeat(String str)
        {
            Map<Character, Integer> mp = new HashMap<Character, Integer>();
            
            for(char value: str.toCharArray())
            {
                if(mp.containsKey(value))
                {
                    mp.put(value, mp.get(value)+ 1);
                }
                else
                {
                    mp.put(value, 1);
                }
            }
            
            for(Map.Entry<Character, Integer> value : mp.entrySet())
            {
                /*
                if (value.getValue() == 1)
                {
                    return value.getKey();                   
                }
                */
                System.out.println(value.getKey());
            }
            
            return 'n';
        }
}
        