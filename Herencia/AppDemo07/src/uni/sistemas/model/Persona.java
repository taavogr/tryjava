
package uni.sistemas.model;

public class Persona {
  //atributos
    private int id;
    private String nombre;
    private char sexo;
    private String email;
    //constructor

    public Persona() {
    }

    public Persona(int id, String nombre, char sexo, String email) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.email = email;
    }
    //metodos get y set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //metodo
  public String MostrarDatos(){
    return "Codigo :"+id+"\n"+
           "Nombre :"+nombre+"\n"+
           "Sexo   :"+sexo+"\n"+
           "Email  :"+email+"\n";
    }    
}
