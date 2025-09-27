package app.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import app.entities.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    //Magic method
    //List
    List<Artist> getByNameContainingIgnoreCase(String name);
    List<Artist> getByArtistIdGreaterThan(int id);
    Page<Artist> getByNameContainingIgnoreCase(String name, Pageable pageable);
    Artist getByArtistId(int id);
}
