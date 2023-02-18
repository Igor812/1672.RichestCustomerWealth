import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,22,1}};
        int result =0;
        for (int i = 0; i < accounts.length; i++) {
            int counter = Arrays.stream(accounts[i]).sum();
            if (counter>result) result=counter;
        }
        System.out.println(result);
    }
}
