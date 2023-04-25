package tests;



public class Manager {
  private String nombre;
  private static Manager admin;
  
  private Manager(String nombre){
    this.nombre=nombre;
    System.out.println("Administrador: "+this.nombre);
  }
  
  public static Manager getSingletonInstance(String name){
      if(admin==null){
          admin = new Manager(name);
      } else{
          System.out.println("We cannot create a new manager with name "+ name + " because thera is a manager already.");
      }
      
      return admin;
  }
  
  public String getName(){
    return "Administrador: "+this.nombre;
  }

}
