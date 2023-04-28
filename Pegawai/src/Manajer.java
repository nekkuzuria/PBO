import java.util.List;

public class Manajer extends Pegawai {
//    Attribute==============================
    private List<Pegawai> anakBuah;
    private Pegawai sekretaris;
    private String ruangan;

//    Constructor
    Manajer(String nip, String nama, String jenisKelamin){
        super(nip, nama, jenisKelamin);
    }

//    Setter Getter

    public List<Pegawai> getAnakBuah() {
        return anakBuah;
    }

    public void setAnakBuah(List<Pegawai> anakBuah) {
        this.anakBuah = anakBuah;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public Pegawai getSekretaris() {
        return sekretaris;
    }

    public void setSekretaris(Pegawai sekretaris) {
        this.sekretaris = sekretaris;
    }
    public void setSekretaris(String nip, String nama){
        this.sekretaris.setNip(nip);
        this.sekretaris.setNama(nama);
    }

    @Override
    public void setNip(int urutanMasuk){
        this.setNip("M"+urutanMasuk);
    }

    @Override
    public int getThr() {
        return this.getGaji() * 2;
    }

    //    Method
    @Override
    public boolean checkNip(String nip){
        if(nip.charAt(0) == 'M') return true;
        else return false;
    }


}
