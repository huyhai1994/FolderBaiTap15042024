package triangleclassifier;

public class TriangleClassifier {
    public static String estimateTriangleType(int a, int b, int c) {
        String result = null;
        if (a == b && b == c && c == a) {
            result = "Tam giac deu";
        } else if (a == b && c > a && c > b) {
            result = "Tam giac can";
        } else if (a!=0 && c > b && b > a) {
            result = "Tam giac thuong";
        } else if (a <0 || b<0 ||c<0){
            result = "Khong phai tam giac";
        } else if(a>(b+c) || b>(a+c)||c>(b+a)){
            result = "Khong phai tam giac";
        } else if(a ==0 || b ==0 || c ==0){
            result = "Khong phai tam giac";
        }
        return result;
    }
}
