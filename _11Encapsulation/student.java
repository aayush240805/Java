package _11Encapsulation;

class student{
    private String name;
    private int roll_no;
    private int marks;

    void setname(String name){
        this.name = name;
    }
    void setroll_no(int roll_no){
        this.roll_no = roll_no;
    }
    void setmarks(int marks){
        this.marks = marks;
    }

    String getname(){
        return name;
    }
    int getroll_no(){
        return roll_no;
    }
    int getmarks(){
        return marks;
    }
}

