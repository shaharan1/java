
package learninheritence;

import learninheritence.mobile.Android;


public class LearnInheritence {

    
    public static void main(String[] args) {
        
        Android android=new Android();
        
        android.setBrowser("Chrome");
        android.setOs("Yes");
        android.setPlaystore("Yes");
        
        
        android.setCall("Yes");
        android.setCamera("Multiple Camera");
        android.setGallery("Photos");
        android.setGames("Yes");
        android.setMessage("Yes");
        
        System.out.println(android);
    }
    
}
