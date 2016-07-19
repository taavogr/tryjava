package uni.sistemas.model;

public class Empleado extends Persona {

    //atributos
    private int dias;
    private double pago;
    private double sueldo;
    //constructor

    public Empleado() {
    }

    public Empleado(int id, String nombre, char sexo, String email, int dias, double pago) {
        super(id, nombre, sexo, email);
        this.dias = dias;
        this.pago = pago;
    }
    //metodos get y set

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getSueldo() {
        sueldo = dias * pago;
        return sueldo;
    }

    @Override
    public String MostrarDatos() {
        return "DATOS EMPLEADO\n" + super.MostrarDatos()
                + "Dias trab. :" + dias + "\n"
                + "Pago x hora:" + pago + "\n"
                + "Sueldo      :" + getSueldo();
    }

}
