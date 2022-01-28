import factory.ObjectFactory;
import service.HeadAdministrator;
import service.Interface.Administrator;
import service.Interface.Announcer;
import service.ConsoleAnnouncer;
import service.annotation.InjectByType;

public class CoronaDesinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Administrator administrator;

    public void start(Room room){
        announcer.announce("Начинаем дезинфекцию, всем покинуть помещение!");
        administrator.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Можете вернуться в комнату");
    }

    private void desinfect(Room room){
        System.out.println("Проходит дезинфекция");
        System.out.println("Дезинфекция пройдена");
    }
}
