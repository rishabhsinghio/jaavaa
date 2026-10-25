class Rectangle{
    int len;
    int wd;

    public void area(){
        System.out.println("Area of Rectangle = " + len*wd);
    }
    public void perimeter(){
        System.out.println("Perimeter of Rectangle = "+ 2*(len+wd));
    }

    public static void main(String[] args){
        //There are three different rectangle to calculate
        //Rectangle 1 object name will be rt1
        System.out.println("Rectangle 1 result: ");
        Rectangle rt1 = new Rectangle();
        rt1.len = 8;
        rt1.wd = 2;
        rt1.area();
        rt1.perimeter();
        //Rectangle 2 object name will be rt2
        System.out.println("Rectangle 2 result: ");
        Rectangle rt2 = new Rectangle();
        rt2.len = 4;
        rt2.wd = 5;
        rt2.area();
        rt2.perimeter();
        //Rectangle 3 object name will be rt3
        System.out.println("Rectangle 3 result: ");
        Rectangle rt3 = new Rectangle();
        rt3.len = 6;
        rt3.wd = 9;
        rt3.area();
        rt3.perimeter();
    }
}