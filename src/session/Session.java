package session;

public class Session {
    private String date;
    private String weather;

    public void startSession(String grandprixName){
        System.out.println("welcome "+grandprixName+" session");
    }

    public void endSession(){
        System.out.println("end of the session");
    }
}
