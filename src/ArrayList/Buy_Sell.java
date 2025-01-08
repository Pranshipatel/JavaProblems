package ArrayList;

public class Buy_Sell {
    static void buy(int[] prices){
         int max = 0;
         int min = Integer.MAX_VALUE;
         for(int price : prices){
             if(price < min){
                 min = price;
             }
             else{
                 max = Math.max(max, price- min);
             }

         }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        buy(prices);
    }
}
