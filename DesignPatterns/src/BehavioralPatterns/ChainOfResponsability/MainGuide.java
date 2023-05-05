package BehavioralPatterns.ChainOfResponsability;

public class MainGuide implements GuideSelector {
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
        if(age > 17) {
            System.out.println("Assigning the main guide.");
        }
    }
}
