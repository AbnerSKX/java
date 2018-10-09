package command;

import org.junit.jupiter.api.Test;

public class CommandDemo {

	@Test
	void test() {
		Stock stock = new Stock();
		
		Order buyOrder = new BuyStock(stock);
		Order sellOrder = new SellStock(stock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyOrder);
		broker.takeOrder(sellOrder);
		
		broker.placeOrders();
	}
}
