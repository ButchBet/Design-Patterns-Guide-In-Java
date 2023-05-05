package BehavioralPatterns.ChainOfResponsability;

public interface GuideSelector {
    public GuideSelector getNext();
    public void setNext(GuideSelector next);
    public void assignGuide(int age);
}
