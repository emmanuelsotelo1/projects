package cinco;

public class Estudiante {
	private String nombre;
	private int numEstu;
    private double prom;


    public Estudiante(String nombre, int numEstu, double prom){
        this.nombre=nombre;
        this.numEstu=numEstu;
        this.prom=prom;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInfo(){
       return ("\nID: "+numEstu+"\nEstudiante: "+nombre+"\nPromedio: "+prom);
    }
}
