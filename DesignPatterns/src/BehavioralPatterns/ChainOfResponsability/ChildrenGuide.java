package BehavioralPatterns.ChainOfResponsability;

public class ChildrenGuide implements GuideSelector{
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
        if(age < 12) {
            System.out.println("Assigning the childre's guide.");
        } else {
            this.next.assignGuide(age);
        }
    }
}
