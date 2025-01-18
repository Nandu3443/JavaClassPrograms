class CheckedExceptionExample2{
    public static int getInteger(){
        try {
            System.out.println(10/0);
            return 20;
        } catch (Exception e) {
            return 50;
        }finally {
            return 100;
        }
    }
    public static void main(String[] args) {
        int res = getInteger();
        System.out.println(res);
    }
}