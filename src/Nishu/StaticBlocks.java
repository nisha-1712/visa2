package Nishu;

public class StaticBlocks {
    static {
        System.out.println("Block concept");
    }
    static {
        System.out.println("In Block concept .class file is created at the time of compilation ");
    }
    static {
        System.out.println("static block is executed before the instance block");
    }
    public static void main(String[]args){

    }
}
