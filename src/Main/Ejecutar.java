package Main;

import Objetos.Medicamento;

public class Ejecutar {

    public static void main(String[] args) {

        // Crear una instancia de Medicamento
        Medicamento medicamento = new Medicamento("Aspirina", "Bayer", "Oral");

        // Crear una instancia de la clase interna Posologia
        Medicamento.Posologia posologia = medicamento.new Posologia(
                "Adultos y mayores de 16 años",
                500, "6 horas", "No debe tomar este medicamento "
                + "con el estomago vacio.");

        // Mostrar los detalles del medicamento y la posología
        medicamento.mostrarMedicamento();
        posologia.mostrarPosologia();
    }
}
