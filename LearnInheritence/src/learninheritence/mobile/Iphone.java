package learninheritence.mobile;

public class Iphone extends Mobile{

    private String os;
    private String applestore;
    private String facetime;

    public Iphone() {
    }

    public Iphone(String os, String applestore, String facetime) {
        this.os = os;
        this.applestore = applestore;
        this.facetime = facetime;
    }

    public Iphone(String os, String applestore, String facetime, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.os = os;
        this.applestore = applestore;
        this.facetime = facetime;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getApplestore() {
        return applestore;
    }

    public void setApplestore(String applestore) {
        this.applestore = applestore;
    }

    public String getFacetime() {
        return facetime;
    }

    public void setFacetime(String facetime) {
        this.facetime = facetime;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Iphone{" + "os=" + os + ", applestore=" + applestore + ", facetime=" + facetime + '}';
    }

    

    
}
