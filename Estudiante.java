package aplicacionestudiante;
public class Estudiante { // INICIO DE LA CLASE
    String nombre;
    int nromatricula;
    String direccion;   
public void Estudiante () {  
    nombre= null;
    nromatricula=0;
    direccion=null; 
    
}   
public void asignardatos(String nombrei,int nromatriculai, String direccioni){
        this.nombre= nombrei;
        this.direccion= direccioni;
        this.nromatricula=nromatriculai;
}
public void desplegardatos (){
    System.out.println(" El nombre es : " +this.nombre);
    System.out.println(" El numero de matricula es : " +this.nromatricula);
    System.out.println(" La direccion es :  " +this.direccion);
}
} // FIN DE LA CLASE