//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ClienteCine ana = new ClienteCine("Ana", 25, true);
    ClienteCine tomas = new ClienteCine("Tomás", 15, true);
    ClienteCine marta = new ClienteCine("Marta", 40, false);

    ClienteCine[] clientes = {ana, tomas, marta};

    for (ClienteCine c : clientes) {
        System.out.println("\n" + c.getNombre() + " (" + c.getEdad() + " años, VIP: " + c.isTieneMembresiaVip() + ")");
        System.out.println("   Función para mayores: " + c.esAptoParaFuncionMayores());
        System.out.println("   Sala VIP            : " + c.puedeAccederSalaVip());
    }

    System.out.println("\n--- Probando el setter de edad ---");
    tomas.setEdad(18);    // válido: cumplió años
    tomas.setEdad(10);    // rechazado: no puede disminuir
    tomas.setEdad(-5);    // rechazado: negativa
    tomas.setEdad(200);   // rechazado: irreal

    System.out.println("Tomás ahora: " + tomas.getEdad() + " años, sala VIP: " + tomas.puedeAccederSalaVip());

}
