package fabrikacalisan;

public class SalaryCalculation_Employee {


    /* Java da fabrika çalışanlarını temsil eden bir class oluşturunuz.
    Class Name: Employee
    Nitelikleri:
    name: İşçi Adı
    salary: İşçi Maaşı
    workHours: Haftalık Çalışma Saati
    year: Çalışmaya Başladığı Yıl
    Metotları:
    Parametreli Constructor create edilmelidir. Sınıfın nitelikleri aynı zamanda constructor ın parametresi olmalıdır.
    vergi() → Maaşa uygulanan vergiyi hesaplamayabilen bir metot oluşturunuz.
            salary < 10000 $
            vergi = 0
    salary >= 10000 $
            vergi = (salary *3 /100)
    bonus() → Haftalık Çalışma Saatine göre bonus verilebilen bir metot oluşturunuz.
            workHours > 40
    Her bir saate 50$
    maasArtis() → İşçinin işe başlangıç yılına göre maaş artışına etki edebilecek oranı hesaplayan bir metot oluşturunuz.
            5 yıldan az çalışıyor ise
    artis = ((salary + tax) *5)/100
            ** Maaş Artışlarına uygulanan vergiyi de dahil ediniz.
[5-15) arası
            artis = ((salary + tax)  * 10)/100
            [+15-Now]
    artis = ((salary + tax)  * 20)/100
    toString() → Çalışanın bilgilerini konsola yazdıracak bir metot oluşturunuz (İşçi Adı, Maaş , Uygulanan Vergi, Toplam Maaş (Maaş + Bonus), Maaş Artışı)

    */

    String name;
    double salary;
    int workHouse;
    int year;

    public SalaryCalculation_Employee(String name, int salary, int workHouse, int year) {
        this.name = name;
        this.salary = salary;
        this.workHouse = workHouse;
        this.year = year;
    }

    @Override
    public String toString() {
        return "SalaryCalculation_Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHouse=" + workHouse +
                ", year=" + year +
                '}';
    }

    public double tax(){
        double paymentOfTax=0;
        if (salary<10000){
            paymentOfTax=0;
        }else {
            paymentOfTax=salary*0.03;
        }
        return paymentOfTax;
    }

    public int bonus(){
        int paymentOfBonus=0;
        int additionalBonus=50;
        if (workHouse>40){
            paymentOfBonus=(workHouse-40)*additionalBonus;
        }
        return paymentOfBonus;
    }

    public double raiseSalary(){
        int timeOfYear=2021;
        int sumOfYear=timeOfYear-year;
        double raise=0;

        if (sumOfYear<5){
            raise=(salary+tax())*0.05;

        } else if (sumOfYear<15) {
            raise=(salary+tax())*0.1;

        }else {
            raise=(salary+tax())*0.2;
        }
        return raise;
    }



    }



