import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@Target({METHOD, TYPE})
@interface Selector {

    String xpath();
}

interface MainPage {

    @Selector(xpath = ".//*[@test-attr='input_search']")
    String textInputSearch() throws NoSuchMethodException;

    @Selector(xpath = ".//*[@test-attr='button_search']")
    String buttonSearch() throws NoSuchMethodException;
}
