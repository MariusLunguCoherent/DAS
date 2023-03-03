package problems.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableFuturesChain
{

    public static void main(String[] args)
    {

    }

    static class Order
    {

        int orderId;
        String orderContent;

        public Order(int id)
        {
            orderId = id;
        }

        public int getOrderId()
        {
            return orderId;
        }

        public void setOrderId(int orderId)
        {
            this.orderId = orderId;
        }

        public String getOrderContent()
        {
            return orderContent;
        }

        public void setOrderContent(String orderContent)
        {
            this.orderContent = orderContent;
        }
    }

    static class TaskOrder implements Callable<Order>
    {

        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */
        @Override
        public Order call() throws Exception
        {
            System.out.println(" Create order ...");
            return new Order(120);
        }
    }

    static class TaskPerformPay implements Callable<Order>
    {

        private final Order orderToPay;

        public TaskPerformPay(Order order)
        {
            this.orderToPay = order;

        }

        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */

        private  void enhanceOrder(){
            orderToPay.orderContent = orderToPay.orderContent + " Payment added ";
        }
        @Override
        public Order call() throws Exception
        {
            System.out.println(" Payment for order .....");
            enhanceOrder();
            return orderToPay;
        }
    }

    static class TaskSendEmail implements Callable<Order>{
        /**
         * Computes a result, or throws an exception if unable to do so.
         *
         * @return computed result
         * @throws Exception if unable to compute a result
         */

        private final Order order;

        public TaskSendEmail(Order  order){
            this.order = order;

        }
        private  void enhanceOrder(){
            order.orderContent = order.orderContent + " Enhanced order ";
        }
        @Override
        public Order call() throws Exception
        {
            System.out.println(" Sending email .....");
            this.enhanceOrder();
            return order;
        }
    }
}
