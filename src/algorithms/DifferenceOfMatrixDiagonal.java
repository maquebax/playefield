package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferenceOfMatrixDiagonal {

static class Result {

    public  static int diagnolDiff(List<List<Integer>> arr){
        int left =0, right =0;
        int n = arr.size();
                for(int i =0 ; i<arr.size(); i++){
                    left = left + arr.get(i).get(i);
                    right = right + arr.get(i).get(n-i-1);
                }

        System.out.println("********************** left " + left);
        System.out.println("********************** right " + right);
        return Math.abs(right - left);
    }

}

public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine().trim());
    List<List<Integer>> arr = new ArrayList<>();
    IntStream.range(0,n).forEach(i->{

        try {
            arr.add(
                    Stream.of(br.readLine().replaceAll("\\s+$", "").split
                            (" ")).map(Integer::parseInt).collect(Collectors.toList()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       });
    System.out.println("********************** " + Result.diagnolDiff(arr));

    }


}
