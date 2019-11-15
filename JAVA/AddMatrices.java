class AddMatrices{  
    	public static void main(String args[]){  
    	//creating two matrices    
    	int a[][]={{1,3,4},{2,5,7},{3,8,15}};    
    	int b[][]={{18,13,49},{22,42,93},{1,20,4}};    
        
    	    
    	int c[][]=new int[3][3]; 
        
    	    
    	for(int i=0;i<3;i++){    
    		for(int j=0;j<3;j++){    
    			c[i][j]=a[i][j]+b[i][j];   
    			System.out.print(c[i][j]+"	");    
   	 }    
   	 System.out.println(); 
   }    
}} 
