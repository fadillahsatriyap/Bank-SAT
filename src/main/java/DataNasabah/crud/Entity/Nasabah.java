package DataNasabah.crud.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;


@Table(name = "data_nasabah")
@Entity
@Getter
@Setter
public class Nasabah {
cd

  @Column(name = "nama_lengkap")
  private  String nameLengkap;

  @Column(name = "alamat")
  private String alamat;

  @Column(name = "tempat_lahir")
  private String tempatLahir;

  @Column(name = "tanggal_lahir")
  private Date tanggalLahir;

  @Id
  @Column(name = "nomor_ktp")
  private String nomorKtp;

  @Column(name = "Nomorhp")
  private String nomorhp;

}
