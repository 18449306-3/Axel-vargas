package aplicacionestudiante;
import java.io.*;
public class AplicacionEstudiantes { // INICIO DE LA CLASE
    public static void main(String[] args) throws IOException {
    BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    Estudiante objetoestudiante; // variable estudiante
    objetoestudiante = new Estudiante(); // objeto estudiante de la clase Estudiante
    String nombrei; // variable 
    int nromatriculai; // variable 
    String direccioni;  // variable 
        System.out.println(" Ingrese nombre del estudiante" );
        nombrei = bufEntrada.readLine();
        System.out.println(" Ingrese el numero de matricula" );
        nromatriculai = Integer.parseInt(bufEntrada.readLine());
         System.out.println(" Ingrese direccion del estudiante" );
        direccioni = bufEntrada.readLine();
        
        objetoestudiante.asignardatos(nombrei, nromatriculai, direccioni); // llamada al metodo que asigna 
        objetoestudiante.desplegardatos();     
    } // FIN DE LA CLASE
    
}
