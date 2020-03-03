class Question3 {
    String name;
    boolean contract;
    double salary;

    Question3() {
        // line n1
//        this.name = new String("Joe");
//        this.contract = new Boolean(true);
//        this.salary = new Double(100);
    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Question3 e = new Question3();
        //line n2
        e.name = "Joe";
        e.contract = true;
        e.salary = 100.0f;
        System.out.print(e);
    }
}