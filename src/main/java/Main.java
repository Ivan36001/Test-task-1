import java.lang.reflect.Proxy;


public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        //Создаем оригинальный объект:
        MainPage mainPage = new RealMainPage();

        //Получаем загрузчик класса у оригинального объекта:
        ClassLoader realMainPageClassLoader = mainPage.getClass().getClassLoader();

        //Получаем все интерфейсы, которые реализует оригинальный объект:
        Class[] interfaces = mainPage.getClass().getInterfaces();

        //Создаем прокси нашего объекта proxyRealMainPage:
        MainPage proxyRealMainPage = (MainPage) Proxy.newProxyInstance(realMainPageClassLoader, interfaces, new MainPageInvocationHandler(mainPage));

        //Проверка перехвата методов:
        proxyRealMainPage.textInputSearch();
        proxyRealMainPage.buttonSearch();

        //Проверка возвращаемого значения методов:
        System.out.println(mainPage.textInputSearch().equals(".//*[@test-attr='input_search']"));
        System.out.println(mainPage.buttonSearch().equals(".//*[@test-attr='button_search']"));

        //Проверка создан ли объект:
        if (mainPage==null){
         System.out.println("Объект не создан");
        } else {
            System.out.println("Объект создан");
        }

    }
}


