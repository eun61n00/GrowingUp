package ch03;

public class StringBuilderTest {

    public static void main(String[] args) {
        String java = new String("Java");
        String android = new String("Android");

        StringBuilder builder = new StringBuilder(java);
        System.out.println(System.identityHashCode(builder));

        builder.append(android);

        String test = builder.toString();
        System.out.println(System.identityHashCode(builder));
        System.out.println(test);
    }

}
