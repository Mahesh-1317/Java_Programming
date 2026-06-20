class PassByReference {
    public static void main(String[] args) {
        Point p = new Point(4, 8);
        System.out.println("First: " + p);
        move(p);
        System.out.println("First: " + p);
    }

    public static void move(Point p) {
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static class Point{
        int x,y;

        public Point(int x,int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("x = ").append(x);
        sb.append(", y = ").append(y);
        sb.append('}');
        return sb.toString();
    }
    }
}
