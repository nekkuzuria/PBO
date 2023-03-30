import java.util.List;

public class Manajer extends Pegawai {
//    Attribute==============================
    private List<Pegawai> bawahan;
    private String ruangan;
    private Pegawai sekretaris;

//    Constructor
    Manajer(String nip, String nama){
        super(nip, nama);
    }

//    Setter Getter

    public List<Pegawai> getBawahan() {
        return bawahan;
    }

    public void setBawahan(List<Pegawai> bawahan) {
        this.bawahan = bawahan;
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
}
