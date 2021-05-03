package string;

import org.apache.commons.lang3.StringUtils;

public class ProvaString {

    public static void main(String[] args) {

        StringEstesa e = new StringEstesa();
        StringEstesa b = new StringEstesa(" ");
        StringEstesa n = new StringEstesa("0192");

        System.out.println("IsEmpty is:" + e.isEmpty());
        System.out.println("IsBlank is:" + b.isBlank());
        System.out.println("IsNumeric is:" + n.isNumeric());
    }
}

