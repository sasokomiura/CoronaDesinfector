package runner;

import config.JavaConfig;
import context.ApplicationContext;
import factory.ObjectFactory;

import java.util.Map;

public class Application {
    public static ApplicationContext run(String packageToScan, Map<Class, Class> ifc2ImplClass){
        JavaConfig config = new JavaConfig(packageToScan, ifc2ImplClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        //todo - инициализировать все не ленивые singletones
        context.setFactory(objectFactory);
        return context;
    }
}
