import java.util.*;

public class StockStack {
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1; //1 iss lie because day cound kr rahe h 0th idx pr 1 day count hogayaha no. of consecutive days for which prive <= todays price
        s.push(0);

        for(int i=1; i<stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice >= stocks[s.peek()]){//jabtak hamara currprice > stack top
                s.pop();
            }
            if(s.isEmpty()) {
                span[i] = i + 1;
            }else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for(int i = 0; i<span.length; i++) {
            System.out.println(span[i]+ " ");
        }
    } 
}
