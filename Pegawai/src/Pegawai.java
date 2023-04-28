public class Pegawai {
    //    Attribute==============================
    private String nama;
    private String jenisKelamin;
    private String nip;
    private String departemen;
    private int gaji;
    private String posisi;
    private int cuti;

//    Constructor
    Pegawai(String nip, String nama, String jenisKelamin){
        this.setNip(nip);
        this.nama = nama;
        this.jenisKelamin = jenisKelamin.toLowerCase();
        this.cuti = 12;
    }

//    Setter Getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        if(checkNip(nip)) {
            this.nip = nip;
        }
    }
    public void setNip(int urutanMasuk){
        this.setNip("P"+urutanMasuk);
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public int getThr() {
        return this.getGaji();
    }

    public int getCuti() {
        return cuti;
    }

    public void setCuti(int cuti) {
        this.cuti += cuti;
    }
    public void setCuti(String tipeCuti) {
        tipeCuti = tipeCuti.toLowerCase();
        if(tipeCuti == "pernikahan"){
            this.setCuti(2);
        }
        else if(tipeCuti == "persalinan"){
            if(this.jenisKelamin=="p"){
                this.setCuti(90);
            }
            else{
                this.setCuti(3);
            }
        }
    }

//    Method
    public boolean checkNip(String nip){
        if(nip.charAt(0) == 'P') return true;
        else return false;
    }


}


