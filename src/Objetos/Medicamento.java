package Objetos;

public class Medicamento {

    // Lo que esta en el ejercicio
    // Definir los atributos
    private String nombre;
    private String fabricante;
    private String viaAdministracion;

    // Crear constructor
    public Medicamento(String nombre, String fabricante,
            String viaAdministracion) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.viaAdministracion = viaAdministracion;
    }

    // Clase interna Posologia
    public class Posologia {

        private String usuarios;
        private double dosis;
        private String periodo;
        private String recomendaciones;

        // Crear constructor interna de posologia
        public Posologia(String usuarios, double dosis, String periodo,
                String recomendaciones) {
            this.usuarios = usuarios;
            this.dosis = dosis;
            this.periodo = periodo;
            this.recomendaciones = recomendaciones;
        }

        // Definir Metodos para mostrar los detalles de la posología
        public void mostrarPosologia() {
            System.out.println("Usuarios = " + usuarios);
            System.out.println("Dosis = " + dosis);
            System.out.println("Periodo = " + periodo);
            System.out.println("Recomendaciones = " + recomendaciones);
        }
    }

    // Definir metodo para mostrar los detalles del medicamento
    public void mostrarMedicamento() {
        System.out.println("Nombre del edicamento = " + nombre);
        System.out.println("Fabricante del medicamento = " + fabricante);
        System.out.println("Vía de administración = " + viaAdministracion);
    }
}
