package DSA.Patterns;

public class Star_square {
    public static  void main (String[] args) {
        int N = 5;
        Square (N);
    }
    static void Square(int n) {
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print ("* ");
            }
            System.out.println ();
        }
    }
}

//Other way

//Class Sol{
//
//void Sq (int n) {
//    for (int i = 0; i < n; i++) {
//        for (int j = 0; j < n; j++) {
//            System.out.print ("* ");
//        }
//        System.out.println ();
//    }
//}
//
//public static void main (String[] args) {
//    Sol obj = new Sol();
//    int N = 5;
//    obj.Sq(N);
//}
//
//}