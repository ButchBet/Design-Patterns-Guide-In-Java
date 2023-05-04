package StructuralPatterns.Facade;

public class FacadeNormalPrinter {
    public Printer printer;
    
    public FacadeNormalPrinter(String text) {
        this.printer = new Printer();
        
        printer.setDocumentType("PDF");
        printer.setSheet("A4");
        printer.setColor(true);
        printer.setText(text);
    }
    
    public void print() {
        printer.print();
    }
}
