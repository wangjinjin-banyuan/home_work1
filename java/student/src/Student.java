

public class Student {
    protected String name;
    public Student(String name){
        setName(name);

    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
    public void studyMeth(){
        System.out.println(name+"好好学习，天天向上！");
    }
}
