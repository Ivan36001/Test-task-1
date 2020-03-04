import org.junit.Assert;
import org.junit.Test;

public class MethodInterception {

    @Test
    public void annotationValue() throws NoSuchMethodException, InstantiationException, IllegalAccessException {
        MainPage mainPage = createPage(MainPage.class);
        Assert.assertNotNull(mainPage);
        Assert.assertEquals(mainPage.buttonSearch(), ".//*[@test-attr='button_search']");
        Assert.assertEquals(mainPage.textInputSearch(), ".//*[@test-attr='input_search']");
    }

    private MainPage createPage(Class clazz) throws IllegalAccessException, InstantiationException {

        MainPage mainPage = (MainPage) clazz.newInstance();
        return mainPage;
    }
}
