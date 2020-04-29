public class Main {
    public static void main(String[] args) {
        Pupil a = new Pupil("小学生");
        MiddleSchoolStudent b = new MiddleSchoolStudent("初中生");
        SenioHighSchoolStudent c = new SenioHighSchoolStudent("大学生");
        a.studyMeth();
        b.studyMeth();
        c.studyMeth();

    }
}
