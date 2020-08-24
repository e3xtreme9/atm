package javareview;

public class Student {

    //----- access specifier / modifier
    // ระบุการเข้าถึงตัวแปรและเมทอดมี 4 ระดับ
    // public , package , private , protected

    //----- 1. field , attribute , instance variable -----
    private int id;
    private String name;
    private double midtermScore;
    private double finalScore;
    // ----- 2. constructor
    // ถูกเรียกตอนสร้างออปเจ็ค ช่วยกำหนดค่าเริ่มต้นให้ field
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //------ 3. method (คล้ายฟังก์ชั่น) -----

    public double getTotalScore() {
        double total = midtermScore + finalScore;
        return total;
    }

    public String toString(){
        return id + " -- " + name;
    }

    // ----- Getter & Setter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMidtermScore() {
        return midtermScore;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMidtermScore(double midtermScore) {
        this.midtermScore = midtermScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }
}
