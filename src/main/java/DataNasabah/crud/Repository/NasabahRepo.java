package DataNasabah.crud.Repository;

import DataNasabah.crud.Entity.Nasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NasabahRepo extends JpaRepository<Nasabah,String>{
public Nasabah findByNomorKtp(String NomorKtp);
}

