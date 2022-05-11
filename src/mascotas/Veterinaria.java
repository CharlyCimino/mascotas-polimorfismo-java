package mascotas;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Veterinaria {

    private ArrayList<Mascota> mascotas;

    public Veterinaria() {
        this.mascotas = new ArrayList<>();
    }

    public void agregarMascota(Mascota m) {
        this.mascotas.add(m);
    }

    // Método que SI usa polimorfismo
    public void saludarACliente() {
        for (Mascota mascota : mascotas) {
            mascota.expresarse();
        }
    }

    // Método que NO usa polimorfismo
//    public void saludarACliente() {
//        for (Mascota mascota : mascotas) {
//            if (mascota instanceof Perro) {
//                ((Perro) mascota).ladrar();
//            } else if (mascota instanceof Gato) {
//                ((Gato) mascota).maullar();
//            }
//        }
//    }
}
