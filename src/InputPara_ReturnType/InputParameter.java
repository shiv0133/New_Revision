package InputPara_ReturnType;

public class InputParameter {

    public void add(int a, int b ){
        int sum=a+b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        InputParameter obj=new InputParameter();
        obj.add(3,5);
    }
}
