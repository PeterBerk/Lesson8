public class Student {
    private int marks[];
    private String name;
    public Student(String name, int[] marks){
        this.marks = marks;
        this.name= name;
    }
    public int returnMarks(int mark){
        return this.marks[mark];
    }
    public int returnAverage(){
        return (this.marks[0]+this.marks[1]+this.marks[2])/3;
    }
    public String returnName(){
        return this.name;
    }
    public void reset(String name, int[] marks){
        this.marks = marks;
        this.name = name;
    }
    
}
