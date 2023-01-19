package ch05;

public class Main {
    public static void main(String[] args) {
        BaseA bs1 = new BaseA(222, "BaseA");
        bs1.showClass();
        System.out.println("------------------");
        SubB sb1 = new SubB(333, "SubB");
        sb1.showClass();
        System.out.println("------------------");
        BaseA bs2 = new SubB(777, "casting to BaseA");
        bs2.showClass();
    }
}
class BaseA{
    int var1;
    String str1;
    public BaseA(int var1, String str1) {
        this.var1 = var1;
        this.str1 = str1;
    }
    public void showClass(){
        System.out.println("var1 = " + var1);
        System.out.println("str1 = " + str1);
        System.out.println("<Base method>");
    }
}
class SubB extends BaseA{
    public SubB(int var1, String str1) {
        super(var1, str1);
    }
    @Override
    public void showClass() {
        super.showClass();
        System.out.println("[method override]");
    }
}