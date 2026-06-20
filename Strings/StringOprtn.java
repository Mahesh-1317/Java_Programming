package Strings;

class StringOprtn {
    public static void main(String[] args) {
        String str1 = "Hey";
        String str2 = "Parth";

        //String str3 = str1 + " " + str2;

        String str3 = str1.concat(" ").concat(str2);
        System.out.println(str3.toUpperCase());
    }
}
