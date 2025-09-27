package app.services;

import app.entities.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import app.repository.ArtistRepository;

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

    public List<Artist> getArtistsByName(String name) {
        return artistRepository.getByNameContainingIgnoreCase(name);
    }

    public List<Artist> getArtistsWithIdGreaterThan(int id) {
        return artistRepository.getByArtistIdGreaterThan(id);
    }

    public Page<Artist> getArtistsByNameContaining(String name, Pageable pageable) {
        return artistRepository.getByNameContainingIgnoreCase(name,pageable);
    }
    public Artist getById1(int id) {
        return artistRepository.getByArtistId(id);
    }
}
