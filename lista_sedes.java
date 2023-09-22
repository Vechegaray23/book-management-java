package objetos;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

public class lista_sedes implements Serializable{
  private List<sede> Sedes; //atributo es una lista de libros
  
  public lista_sedes(){
    Sedes =new ArrayList<sede>();
  }
  public void agregarSede(sede sede){
    Sedes.add(sede);
  }
  @Override
  public String toString(){
    String total="\n";
    for (int i=0; i<Sedes.size();i++){
      sede b=Sedes.get(i);
      total=total+b.toString();
      
    }
    return total;
  }
  
  
  
}
