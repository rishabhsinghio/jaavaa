class Student{
    String name;
    int age;
    String course;

    public void displayDetails(){
        System.out.print("Name: "+ name + " Age: "+age+" Course: "+course);
    }

    public static void main(String[] args){
        Student bca = new Student();
        bca.name = "Ritesh";
        bca.age = 20;
        bca.course = "B.Tech";
        bca.displayDetails();
    }
}