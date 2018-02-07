import java.util.ArrayList;
import java.util.List;

public class thread {
	public static void main(String[] args) {  
		String string="aaa";
		int a=Integer.parseInt(string);
        Object o = new Object() {  
             public boolean equals(Object obj) {  
                 return true; 
         }
     };   
     System.out.println(o.equals("Fred"));
     }
}
