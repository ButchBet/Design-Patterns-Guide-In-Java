package BehavioralPatterns.State;

public class Phone {
    private House house;
    private String password = "123";
    private boolean let = false;
    
    public Phone(String password) {
        if(password == this.password) {
            house = new House();
            this.let = true;
        }
    }
    
    public void activate() {
        if(let) {
            house.activateAlarm();
        } else {
            System.out.println("You don't have access.");  
        }
    }
    
    public void deactivate() {
        if(let) {
            house.deactivateAlarm();
        } else {
            System.out.println("You don't have access.");
        }
    }
    
    public void state() {
        house.state();
    }
}
