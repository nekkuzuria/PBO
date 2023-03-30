public class Pegawai {
    //    Attribute==============================
    String nama;
    String nip;
    String jabatan;
    int gaji;
    String divisi;

//    Constructor
    Pegawai(String nip, String nama){
        this.nip = nip;
        this.nama = nama;
    }

//    Setter Getter


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
}


