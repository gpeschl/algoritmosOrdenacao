import java.util.Collections;
import java.util.List;

public class Ordena {
	
	//SelectionSort
	 void executarSelectionSort(List<Integer> num) {

		 int aux = 0;
		 
		 int min = 0;
		
		  for (int i = 0; i < num.size() - 1; i++) {
			      
			 	aux = i;
		      
		        for (int j = i + 1; j < num.size(); j++) {
		         
		        	if (num.get(j) < num.get(aux)){
		                aux = j;
		        	}
		           
		         }
		        
		        min = num.get(aux);
	            
	            num.set(aux, num.get(i));
	            
	            num.set(i, min);
		    }
		
		}
	 
	 
	 // BucketSort
	 void executarBucketSort(List<Integer> num) {
	
	        
		 	int aux = 0;
		
		 	int max = Collections.max(num); //pega o maior valor da Lista
			  
			int[] bkt = new int[max + 1]; 
			  
		
			for (int i : bkt){
		    
		       	bkt[i] = 0;
		    
			}
			    
			for (int i = 0; i < num.size(); i++) {
		    
				bkt[num.get(i)]++;
		        
			}

		    for (int i = 0; i < bkt.length; i++) {
		        for (int j = 0; j < bkt[i]; j++) { 
		    
		        	num.set(aux++, i);
		            
		        }
		        
		    }
			  
			  
	 
	 }
		  
	 //Buble Sort
	  void executarBubleSort(List<Integer> num) {
		   
	        int naoClassificado = num.size();
	       
	        while (naoClassificado != 0) {
	        	
	            int ultimaTroca = 0;
	            
	            for (int i = 1; i < naoClassificado; i++) {
	            	
	                if (num.get(i - 1) > num.get(i)) {
	                	
	                    troca(num, i, i - 1);
	                    
	                    ultimaTroca = i;
	                }
	            }
	            
	            naoClassificado = ultimaTroca;
	        }
	    
	   }
	   
	    private static void troca (List<Integer> num, int a, int b) {
	    
	    	Integer temp = num.get(a);
			
			num.set(a, num.get(b));
       
			num.set(b, temp);
	    }

	 //imprimir   
	 void imprimir(List<Integer> num) {
		 
		 if (num.isEmpty()){
			 System.out.println("Lista Vazia");
		 } 
		 
		 else {
		 
		System.out.println(num.toString());
		 
		 }
		
	 }
		 
	 

	
}
