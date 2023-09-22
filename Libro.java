package objetos;
import java.io.Serializable;

public class Libro implements Serializable {
  // atributos del libro
  private String titulo, autor, edificio, estanteSeccion, sede;
  private String anio, piso, estanteNumero;

  // constructor, asigno valores default
  public Libro(){
    titulo=null;
    autor=null;
    edificio=null;
    estanteSeccion=null;
    sede=null;
    anio=null;
    piso=null;
    estanteNumero=null;
  }
  //constructor para daar valores al libro
  public Libro(String titulo,String autor,String edificio,String estanteSeccion,String sede, String anio, String piso,String estanteNumero){
    this.titulo=titulo;
    this.autor=autor;
    this.edificio=edificio;
    this.estanteSeccion=estanteSeccion;
    this.sede= sede;
    this.anio=anio;
    this.piso=piso;
    this.estanteNumero=estanteNumero;
  }
  @Override
  public String toString(){
    return "\nTitle: "+ titulo+ "\nAutor: "+autor+ "\nEdificio: "+edificio+
      "\nEstante seccion: "+estanteSeccion+ "\nSede: "+sede+ "\nAnio: "+anio+ "\nPiso: "+piso+ "\nEstante numero: "+estanteNumero+ "\n";
      }
}