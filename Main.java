import java.util.Scanner;
import objetos.Libro;
import objetos.Invetario;
import objetos.lista_sedes;
import objetos.sede;

public class Main{
  static Invetario inv=new Invetario(); //cargo el inventario, en este momento esta vacio
  static lista_sedes sed= new lista_sedes(); //crgo la  lista de sedes, vacia por el moomento
  
  static Boolean seguir =true; //Lo uso para ejecutar while mientras se quiera seguir usando programa.
  static Scanner in= new Scanner(System.in); //scanner
  
  public static void main(String[] args){
    while(seguir){
      System.out.println("\nAgregar libro [1]: "
                        +"\nVer listado libros [2]:"
                        +"\nTerminar programa [3]"
                        +"\nAgregar sede [4]"
                        +"\nVer listado sedes [5]"
                        );
      
      int i_usuario= in.nextInt(); //eleccion usuario
      switch(i_usuario){ //uso switch, es parecido a if, elseif, pero mas abreviado y util para estos casos
      case 0:
          //
      case 1:
          agregarLibro();
          break;
          
      case 2:
          System.out.println(inv.toString());
          break;

      case 3:
          System.out.println("Programa finalizado.");
          seguir=false;//se cierra loop y termina programa
          break;

      case 4:
          agregarSede();
          break;
      case 5:
          System.out.println(sed.toString());
          break;
          
      }
    }
    
  }

//metodos usados en main, los escribo aqui para dejar el switch mas ordenado
private static void agregarSede(){
  String sede;
  System.out.println("\nEscribe sede: ");
  sede= in.next();
  //llamo constructor sede
  sede x=new sede(sede);
  //agrego sede a lista de sedes
  sed.agregarSede(x);
}
private static void agregarLibro(){
  String titulo, autor, edificio, estanteSeccion, sede;
  String anio, piso, estanteNumero;
  
  System.out.println("\nEscribe titulo: ");
  titulo= in.next();
  
  System.out.println("\nEscribe autor: ");
  autor= in.next();
  
  System.out.println("\nEscribe edificio: ");
  edificio= in.next();
  
  System.out.println("\nEscribe estante seccion: ");
  estanteSeccion= in.next();
  
  System.out.println("\nEscribe sede: ");
  sede= in.next();
  
  System.out.println("\nEscribe anio: ");
  anio= in.next();

  System.out.println("\nEscribe piso: ");
  piso= in.next();
  
  System.out.println("\nEscribe estante numero: ");
  estanteNumero= in.next();
  //llamo constructor de libro
  Libro x =new Libro(titulo,autor,edificio,estanteSeccion,sede,anio,piso,estanteNumero);
  //agrego libro a la lista de libros o inventario
  inv.agregarLibro(x);
  
}
}