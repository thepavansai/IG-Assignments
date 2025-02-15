class Student{
    int rollno;
    String fname;
    Student(){

    }
    Student(int rollno,String fname){
        this.rollno=rollno;
        this.fname=fname;
    }
    void modify(int rollno){
        this.rollno=rollno;
    }
    void modify(String fname){
        this.fname=fname;
    }
    public String toString(){
        return "RollNo: "+rollno+"\tFullName: "+fname;
    }
}
class Constructors{
    public static void main(String []args){
        Student s=new Student();
        System.out.println(s);
        s.modify(69);
        System.out.println(s);
        s.modify("Batman");
        System.out.println(s);
        System.out.println(new Student(666,"Superman"));
    }
}