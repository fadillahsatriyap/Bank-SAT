
create table if not exists data_nasabah
(
    nama_lengkap  varchar,
    alamat        varchar,
    tempat_lahir  varchar,
    tanggal_lahir varchar,
    nomor_ktp     varchar,
    nomor_hp      varchar
);


INSERT INTO data_nasabah (nama_lengkap, alamat, tempat_lahir, "tanggal_lahir", nomor_ktp, nomor_hp) VALUES ('agung', 'cimahi', 'bandung', '1998-08-29', '12372878', '08931839283');