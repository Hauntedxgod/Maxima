package Lesson_11.coins;

public class Coin implements Comparable<Coin>{
    private int nominal;
    private double diameter;
    private String country;
    private Integer year;


    public Coin() {
    }

    public Coin(int nominal, double diameter, String country, Integer year) {
        this.nominal = nominal;
        this.diameter = diameter;
        this.country = country;
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", diameter=" + diameter +
                ", country='" + country + '\'' +
                ", year=" + year +
                '}';
    }
    // coin1   .equals(coin5)- Одинаковые монеты


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Coin coin = (Coin) object;

        if (nominal != coin.nominal) return false;
        if (Double.compare(diameter, coin.diameter) != 0) return false;
        if (!country.equals(coin.country)) return false;
        return year.equals(coin.year);
    }

    // coin1 - Coin{nominal=10, diameter=15.3, country='Russia', year=2008}
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nominal;//result = 10
        temp = Double.doubleToLongBits(diameter);// 15.3 -> 157
        result = 31 * result + (int) (temp ^ (temp >>> 32)); //result = 31 * 10 + 134 = 310 + 134 = 444
        result = 31 * result + country.hashCode();//result = 31 * 444 + 2164 = 15928
        result = 31 * result + year.hashCode();//result = 31 * 15928 + 2008 = 495776
        return result;// 495776
    }

    @Override
    public int compareTo(Coin o) {
        if (this.getYear() != o.getYear()){//происходит сортировка по году
            return this.getYear() - o.getYear();
        }
        if (this.getNominal() != o.getNominal()){
            return this.getNominal() - o.getNominal();
        }
        if (this.getDiameter() != o.getDiameter()){
            return Double.compare(this.getDiameter(), o.getDiameter());
        }

        return this.getCountry().compareTo(o.getCountry());
    }
}

