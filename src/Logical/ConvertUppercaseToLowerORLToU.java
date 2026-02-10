        package Logical;

        public class ConvertUppercaseToLowerORLToU {
            public static void main(String[] args) {
                System.out.println("Main Method Started");

                String name = "KriShNa";
                StringBuilder str = new StringBuilder();
                System.out.println("Given String  : "+name);
                for (int a = 0; a < name.length(); a++) {
                    char ch = name.charAt(a);
                    if (Character.isUpperCase(ch)) {
                        str.append(Character.toLowerCase(ch)); // Convert uppercase to lowercase
                    } else if (Character.isLowerCase(ch)) {
                        str.append(Character.toUpperCase(ch)); // Convert lowercase to uppercase
                    }
                }

                System.out.println("Converted String: " + str);
            }
        }
