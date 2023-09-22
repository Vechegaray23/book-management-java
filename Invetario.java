package objetos;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
//import objetos.Libro;

public class Invetario implements Serializable{
  private List<Libro> coleccion; //atributo es una lista de libros
  public Invetario(){
    coleccion =new ArrayList<Libro>();
  }
  
  public void agregarLibro(Libro Libro){
    coleccion.add(Libro);
  }

  @Override
  public String toString(){
    String total="\n";
    for (int i=0; i<coleccion.size();i++){
      Libro b=coleccion.get(i);
      total=total+b.toString();
      
    }
    return total;
  }

  
}