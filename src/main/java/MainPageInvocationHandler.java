

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class MainPageInvocationHandler implements InvocationHandler {

    private MainPage mainPage;


    public MainPageInvocationHandler(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    @Override//переопределяем метод обработчика вызовов
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Вызывается метод : " + method.getName() +" Полученное значение: " + method.invoke(mainPage));
        return method.invoke(mainPage, args);


    }
}
