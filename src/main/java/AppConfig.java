import com.lloydshove.com.lloydshove.service.SpeakerService;
import com.lloydshove.com.lloydshove.service.SpeakerServiceImpl;
import com.lloydshove.repository.HibernateSpeakerRepositoryImpl;
import com.lloydshove.repository.SpeakerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        var service = new SpeakerServiceImpl(getSpeakerRepository());
        //service.setRepository(getSpeakerRepository());

        return service;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }


}
