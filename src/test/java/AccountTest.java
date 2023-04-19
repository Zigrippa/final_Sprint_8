import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {

    @Test
    @DisplayName("Проверка позитивная.")
    public void checkNameToEmbossPositiveTest() {
        Account acc = new Account("Тимоти Шаламе");
        assertTrue("Ошибка. Имя не проходит, а должно.", acc.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка негативная. Имя и Фамилия меньше трех символов.")
    public void checkNameToEmbossLessThan3Test() {
        Account acc = new Account("Ти");
        assertFalse("Ошибка. Подходит имя меньше трех символов.", acc.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка негативная. Имя и Фамилия больше девятнадцати символов.")
    public void checkNameToEmbossMoreThan19Test() {
        Account acc = new Account("Тимоти ШаламеТимотиШаламеТимоти");
        assertFalse("Ошибка. Подходит имя больше девятнадцати символов.", acc.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка негативная. Между именем и фамилией нет пробела.")
    public void checkNameToEmbossWithoutSpaceTest() {
        Account acc = new Account("ТимотиШаламе");
        assertFalse("Ошибка. Подходит имя без пробела.", acc.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка негативная. Имя начинается с пробела.")
    public void checkNameToEmbossStartWithSpaceTest() {
        Account acc = new Account(" Тимоти Шаламе");
        assertFalse("Ошибка. Подходит имя, начинающееся с пробела.", acc.checkNameToEmboss());
    }

    @Test
    @DisplayName("Проверка негативная. Фамилия заканчивается пробелом.")
    public void checkNameToEmbossEndWithSpaceTest() {
        Account acc = new Account("Тимоти Шаламе ");
        assertFalse("Ошибка. Подходит имя, заканчивающееся пробелом.", acc.checkNameToEmboss());
    }


}
