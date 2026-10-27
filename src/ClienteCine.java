public class ClienteCine {

    private String nombre;
    private int edad;
    private boolean tieneMembresiaVip;

    public ClienteCine(String nombre, int edad, boolean tieneMembresiaVip) {
        this.nombre = nombre;
        this.edad = 0;
        this.tieneMembresiaVip = tieneMembresiaVip;
        setEdad(edad); // reutiliza la validación del setter
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isTieneMembresiaVip() {
        return tieneMembresiaVip;
    }

    // Setter con restricciones: la edad debe ser realista y nunca puede bajar

    public boolean setEdad(int nuevaEdad) {

        if (nuevaEdad < 0 || nuevaEdad > 120) {
            System.out.println("Edad rechazada: " + nuevaEdad + " no es un valor válido.");
            return false;
        }

        if (nuevaEdad < edad) {
            System.out.println("Edad rechazada: no se puede disminuir la edad (" + edad + " -> " + nuevaEdad + ").");
            return false;
        }

        edad = nuevaEdad;
        return true;
    }

    // ----- Reglas de negocio encapsuladas -----

    public boolean esAptoParaFuncionMayores() {
        return edad >= 18;
    }

    public boolean puedeAccederSalaVip() {
        return tieneMembresiaVip && esAptoParaFuncionMayores();
    }
}