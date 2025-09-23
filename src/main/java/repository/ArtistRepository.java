package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import entities.Artist;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {

}
