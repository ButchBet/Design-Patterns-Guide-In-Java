package BehavioralPatterns.ChainOfResponsability;

public interface GuideSelector {
    public void getNext();
    public void setNext(GuideSelector guideSelector);
}
