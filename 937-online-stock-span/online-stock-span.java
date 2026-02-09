class StockSpanner {
       Stack<Integer>p;
       Stack<Integer>Spans;
    public StockSpanner() {
        p=new Stack<>();
        Spans =new Stack<>();
    }
    
    public int next(int price) {
        int span=1;
        while(!p.isEmpty() && p.peek()<=price )
        {
          span=span+Spans.peek();
          p.pop();
          Spans.pop();
        }
       p.push(price);
       Spans.push(span);
       return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */