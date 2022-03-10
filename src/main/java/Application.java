import com.lloydshove.com.lloydshove.service.SpeakerService;
import com.lloydshove.com.lloydshove.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String args[]){

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service + "\n" + service2);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
