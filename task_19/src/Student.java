public class Student {
    private int id;
    private double average;
    private String fio;

    public Student(int id, double average, String fio) {
        this.id = id;
        this.average = average;
        this.fio = fio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", average=" + average +
                ", fio='" + fio + '\'' +
                '}';
    }
}
