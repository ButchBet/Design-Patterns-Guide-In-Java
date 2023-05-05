package BehavioralPatterns;

import BehavioralPatterns.ChainOfResponsability.ChainOfResponsability;
import java.util.Scanner;

public class Behavioral {
    public Behavioral() {}
    
    static Scanner cmd = new Scanner(System.in);
    
    public void main() throws CloneNotSupportedException {
        char op = ' ';
        
        do {      
            System.out.println("");
            
            // Show possible options
            System.out.println("What do you want to prove?.");
            
            System.out.println("1: Chain of responsability.");
            
            System.out.println("2. Strategy.");
            
            System.out.println("3. State.");
            
            System.out.println("4. Iterator.");
            
            System.out.println("Other. Get back.");
            
            String proveOp = cmd.nextLine();
            
            if(proveOp.length() == 1) {
                op = proveOp.charAt(0);
            } else {
                op = 'e';                
            }
            
            rooter(op);
        } while(op == '1' || op == '2' || op == '3' || op == '4');
    }
    
    public void rooter(char op) throws CloneNotSupportedException{
        System.out.println("");
        switch(op){
            case '1':
                ChainOfResponsability chainOfResponsability = new ChainOfResponsability();
                
                chainOfResponsability.main();
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            default:
                System.out.println("Getting back...");
                break;
        }
    }
}
