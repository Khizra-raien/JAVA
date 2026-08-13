public class buyAndSellStocks {
    public static int maxProfitOfStocks(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]- buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
//public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("max profit is "+ maxProfitOfStocks(prices));

        //Q3 assigmnent problem 
        int prices1[]={7,6,4,3,1};
        System.out.println("max profit is "+ maxProfitOfStocks(prices1));
    }
}
