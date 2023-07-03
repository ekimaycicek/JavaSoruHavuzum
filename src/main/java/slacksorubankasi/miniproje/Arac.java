package slacksorubankasi.miniproje;

public class Arac {

    /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
   olan Araba  isimli bir class cretae ediniz.
 2- bütün fieldları parametre alan bir constructor tanımlayınız.
 3- ArabaMain isminde main için bir class oluşturunuz.
 4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
 5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
     */
    private String model;
    private String renk;
    private int motor;

    private int yıl;

    public Arac() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor <1000){
            this.motor = 1001;
        }else  this.motor = motor;

    }

    public int getYıl() {
        return yıl;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yıl +
                '}';
    }

    public void setYıl(int yıl) {
        if (yıl < 0) {
            this.yıl = (-1)*yıl;
        }else  this.yıl = yıl;

    }

    public Arac(String model, String renk, int motor, int yıl) {
        this.model = model;
        this.renk = renk;
        // this.motor = motor;
        setMotor(motor);
        // this.yıl = yıl;
        setYıl(yıl);
    }
}
