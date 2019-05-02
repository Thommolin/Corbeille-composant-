package Controller;

public interface IUserOrder extends UserOrder{
	public getOrder() : Order;
	public getPlayer() : int;
	
	public Order getOrder()
	{
		return Order;
	}
}
