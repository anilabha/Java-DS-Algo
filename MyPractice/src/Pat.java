public class Pat 
{ 
    public static void printStars(int n,int b) 
    { 
        int i, j; 
        int c=1;
      
        for(i=0; i<n; i++) 
        { 
        	
        for(j=2*(n-i); j>=0; j--) 
            {           
                System.out.print(" "); 
            } 
            for(j=0; j<=i; j++) 
            {       
            	if (c<=b)
                   System.out.print(c++ +" "); 
            	else 
            		break;
            }           
            System.out.println(); 
        } 
        
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n,10); 
    } 
}