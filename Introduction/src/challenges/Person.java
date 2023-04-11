package challenges;

import java.util.Random;

public class Person {
    private String name = "";
    private int age = 0;
    private String DNI;
    private boolean sex = true; /* True: male, False: female*/
    private Double weight = 0.0;
    private Double height = 0.0; 
    
    public Person(){
        generateDNI();
    }    
    
    public Person(String name, int age, boolean sex, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        
        generateDNI();
    }

    public Person(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        
        generateDNI();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }


    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
    
    public int calculateIMC() {
        double result  = weight/(height*height);
        
        if(result < 20) {
            return -1;
        } else if(result > 25) {
            return 1;
        }
        
        return 0;
    }
    
    public boolean isAdult() {
        return age > 17;
    }

    public void checkSex(boolean testSex) {
        if(sex == testSex) {
            System.out.println("M");
        } else {
            System.out.println("F");
        }
    }
    
    public void generateDNI() {
        double DNIDouble = Math.random() * 1000000 + 100000;        
        long DNILong = (long)Math.round(DNIDouble);
        String DNI = Long.toString(DNILong);
        
        System.out.println(DNI);
        
        this.DNI = DNI;
    }
}   
