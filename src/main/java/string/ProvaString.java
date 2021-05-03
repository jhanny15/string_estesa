package string;

public class ProvaString {

    public static void main(String[] args) {

        StringEstesa string = new StringEstesa(" A ");

        System.out.println("IsEmpty is:" + string.isEmpty());

        string.setValue("");
        System.out.println("IsEmpty is:" + string.isEmpty());

        string.setValue(null);
        System.out.println("IsBlank is:" + string.isBlank());

        string.setValue("");
        System.out.println("IsBlank is:" + string.isBlank());

        string.setValue(" ");
        System.out.println("IsBlank is:" + string.isBlank());

        string.setValue("92");
        System.out.println("IsNumeric is:" + string.isNumeric());

        string.setValue(" 92 a");
        System.out.println("IsNumeric is:" + string.isNumeric());
    }
}

