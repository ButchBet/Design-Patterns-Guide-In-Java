package StructuralPatterns.Facade;

public class Facade {
    public Facade() {}
    
    public void main() {
        FacadeNormalPrinter text1 = new FacadeNormalPrinter("text1");
        
        FacadeNormalPrinter text2 = new FacadeNormalPrinter("text2");
        
        Printer text3 = new Printer();
        
        text3.setDocumentType("Exel");
        text3.setSheet("A2");
        text3.setColor(false);
        text3.setText("text3");
        
        text1.print();
        text2.print();
        text3.print();
    }
}
