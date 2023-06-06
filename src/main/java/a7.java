public class a7 {

    public static void main(String[] args) {


        String[] urun = {"Telefon", "Bilgisayar", "Klavye", "Mouse"};

        String arananUrun = "Klavye";

        boolean urunVar = false;
        for (String urunler : urun){
            if (urun.equals(arananUrun)){
                urunVar = true;
                break;
            }
        }if (urunVar){
            System.out.println("Sepetinizde " + arananUrun + "var agam.");
        }else {
            System.out.println("Sepetinizde " + arananUrun + "yok agam.");
        }

    }
}
