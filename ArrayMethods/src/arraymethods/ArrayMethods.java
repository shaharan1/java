
package arraymethods;


public class ArrayMethods {

    
    public static void main(String[] args) {
        
        
    }
    
    public static void sumMiliDimentionArray(int[][] myArray){
    int sum=0;
    
    for(int row[]:myArray){
    for(int col:row){
    sum +=col;
    }
    }
        System.out.println(sum);  
        
        
    }
}
