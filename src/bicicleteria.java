
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DesarrolloWeb
 */
public class bicicleteria {

    private float ganancia;
    private int cantidadDeVentas;
    private ArrayList<Bicicleta> bicicleta;

    public bicicleteria() {
        ArrayList<Object> bicicletas = new ArrayList<>();
        cantidadDeVentas = 0;
        ganancia = 0;
    }

    void venderBicicleta(Bicicleta bicicleta) {
        bicicleta.remove(bicicleta);
        cantidadDeVentas++;
        ganancia = ganancia + bicicleta.Precio();

    }

    public ArrayList<Bicicleta> buscarBicicleta(String nroDeSerie) {
        for (int i = 0; i < bicicleta.size(); i++) {
            if (bicicleta.get(i).getClass().equals(nroDeSerie)) {
            } else {
            }
        }

        List <Bicicleta> ordenarBicis; 
      Bicicleta aux;
            for (int j = 0; j < Bicicleta.size();j++) {
  
            for (int i = 0; i < Bicicleta.size(); i++) {
                if (Bicicleta.get(i).getaño() > Bicicleta.get(i + 1).getaño()) {
                    aux = Bicicleta.get(i + 1);
                    Bicicleta.set(i + 1, Bicicleta.get(i))
                    :
            Bicicleta.set(i, aux);
                }
                }
                }
return Bicicleta;

