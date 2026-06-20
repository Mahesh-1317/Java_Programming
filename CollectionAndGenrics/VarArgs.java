package CollectionAndGenrics;

class VarArgs {
    public static void main(String[] args) {
        System.out.print(concatenate("Salman Khan"));
        System.out.print(concatenate("is","smoking"));
        System.out.print(concatenate("cigeratte."));
    }

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
