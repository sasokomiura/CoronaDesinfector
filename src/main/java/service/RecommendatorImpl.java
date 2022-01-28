package service;

import service.Interface.Recommendator;
import service.annotation.InjectProperty;
import service.annotation.Singleton;

@Singleton
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("wisky")
    private String alcohol;

    public RecommendatorImpl() {
        System.out.println("recommendator was created");
    }

    @Override
    public void recommend() {
        System.out.println("Реклама: " + "to protect from covid-19 drink "+ alcohol);
    }
}
