package Strings;

class TSArray {
    public static void main(String[] args) {
        String[] arr = new String[] {"Are", "O", "Samba",      "kitne", "admi","the"};

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
