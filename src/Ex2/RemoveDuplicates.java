import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates
{
    public static void main(String[]args){

        ArrayList<Integer> list = new ArrayList<>();


        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++){

            list.add(input.nextInt());
        }

        removeDuplicates(list);

    }

    public static void removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer element: list){
            if (!list2.contains(element)){
                list2.add(element);
            }
        }
    }

}
