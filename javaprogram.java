class Exponent {
    public static void main(String[] args) {
        
        int x = 3;
        int n = 3;
        int pow = 1;

        for(int i = 1; i <= n; i++) {
            pow = pow * x;
        }

        System.out.println(pow);
    }
}
