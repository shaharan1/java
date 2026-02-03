
package searchingarray2;


public class SearchingArray2 {

    
    public static void main(String[] args) {
       
     int numbers[]={50,60,40,12,25,78,95,14,36,25,56,89,10,9};   
//      int search=99;
         int search=25;
//      boolean status=false;
//      
//      for(int i=0;i<numbers.length;i++){
//          System.out.println("Your Searching No Found in Index"+i);
//          status=true;
//          if(numbers)

//      }


        int finalResult=linearSearch(numbers, search);
        System.out.println(finalResult);
    }
    
    public static int linearSearch(int[]array,int saerchNumer){
    
        int result=-1;
        for(int i=0;i<array.length;i++){
        if(array[i]==saerchNumer){
        result=i;
        break;
        }
        }
        return result;
    }
}
