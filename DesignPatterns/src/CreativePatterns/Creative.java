package CreativePatterns;

import CreativePatterns.Builder.Builder;
import CreativePatterns.Factory.Factory;
import CreativePatterns.Prototype.Prototype;
import CreativePatterns.Singleton.Singleton;
import java.util.Scanner;

public class Creative {
    public Creative() {}
    
    static Scanner cmd = new Scanner(System.in);
    
    public void main() throws CloneNotSupportedException {
        char op = ' ';
        
        do {      
            System.out.println("");
            
            // Show possible options
            System.out.println("What do you want to prove?.");
            
            System.out.println("1: Singleton.");
            
            System.out.println("2. Prototype.");
            
            System.out.println("3. Factory.");
            
            System.out.println("4. Builder.");
            
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
                Singleton singleton = new Singleton();
                
                singleton.main();
                break;
            case '2':
                Prototype prototype = new Prototype();
                
                prototype.main();
                break;
            case '3':
                Factory factory = new Factory();
                
                factory.main();
                break;
            case '4':
                Builder builder = new Builder();
                
                builder.main();
                break;
            default:
                System.out.println("Getting back...");
                break;
        }
    }
}
