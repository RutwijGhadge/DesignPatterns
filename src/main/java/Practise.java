import java.util.ArrayList;
public class Practise {
    public static void combination(int A, int B){
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    comb(A,B,res,list,1);
        for(int i=0;i<res.size();i++){
            ArrayList<Integer> lists = res.get(i);
            for(int j=0;j<res.get(i).size();j++){
                System.out.print(lists.get(j)+ " ");
            }
            System.out.println();
        }
}
public static void comb(int A, int B, ArrayList<ArrayList<Integer>> res , ArrayList<Integer> list ,int j)
    {
        if(list.size()==B)
        {
            ArrayList<Integer> list2 = new ArrayList<>(list);
            res.add(list2);
            return;
        }
        for(int i=j;i<=A;i++)
        {
            list.add(i);        //do
            comb(A,B,res,list,i+1);
            list.remove(Integer.valueOf(i));    //undo
        }
    }
    public static void main(String[] args) {
    int A=4;
    int B=2;
        combination(A,B);
    }
}
