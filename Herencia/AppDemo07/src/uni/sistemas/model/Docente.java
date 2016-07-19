package uni.sistemas.model;

public class Docente extends Persona {

    //atributos
    private char categoria;
    private double sueldo;
    //constructores

    public Docente() {
    }

    public Docente(int id, String nombre, char sexo, String email, char categoria) {
        super(id, nombre, sexo, email);
        this.categoria = categoria;
    }
    //metodos get y set

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        switch (categoria) {
            case 'A':
                sueldo = 4000;
                break;
            case 'B':
                sueldo = 3000;
                break;
            case 'C':
                sueldo = 2000;
                break;
            case 'D':
                sueldo=750;
        }
        return sueldo;
    }
    
    @Override
    public String MostrarDatos() {
        return "DATOS DOCENTE\n" + super.MostrarDatos()
                + "Categoria   :" + categoria + "\n"
                + "Sueldo      :" + getSueldo();
    }

}
