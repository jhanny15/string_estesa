package string;

public class StringEstesa {

    public String getValue() {
        return value;
    }

    /** Valore della stringa **/
    private String value;

    /**
     * Costruttore pubblico di StringEstesa
     */
    public StringEstesa() {}

    /**
     * Costruttore di StringEstesa con il parametro
     * @param s (valore della stringa)
     */
    public StringEstesa(String s) {
        this.value = s;
    }

    /**
     * Metodo che controlla se la stringa è vuota o null
     * @return true se è vuota o null, altrimenti false
     */
    public boolean isEmpty() {

        return true;
    }

    /**
     * Metodo che controlla se la stringa è composta da soli spazi, stringa vuota o null
     * @return true se è composta da soli spazi, stringa vuota o null, altrimenti false
     */
    public boolean isBlank() {

        return true;
    }

    /**
     * Metodo che controlla se la stringa è composta da soli numeri
     * @return true se è composta da soli numeri, false se è vuota o null
     */
    public boolean isNumeric() {

        return true;
    }



}


