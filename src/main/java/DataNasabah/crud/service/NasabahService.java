package DataNasabah.crud.service;

import DataNasabah.crud.Entity.Nasabah;
import DataNasabah.crud.Repository.NasabahRepo;
import lombok.RequiredArgsConstructor;
import org.hibernate.sql.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
//@RequiredArgsConstructor
public class NasabahService {

    private final NasabahRepo nasabahRepo;


   public NasabahService(NasabahRepo nasabahRepo) {
        this.nasabahRepo = nasabahRepo;
    }

    public Object register (Nasabah nasabah) {
        try {
            nasabahRepo.save(nasabah);
            return "berhasil";
        }
        catch (Exception ex) {
            return "Tejadi error";
        }
    }
    public Object findNasabah (String nomor_ktp ) {
        try {
            Nasabah byNomorKtp = this.nasabahRepo.findByNomorKtp(nomor_ktp);
            Map<String, Object> map = new HashMap<>();
            map.put("data",byNomorKtp);
            map.put("responseMessage", "success listed nasabah");
            return map;
        } catch (Exception ex) {
            return "terjadi kesalahan";
        }
    }
    public Object view () {
        try {
            List<Nasabah> semuaNasabah = this.nasabahRepo.findAll();
            Map<String, Object> map = new HashMap<>();
            map.put("data",semuaNasabah);
            map.put("responseMessage", "success listed nasabah");
            return map;
        } catch (Exception ex) {
            return "terjadi kesalahan";
        }
    }
    public Nasabah update (Nasabah nasabah){
        return  nasabahRepo.save(nasabah);
    }
    public String delete (String Nomor_ktp){
        try {
            nasabahRepo.deleteById(Nomor_ktp);
            return "deleted";
        }catch(Exception ex){
            return "terjadi kesalahan";
        }
    }
}
