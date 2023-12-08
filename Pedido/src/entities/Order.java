package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities_enuns.OrderStatus;

public class Order {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	
	private Client client;
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	
	public Order() {	
		
	}
		

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}





	public Date getMoment() {
		return moment;
	}


	public void setMoment(Date moment) {
		this.moment = moment;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}

	/*
	 // para proteger a lista somente será alterado pelos metodos addItem e removeItem
	public List<OrderItem> getItems() {
		return items;
	}

*/

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	
	
	public double total() {
		double sum = 0.0;
		
		for (OrderItem it : items) {
			sum += it.subTotal();
		}
		
		return sum;
	}
	
	public String toString() {
		 // Cria um objeto StringBuilder, que é uma classe do Java usada para manipular strings de maneira eficiente.
		StringBuilder sb = new StringBuilder();
		// Adiciona informações ao StringBuilder usando o método append().
		// Adiciona a string "Order moment: " seguida da formatação da data e hora do pedido.
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		// Adiciona a string "Order status: " seguida do status do pedido.
		sb.append("Order status: ");
		sb.append(status + "\n");
		// Adiciona a string "Client: " seguida da representação em string do cliente.
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Ordem items: ");
		// Adiciona a string "Order items: " seguida dos itens do pedido.
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		 // Adiciona a string "Total price: $" seguida do preço total do pedido formatado com duas casas decimais.
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		// Converte o StringBuilder para uma string usando o método toString() e retorna essa string.
		return sb.toString();
			
		
	}
	
	
}
