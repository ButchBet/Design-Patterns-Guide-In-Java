package BehavioralPatterns.ChainOfResponsability;

public class Tourism implements GuideSelector {
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
        ChildrenGuide cGuide = new ChildrenGuide();        
        YouthGuide yGuide = new YouthGuide();
        MainGuide mGuide = new MainGuide();
        
        this.setNext(cGuide);
        cGuide.setNext(yGuide);
        yGuide.setNext(mGuide);
        
        next.assignGuide(age);
    }
}
