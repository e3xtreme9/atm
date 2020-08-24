package javareview;

public class StudentMain {
    public static void main(String[] args) {

//        Student kwan = new Student();
//        kwan.id = 1;
//        kwan.name = "Khun Kwan";
//        Student kate = new Student();
//        kate.id = 2;
//        kate.name = "Khun Kate";
//
//        kwan.finalScore = 50;
//        kwan.midtermScore = 48;
//
//        System.out.println(kwan.id + " : " + kwan.name);
//        System.out.println(kate.id + " : " + kate.name);
//        System.out.println("Kwan Total Score = " + kwan.getTotalScore());
//
//        Student y = kwan;
//        y.id = 999;
//        System.out.println(kwan.id + " : " + kwan.name);
        Student kwan = new Student(55, "Kwan");
        System.out.println("ID: " + kwan.getId() + "   " + kwan.getName());
        kwan.setMidtermScore(50);
        kwan.setFinalScore(49);
        System.out.println("Kwan Total Score = " + kwan.getTotalScore());
        System.out.println(kwan.toString());
        System.out.println(kwan);
    }
}
