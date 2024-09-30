public class Estudiante {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double evaluación;
    private double ingles;
    private double promedio;

    //constructor
    public Estudiante(String m, String n) {
        // El objetivo es construir e inicializar el objeto
        this.matricula = m;
        this.nombre = n;
    }
//------------------------------------------------------------------
    //getters y setters

    //Get: metodo consultor
    public String getMatricula() {
        return matricula;
    }
    // Set: metodo modificador
    public void setMatricula(String matric) {
        this.matricula = matric;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstructuras() {
        return estructuras;
    }
    public void setEstructuras(double estructuras) {
        this.estructuras = estructuras;
    }
    public double getEvaluación() {
        return evaluación;
    }
    public void setEvaluación(double evaluación) {
        this.evaluación = evaluación;
    }
    public double getIngles() {
        return ingles;
    }
    public void setIngles(double ingles) {
        this.ingles = ingles;
    }
    
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio() {
        this.promedio = (this.estructuras + this.evaluación + this.ingles)/3;;
    }
//------------------------------------------------------------------
    @Override
    public String toString() {
        return "Estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }
    
    
}
