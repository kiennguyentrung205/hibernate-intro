package app;

import entities.Artist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.ArtistRepository;

import java.util.List;

@SpringBootApplication(scanBasePackages = {"services", "entities", "repository"})
@EnableJpaRepositories(basePackages = "repository")
@EntityScan(basePackages = "entities")
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
        ArtistRepository artistRepository = ctx.getBean(ArtistRepository.class);
        List<Artist> artists = artistRepository.findAll();
        for (Artist ar : artists) {
            System.out.println(String.format("Id: %d, Name: %s", ar.getArtistId(), ar.getName()));
        }
    }
}
