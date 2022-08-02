public class FourConsequtiveNumber {
    public static void main(String[] args) {
        int[] a = {4,4,4,4,5,5,8,18,8,8};
        System.out.println(isConsequtive4Number(a));
    }

    private static boolean isConsequtive4Number(int[] A) {
        for (int i=0;i<A.length-3;i++){
            if (A[i]==A[i+1] &&A[i]==A[i+2] &&A[i]==A[i+3]){
                return true;
            }
        }
        return false;
    }
}
