
import com.proyecto.triviaquirkproject.Jugador;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class GameInitializer {
    
    private final Jugador jugador;
    private final ArrayList<String> categoriasSeleccionadas;
    
    public GameInitializer(Jugador jugador, ArrayList<String> categorias){
       categoriasSeleccionadas = categorias;
       this.jugador = jugador;
       print();
    }
    
    public void print(){
        for(String s : categoriasSeleccionadas){
            System.out.println(s);
        }
    }
}
