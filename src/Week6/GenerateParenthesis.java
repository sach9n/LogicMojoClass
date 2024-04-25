package Week6;

public class GenerateParenthesis {


    public static void generateParenthesis(String get, int diff, int n){

        if(get.length()==2*n && diff==0){
            System.out.println(get);
            return;
        }

        if(get.length()==2*n || diff<0){
            return;
        }


        generateParenthesis(get+"(",diff+1,n);
        generateParenthesis(get+")",diff-1,n);
    }

    public static void main(String[] args) {
        int n = 4;
        String cha = "";
        generateParenthesis(cha,0,n);

    }
}
