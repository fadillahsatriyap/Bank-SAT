CREATE SCHEMA IF NOT EXISTS bank_sat;
create table if not exists bank_sat.data_nasabah
(
    nama_lengkap  varchar,
    alamat        varchar,
    tempat_lahir  varchar,
    tanggal_lahir date,
    nomor_ktp     varchar,
    nomor_hp      varchar
);

alter table bank_sat.data_nasabah
    owner to postgres;

INSERT INTO bank_sat.data_nasabah (nama_lengkap, alamat, tempat_lahir, "tanggal_lahir", nomor_ktp, nomor_hp) VALUES ('agung', 'cimahi', 'bandung', '1998-08-29', '12372878', '08931839283');