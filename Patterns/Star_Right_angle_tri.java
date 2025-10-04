package DSA.Patterns;

class Star_Right_angle_tri {
    void Sol(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print ("* ");
            }
            System.out.println ();
        }
    }

    public static void main (String[] args) {
        Star_Right_angle_tri obj = new Star_Right_angle_tri ();
        int N = 5;
        obj.Sol (N);
    }
}
