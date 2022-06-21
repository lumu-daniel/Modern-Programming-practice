package lab2_soln.prob2B;

import java.util.List;

public class Order {

    private List<OrderLine> orderLines;
    private int orderNum;

    public Order(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
        this.orderNum = orderLines.size();
        if (orderLines.size()==0){
            orderLines.add(new OrderLine(this));
            orderNum++;
        }
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }
}
