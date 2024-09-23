package mapa;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.ListView;

public class Hotel {
    private String name;
    private String address;
    private List<Quarto> quartos;

    public Hotel(String name, String address){
        this.name = name;
        this.address = address;
        this.quartos = new ArrayList<>();
    }
    public List<Quarto> listarQuartos(){
        return this.quartos;
    }

    public void addQuarto(Quarto quarto){
        quartos.add(quarto);
    }
    public void removeQuarto(Quarto quarto){
        quartos.remove(quarto);
    }
    public Quarto buscarQuarto(int numero){
        for(int i = 0; i < this.quartos.size(); i++){
            if (this.quartos.get(i).getNumero() == numero) {
                return this.quartos.get(numero);
            }
        }

        return null;
    }


}