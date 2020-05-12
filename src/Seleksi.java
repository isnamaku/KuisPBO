public class Seleksi implements Pengumuman {

    double nilaiTulis;
    double nilaiMicroteaching;
    double nilaiCoding;
    double nilaiWawancara;
    double nilaiPraktek;
    double nilaiAslab;
    String status;

    public Seleksi(double nilaiTulis, double nilaiCoding, double nilaiWawancara, double nilaiBidang) {
        this.nilaiCoding = nilaiCoding;
        this.nilaiTulis = nilaiTulis;
        this.nilaiMicroteaching = nilaiBidang;
        this.nilaiWawancara = nilaiWawancara;
        this.nilaiPraktek=nilaiBidang;

    }


    double HitungNilaiAslab() {
        nilaiAslab = (nilaiTulis + nilaiCoding + nilaiWawancara + nilaiMicroteaching) / 4;
        return nilaiAslab;
    }

    double HitungNilaiAdmin() {
        nilaiAslab = (nilaiTulis + nilaiCoding + nilaiWawancara + nilaiPraktek) / 4;
        return nilaiAslab;
    }


    @Override
    public void hasil(String nimMahasiswa) {
        if (nilaiAslab > 85)
            System.out.println("Keterangan : LOLOS \nSelamat kepada "+nimMahasiswa+" telah lolos seleksi " );
        else if (nilaiAslab <= 85)
            System.out.println("Keterangan : GAGAL \nMaaf kepada "+nimMahasiswa+", Anda tidak lolos seleksi " );
    }
}

