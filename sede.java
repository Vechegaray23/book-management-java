package objetos;
import java.io.Serializable;

public class sede implements Serializable {
  //atributo sede
  private String nombre;
  public sede(){
    nombre=null;
  }
  //constructor
  public sede(String nombre){
    this.nombre=nombre;
  }

  @Override
  public String toString(){
    return "\nSede: "+ nombre;
  }
}