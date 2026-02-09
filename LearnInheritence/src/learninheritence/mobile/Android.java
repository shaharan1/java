package learninheritence.mobile;

public class Android extends Mobile{

    private String playstore;
    private String os;
    private String browser;

    public Android() {
    }

    public Android(String playstore, String os, String browser) {
        this.playstore = playstore;
        this.os = os;
        this.browser = browser;
    }

    public Android(String playstore, String os, String browser, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.playstore = playstore;
        this.os = os;
        this.browser = browser;
    }

    public String getPlaystore() {
        return playstore;
    }

    public void setPlaystore(String playstore) {
        this.playstore = playstore;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    
    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Android{" + "playstore=" + playstore + ", os=" + os + ", browser=" + browser + '}';
    }

  

    
}
