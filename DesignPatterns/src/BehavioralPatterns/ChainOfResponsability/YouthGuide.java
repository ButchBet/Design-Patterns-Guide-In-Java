package BehavioralPatterns.ChainOfResponsability;

public class YouthGuide implements GuideSelector {
    private GuideSelector next;
    
    @Override
    public GuideSelector getNext() {
        return next;
    }
    
    @Override
    public void setNext(GuideSelector next) {
        this.next = next;
    }
    
    @Override
    public void assignGuide(int age) {
        if(age > 12 && age < 18) {
            System.out.println("Assigning te youth guide.");
        } else {
            next.assignGuide(age);
        }
    }
}
