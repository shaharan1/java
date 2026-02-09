package learninheritence.mobile;

public class Mobile {

    private String call;
    private String message;
    private String games;
    private String camera;
    private String gallery;

    public Mobile() {
    }

    public Mobile(String call, String message, String games, String camera, String gallery) {
        this.call = call;
        this.message = message;
        this.games = games;
        this.camera = camera;
        this.gallery = gallery;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getGallery() {
        return gallery;
    }

    public void setGallery(String gallery) {
        this.gallery = gallery;
    }

    @Override
    public String toString() {
        return "Mobile{" + "call=" + call + ", message=" + message + ", games=" + games + ", camera=" + camera + ", gallery=" + gallery + '}';
    }
    
    
    

}
