class PassByValue {
    public static void main(String[] args) {
        int x = 5,y = 10;
        int sum = add(x, y);
        System.out.printf("x = %d, y = %d, Sum = %d",x,y,sum);
    } 
    public static int add(int a,int b) {
        //a += b;
        a = 99;
        return a;
    }
}