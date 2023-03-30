import java.util.ArrayList;

public class Latte extends Special{
//    Attribute
    private String takaranSusu;
    private float takaranKopi;
    private String topping;

//    Constructor
    public Latte(Cafe cafe, int id, String nama, int harga, String takaranSusu, float takaranKopi, String topping) {
        super(id, nama, harga, cafe);
        this.takaranSusu = takaranSusu;
        this.takaranKopi = takaranKopi;
        this.topping = topping;
    }

//    Getter Setter
    public String getTakaranSusu() {
        return takaranSusu;
    }

    public void setTakaranSusu(String takaranSusu) {
        this.takaranSusu = takaranSusu;
    }

    public float getTakaranKopi() {
        return takaranKopi;
    }

    public void setTakaranKopi(float takaranKopi) {
        this.takaranKopi = takaranKopi;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }


}
