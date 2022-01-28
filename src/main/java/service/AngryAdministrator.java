package service;

import service.Interface.Administrator;

public class AngryAdministrator implements Administrator {
    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Все вон!");
    }
}
