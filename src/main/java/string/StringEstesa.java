package string;

import java.util.regex.Pattern;

public class StringEstesa {

    /** Valore della stringa **/
    private String value;

    /**
     * Costruttore pubblico di StringEstesa
     */
    public StringEstesa() {}

    /**
     * Costruttore di StringEstesa con argomento
     * @param s (la stringa)
     */
    public StringEstesa(String s) {
        value = s;
    }

    /**
     * Metodo che controlla se la stringa è vuota o null
     * @return true se è vuota o null, altrimenti false
     */
    public boolean isEmpty() {
        return ((value == null)||(value.equals("")));
    }

    /**
     * Metodo che controlla se la stringa è composta da soli spazi, stringa vuota o null
     * @return true se è composta da soli spazi, stringa vuota o null, altrimenti false
     */
    public boolean isBlank() {
        return ((value == null)||(value.equals("")||(value.equals(" ")))) ;
    }

    /**
     * Metodo che controlla se la stringa è composta da soli numeri
     * Pattern p, un pattern che controlla se value tiene valori numerici
     * @return true se è composta da soli numeri, false se è vuota, null o
     * se tiene altri caratteri che non sono numeri
     */
    public boolean isNumeric() {
        Pattern p = Pattern.compile("\\d+");
        return p.matcher(value).matches();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}


