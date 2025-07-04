package relaciones;

public class Main {
    public static void main(String[] args) {
        Diagnostico diag = new Diagnostico(
                "Infección en la piel",
                "Administrar antibiótico tópico durante 10 días y monitorear reacción."
        );

        Consulta consulta = new Consulta("C001", "2025-07-01", diag);

        consulta.mostrarConsulta();
}
}