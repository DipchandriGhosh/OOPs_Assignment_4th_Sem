//call by reference
class Problem4 {
    int data;
    Problem4()
    {
        data=50;
    }
    void change(Problem4 op) {
        op.data = op.data + 100;// changes will be in the instance variable
    }

    public static void main(String args[]) {
        Problem4 op = new Problem4();

        System.out.println("before change : " + op.data);
        op.change(op);// passing object
        System.out.println("after change : " + op.data);

    }
}
