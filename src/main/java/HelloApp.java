public class HelloApp {
    public static void main(String[] args) {

        if (args.length > 0) {

            StringBuilder nameBuilder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {

                nameBuilder.append(args[i]);

                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }

            String names = nameBuilder.toString();
            System.out.println("Hello, " + names + "!");

        } else {
            System.out.println("Hello, World!");
        }
    }
}