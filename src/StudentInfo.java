public class StudentInfo {
    //this for Instance Variables
    //Current object's variable = parameter value
    String name;

    StudentInfo(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        StudentInfo s = new StudentInfo("Imran");
        s.show();
    }
}