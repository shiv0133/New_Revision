package InputPara_ReturnType;

public class ReturnType {

    public float div(float a, float b){
        float div=a/b ;
        System.out.println(div);
        return div;

    }

    public static void main(String[] args) {
        ReturnType obj=new ReturnType();
        obj.div(23,4);
    }
}
