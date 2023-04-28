public class Main {
    public static void main(String[] args) {
        Pegawai hayaObj = new Pegawai("P10", "haya", "p");
        Manajer guroObj = new Manajer("M17", "guro", "l");
        Sales deveObj = new Sales("S12", "deve", "l");


//        THR
        hayaObj.setGaji(3000000);
        System.out.println("THR " + hayaObj.getNama() + " : " + hayaObj.getThr());

        guroObj.setGaji(7000000);
        System.out.println("THR " + guroObj.getNama() + " : " + guroObj.getThr());

        deveObj.setGaji(4000000);
        System.out.println("THR " + deveObj.getNama() + " : " + deveObj.getThr());

//        Cuti
        hayaObj.setCuti(1);
        System.out.println("Jumlah Cuti " + hayaObj.getNama() + " : " + hayaObj.getCuti());
        hayaObj.setCuti("pernikahan");
        System.out.println("Jumlah Cuti " + hayaObj.getNama() + " : " + hayaObj.getCuti());

        guroObj.setCuti("persalinan");
        System.out.println("Jumlah Cuti " + guroObj.getNama() + " : " + guroObj.getCuti());

//        NIP
        deveObj.setNip("M90");
        System.out.println("NIP " + deveObj.getNama() + " : " + deveObj.getNip());
        deveObj.setNip("S23");
        System.out.println("NIP " + deveObj.getNama() + " : " + deveObj.getNip());

        guroObj.setNip(85);
        System.out.println("NIP " + guroObj.getNama() + " : " + guroObj.getNip());




    }
}
