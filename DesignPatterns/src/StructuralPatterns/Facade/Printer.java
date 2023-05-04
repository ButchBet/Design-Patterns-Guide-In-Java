package StructuralPatterns.Facade;

public class Printer {
    private String documentType;
    private String sheet;
    private boolean color;
    private String text;
    
    public Printer() {}

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getSheet() {
        return sheet;
    }

    public void setSheet(String sheet) {
        this.sheet = sheet;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public void print() {
        System.out.println("Printing: " + text + ", type: " + documentType + ", color: " + color + ", sheet: " + sheet);
    }
}
