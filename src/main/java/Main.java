import context.ApplicationContext;
import factory.ObjectFactory;
import runner.Application;
import service.HeadAdministrator;
import service.Interface.Administrator;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //CoronaDesinfector desinfector = ObjectFactory.getInstance().createObject(CoronaDesinfector.class);
        ApplicationContext context = Application.run("", new HashMap<>(Map.of(Administrator.class, HeadAdministrator.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}
