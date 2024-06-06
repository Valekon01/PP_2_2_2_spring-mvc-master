package web.model;

public class Car {

    private String model;
    private String series;
    private int year;

    public Car(String model, String series, int age) {
        this.model = model;
        this.series = series;
        this.year = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
