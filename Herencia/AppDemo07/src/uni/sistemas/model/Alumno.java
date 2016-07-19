package uni.sistemas.model;

public class Alumno extends Persona {

    //atributos
    private int nota;
    private String estado;
    //constructor

    public Alumno() {
    }

    public Alumno(int id, String nombre, char sexo, String email, int nota) {
        super(id, nombre, sexo, email);//llama a constructor de persona
        this.nota = nota;
    }
    //metodos get y set

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getEstado() {
        if (nota >= 14) {
            estado = "Aprobado";
        } else if (nota >= 10 && nota < 14) {
            estado = "Sustitutorio";
        } else {
            estado = "Desaprobado";
        }
        return estado;
    }

    @Override
    public String MostrarDatos() {
        return "DATOS ALUMNO\n" + super.MostrarDatos()
                + "Nota   :" + nota + "\n"
                + "Estado :" + getEstado();
    }

}
