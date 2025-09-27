package app;

import app.entities.Artist;
import app.services.ArtistService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import java.util.List;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
        ArtistService artistService = ctx.getBean(ArtistService.class);
//        System.out.println("All artists with name: Symphony");
        System.out.println("Page 1 of artists with name: Symphony");
//        List<Artist> artists = artistService.getArtistsWithIdGreaterThan(200);
//        Page<Artist> artists = artistService.getArtistsByNameContaining("Symphony", PageRequest.of(0, 10));
//        for (Artist ar : artists) {
//            System.out.println(String.format("Id: %d, Name: %s", ar.getArtistId(), ar.getName()));
//        }
        System.out.println("Nghe si co ID = 200");
        Artist ar = artistService.getById1(1);
        System.out.println(String.format("Id: %d, Name: %s", ar.getArtistId(), ar.getName()));
    }
}
