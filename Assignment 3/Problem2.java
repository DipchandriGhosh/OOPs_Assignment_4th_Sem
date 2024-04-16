class Problem2 {
    int age,year;
    String name,dept;
    Problem2(int a,int yr,String n,String d)//parameterized constructor
    {
        age=a;
        year=yr;
        name=n;
        dept=d;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Year : "+year);
        System.out.println("Age : "+age);
        System.out.println("Department : "+dept);
    }
    public static void main(String[] args) 
    {
        Problem2 ob=new Problem2(20, 2023, "Dipchandri", "CSE");//parameterized constructor
        ob.display();
    }
}