/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eserciziopersona;

/**
 *
 * @author guido
 */
public class EsercizioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Persona p1 = new Persona("pippo", "ciccio", "clpsdl02opas232h");
            System.out.println(p1.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Persona p2 = new Persona("pippo", "ciccio", "clp2dl02opas232h");
            System.out.println(p2.toString());
        } catch (Exception e) {
            System.out.println(e);
        }

        
        
    }
    
}
