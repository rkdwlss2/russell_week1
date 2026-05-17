package f1Team;

public class Engineer {
    private String name;
    private String role;

    public void checkEnginestatus(){
        System.out.println("perfect engine status");
    }

    public void pitIn(){
        System.out.println("pit in BOX BOX");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
