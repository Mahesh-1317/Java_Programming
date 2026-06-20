class RandomNum {
    public static void main(String[] args) {
        System.out.println(Math.random());

        for(int i = 0;i < 10; i++) {
            int random = (int) Math.round(Math.random() * 100);
            System.out.println(random);
        }
    }
}
