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
    public void assignGuide(GuideSelector guide) {
        this.next.setNext(guide);
    }
}
