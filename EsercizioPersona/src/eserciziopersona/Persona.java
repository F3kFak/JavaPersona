
package eserciziopersona;

/**
 * La classe Persona aiuta al sviluppatore a creare oggetti Persona
 * @author Guido lanzi
 */

public class Persona {
    
    private String nome;
    private String cognome;
    private String codiceFiscale;
    

    /**
     * Costruisce un oggetto dato il nome, il cognome e il codice fiscale (trasformato in automatico in maiuscolo).
     * <b> CONTROLLO SUL CODICE FISCALE: </b>
     * <ul>
     * <li>Il codice deve essere di 16 caratteri alfanumerici</li>
     * <li>Il codice non deve contenere spazi</li>
     * <li>I primi 6 caratteri devono essere delle consonanti</li>
     * <li>Settimo e ottavo carattere devono essere numeri</li>
     * </ul>
     * @param nome stringa qualsiasi da assegnare come nome di un nuovo oggetto Persona
     * @param cognome stringa qualsiasi da assegnare come cognome di un nuovo oggetto Persona
     * @param codiceFiscale stringa che rappresenta il nuovo codice fiscale dell'oggetto Persona
     */
    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        try {
            setCodice(codiceFiscale);
        } catch (Exception e) {
            this.nome = "";
            this.cognome = "";
            this.codiceFiscale = "";
        }
    }

    private void setCodice(String codice) throws IllegalArgumentException
    {
        if (codice == null || !codice.matches("(?i)[bcdfghj-np-tv-z]{6}[0-9]{2}[a-z0-9]{8}"))
            throw new IllegalArgumentException("Codice non è valido");
        else
            this.codiceFiscale = codice;
    }

    /**
     * restituisce una Stringa contenente il nome della persona
     * @return il nome di un oggetto Persona
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * assegna una Stringa come nome di una persona
     * @param nome Stringa da assegnare come nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * restituisce una Stringa contenente il cognome della persona
     * @return il cognome di un oggetto Persona
     */
    public String getCognome() {
        return this.cognome;
    }

    /**
     * assegna una Stringa come cognome di una persona
     * @param cognome nuova stringa da assegnare come cognome a un oggetto Persona giÃ  esistente
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return this.codiceFiscale;
    }

    /**
     * Il metodo stabilisce se due persone sono omonime; Restituisce un booleano: VERO se 
     * le due persone hanno lo stesso nome (senza distinzione di maiuscole e minuscole) 
     * altrimenti FALSO
     * @param p oggetto Persona
     * @return Vero se le due persone confrontate hanno lo stesso nome, altrimenti falso
     */
    public boolean isOmonimo(Persona p){
        if(this.nome.equalsIgnoreCase(p.nome))
            return true;
        return false;
    }

     
    
    /**
     * Restituisce una rappresentazione testuale di un oggetto Persona
     * @return La rappresentazione testuale di un oggetto Persona
     */
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cognome='" + getCognome() + "'" +
            ", codiceFiscale='" + getCodiceFiscale() + "'" +
            "}";
    }
    


}
