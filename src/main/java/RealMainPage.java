import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Method;

class RealMainPage implements MainPage {

    @Override
    public String textInputSearch() throws NoSuchMethodException {
        Method m1 = MainPage.class.getMethod("textInputSearch");
        String s1 = m1.getAnnotation(Selector.class).xpath();
        return s1;

    }

    @Override
    public String buttonSearch() throws NoSuchMethodException {
        Method m2 = MainPage.class.getMethod("buttonSearch");
        String s2 = m2.getAnnotation(Selector.class).xpath();
        return s2;
    }

}
