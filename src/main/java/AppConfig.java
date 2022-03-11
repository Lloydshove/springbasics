import com.lloydshove.com.lloydshove.service.SpeakerService;
import com.lloydshove.com.lloydshove.service.SpeakerServiceImpl;
import com.lloydshove.com.lloydshove.util.CalendarFactory;
import com.lloydshove.repository.HibernateSpeakerRepositoryImpl;
import com.lloydshove.repository.SpeakerRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Configuration
@ComponentScan({"com.lloydshove"})
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calendarFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);;
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calendarFactory().getObject();
    }


    /*@Bean(name = "speakerService")
    @Scope(value = SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        var service = new SpeakerServiceImpl();
        //var service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());

        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }
*/

}
