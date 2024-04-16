//call by value
class Problem3 {
    int data;
    Problem3()
    {
        data=50;
    }
    void change(int data) {
        data = data + 100;// changes will be in the local variable only
    }
    public static void main(String args[]) {
        Problem3 op = new Problem3();

        System.out.println("Before change : " + op.data);
        op.change(500);
        System.out.println("After change : " + op.data);

    }
}
