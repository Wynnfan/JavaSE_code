public class StaticDemo2{
    public static void main(String[] args){
        int[] arr = new int[20];

        ArrayTool.fill(arr,50);
        arr[5] = 30;
        System.out.println(ArrayTool.find(arr,30));
        System.out.println(StringTool.indexOf("www.sikiedu.com",'i'));
    }
}

class ArrayTool{

    private ArrayTool(){}
    public static void fill(int[] array,int number){
        for (int i=0;i<array.length;i++){
            array[i] = number;
        }
    }
    public static int find(int[] array,int number){
        int index = -1;
        for (int i=0;i<array.length;i++){
            if (array[i] == number){
                index = i;
                break;
            }
        }
        return index;
    }
}

class StringTool{
    private StringTool(){}
    public static int indexOf(String str,char c){
        int index = -1;
        for (int i=0;i<str.length();i++){
            if (c == str.charAt(i)){
                index = i;
                break;
            }
        }
        return index;
    }
}
