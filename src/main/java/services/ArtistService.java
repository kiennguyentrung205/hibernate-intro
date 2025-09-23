package services;

import entities.Artist;
import org.springframework.stereotype.Service;
import repository.ArtistRepository;
import java.util.List;

@Service
public class ArtistService {
    private ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}
