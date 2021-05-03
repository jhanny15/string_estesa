package string;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StringEstesaTest {

    StringEstesa string = new StringEstesa();

    @Test //1.a
    void Test_isEmpty_null() {
        Assertions.assertEquals(string.isEmpty(), StringUtils.isEmpty(string.getValue()));
    }

    @Test //1.b
    void Test_isEmpty_Vuota() {
        string.setValue("");
        Assertions.assertEquals(string.isEmpty(), StringUtils.isEmpty(string.getValue()));
    }

    @Test //2.a
    void Test_isBlank_null() {
        Assertions.assertEquals(string.isBlank(), StringUtils.isBlank(string.getValue()));
    }


    @Test //2.b
    void Test_isBlank_Vuota() {
        string.setValue("");
        Assertions.assertEquals(string.isBlank(), StringUtils.isBlank(string.getValue()));
    }

    @Test //2.c
    void Test_isBlank_Spazio() {
        string.setValue("   ");
        Assertions.assertEquals(string.isBlank(), StringUtils.isBlank(string.getValue()));
    }

    @Test //2.d
    void Test_isBlank_Char() {
        string.setValue(" A ");
        Assertions.assertEquals(string.isBlank(), StringUtils.isBlank(string.getValue()));
    }

    @Test //3.a
    void isNumeric() {
        string.setValue("030521");
        Assertions.assertEquals(string.isNumeric(), StringUtils.isNumeric(string.getValue()));
    }

    @Test //3.b
    void isNumeric_Char() {
        string.setValue(" 030521");
        Assertions.assertEquals(string.isNumeric(), StringUtils.isNumeric(string.getValue()));
    }
}