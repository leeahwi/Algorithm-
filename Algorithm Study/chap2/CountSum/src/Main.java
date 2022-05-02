import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static int CountSumFunc(int m,int[] nums){
        if(m<0){
            return 0;    //0보다 작음은 숫자 m을 만들 수 없음을 의미
        }
        if(m==0){
            return 1;    //0이면 m을 만들수 있다는 의미
        }

        int count = 0;

        for(int a:nums){
            count += CountSumFunc(m-a,nums);
        }

        return count;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        for(int i=0;i<test;i++){
            //두 정수값 받아와서 int 변환후에 nums에 저장
            int[] nums = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();

            int m = nums[0];
            int n = nums[1];

            nums = Arrays.asList(br.readLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();

            System.out.println(CountSumFunc(m,nums));


        }


    }
}
