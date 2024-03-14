package String;

/**
 * @Author: Chenxy
 * @Date: 6/3/2024  下午6:12
 * @Version 1.0
 */
public class StringBuilderDemo {
    private int[] ints;

    public static void main(String[] args) {

        int[] ints={1,2,3};

        System.out.println(getStringForInts(ints));


    }

    public static   String getStringForInts(int[] ints){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i=0;i<ints.length;i++){
            if (i==ints.length-1){
                stringBuilder.append(ints[i]);
            }
            else {

                stringBuilder.append(ints[i]).append(",");
            }
        }
        stringBuilder.append("]");
        return  stringBuilder.toString();
    }
}
