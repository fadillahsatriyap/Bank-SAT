create table if not exists data_nasabah
(
    "nama_lengkap"   varchar(255),
    "alamat"         varchar(255),
    "tempat_lahir"   varchar(255),
    "tanggal_lahir"  date not null,
    "nomor_ktp"      varchar(255),
    "nomor_hp"       varchar(255)
);

alter table data_nasabah
    owner to postgres;

INSERT INTO public.transactions ("nama_lengkap", "alamat", "tempat_lahir", "tanggal_lahir", "nomor_ktp","nomor_hp") VALUES ('agung', 'cimahi', '1998-08-29', '12372878', '08931839283');
