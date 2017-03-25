import com.myspring.test.core.beans.Client;
import com.myspring.test.core.beans.Event;
import com.myspring.test.core.loggers.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Tillis on 04.12.16.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;

    public App(Client c, EventLogger el) {
        super();
        client = c;
        eventLogger = el;
    }

    public void logEvent(Event event) {
        event.setMsg(event.getMsg().replaceAll(client.getId(), client.getName()));
        eventLogger.logEvent(event);
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");
        for (int i = 0; i < 10; i++) {

            Event e=(Event) ctx.getBean("event");
            e.setMsg("Show user: "+i);
            app.logEvent(e);
        }

    }
}
