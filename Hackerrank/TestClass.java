	import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ){      
        int N;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        int arr[] = new int[N];
        ArrayList even = new ArrayList();
        ArrayList odd = new ArrayList();
        ArrayList list = new ArrayList();
        
       
        for(int i = 0; i < N; i++){
        	arr[i] = in.nextInt();
        }
         int evenSum = 0; 
        int oddSum = 0;
        for(int i = 0; i < N; i++){
        	if(arr[i] % 2 == 0){
        		even.add(arr[i]);
        		evenSum= evenSum + arr[i]; 
        	}else{
        		odd.add(arr[i]);
        		oddSum= oddSum + arr[i]; 
        	}
        }
        even.add(evenSum);
        odd.add(oddSum); 
        Collections.sort(even);
        Collections.sort(odd);
        list.addAll(even);
        list.addAll(odd);
        Iterator itr= list.iterator();  
 		while(itr.hasNext()){  
  			 System.out.println(itr.next());
 		}
    }
}

