package service;

import factory.ObjectFactory;
import service.Interface.Announcer;
import service.Interface.Recommendator;
import service.annotation.InjectByType;

public class ConsoleAnnouncer implements Announcer {
    @InjectByType
    private Recommendator recommendator;
    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
