public class estudiante {
    private String matricula;
    private String nombre;
    private double estructuras;
    private double evaluacion;
    private double ingles;
    private double promedio;

    //constructor
    public estudiante(String m, String n){
        //El onjetivo es construir e inicializar el objeto
        this.matricula = m;
        this.nombre = n; 
    }

    //Getters y Setters

    //Get: metodo consultor

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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
    
    public double getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(double evaluacion) {
        this.evaluacion = evaluacion;
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
        this.promedio = (this.estructuras + this.evaluacion + this.ingles) / 3;
    }

    @Override
    public String toString() {
        return "estudiante [matricula=" + matricula + ", nombre=" + nombre + ", promedio=" + promedio + "]";
    }


}
