package designpatterns;

import BehavioralPatterns.Behavioral;
import CreativePatterns.Creative;
import StructuralPatterns.Structural;
import java.util.Scanner;

public class DesignPatterns {
    static Scanner cmd = new Scanner(System.in);
    
    public static void main(String[] args) throws CloneNotSupportedException {
        char op = ' ';
        
        do {      
            System.out.println("");
            
            // Show possible options
            System.out.println("What do you want to prove?.");
            
            System.out.println("1: Creative.");
            
            System.out.println("2. Structural.");
            
            System.out.println("3. Behavioral.");
            
            System.out.println("Other. Exit.");
            
            String proveOp = cmd.nextLine();
            
            if(proveOp.length() == 1) {
                op = proveOp.charAt(0);
            } else {
                op = 'e';                
            }
            
            rooter(op);
        } while(op == '1' || op == '2' || op == '3');
    }
    
    public static void rooter(char op) throws CloneNotSupportedException {
        switch(op){
            case '1':
                Creative creative = new Creative();
                
                creative.main();
                break;
            case '2':
                Structural structural = new Structural();
                
                structural.main();
                break;
            case '3':
                Behavioral behavioral = new Behavioral();
                
                behavioral.main();
                break;
            default:
                System.out.println("Exiting...");
        }
    }
}
