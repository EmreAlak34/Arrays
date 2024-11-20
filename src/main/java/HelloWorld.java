public class HelloWorld {
    public static void main (String[] args){

        double x = 10.4;
        double y = 8.4;

        double sumDouble = x + y;
        double diffDouble = x - y;
        double prodDouble = x * y;
        double divDouble =  x / y;

        System.out.println("Sum:" + sumDouble);
        System.out.println("Sub:" + diffDouble);
        System.out.println("Mult:" + prodDouble);
        System.out.println("Div:" + divDouble);

        boolean greaterthan = x > y;
        boolean lessthan = x < y;
        boolean equals = x == y;

        System.out.println("it is " + (x>y) + " that x is greater than y");
        System.out.println("lessthan:" + lessthan);
        System.out.println("equals:" + equals);



}
}
