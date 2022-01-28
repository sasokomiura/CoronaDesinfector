package service;

import service.Interface.Administrator;
import service.Interface.Recommendator;
import service.annotation.InjectByType;

public class HeadAdministrator implements Administrator {
    @InjectByType
    private Recommendator recommendator;
    
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Администратор выводит людей, не покинувших помещение");
    }
}
