package be_study_8.quiz.quiz52;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Quiz52Main {

	public static void main(String[] args) throws Exception  {

		String jsonString = "{\"id\":1,\"name\":\"JohnDoe\",\"contacts\":[{\"type\":\"email\",\"value\":\"john.doe@example.com\"},{\"type\":\"phone\",\"value\":\"01023456789\"}],\"address\":{\"street\":\"123MainStreet\",\"city\":\"Seoul\",\"zipcode\":\"12345\"},\"orders\":[{\"orderId\":\"ORD-001\",\"date\":\"2024-07-09\",\"items\":[{\"id\":1,\"name\":\"Smartphone\",\"quantity\":2},{\"id\":2,\"name\":\"Laptop\",\"quantity\":1}]},{\"orderId\":\"ORD-002\",\"date\":\"2024-07-10\",\"items\":[{\"id\":3,\"name\":\"Headphones\",\"quantity\":1}]}]}";

		JSONParser parser = new JSONParser();
		JSONObject obj = (JSONObject) parser.parse(jsonString);

		CustomerDTO customerDTO = new CustomerDTO();

		// customerDTO.setId( Integer.parseInt(obj.get("id").toString()) );
		// customerDTO.setName(obj.get("name").toString());

		customerDTO.setId(objectToInt(obj.get("id")));
		customerDTO.setName(objectToString(obj.get("name")));

		JSONArray contactsArray = (JSONArray) obj.get("contacts");
		List<Contact> contacts = new ArrayList<Contact>();
		for (int i = 0; i < contactsArray.size(); i++) {
			JSONObject contactObject = (JSONObject) contactsArray.get(i);

			Contact contact = new Contact();
			contact.setType(objectToString(contactObject.get("type")));
			contact.setValue(objectToString(contactObject.get("value")));
			contacts.add(contact);
		}
		customerDTO.setContacts(contacts);

		JSONObject addressObject = (JSONObject) obj.get("address");
		Address address = new Address();

		address.setStreet(objectToString(addressObject.get("street")));
		address.setCity(objectToString(addressObject.get("city")));
		address.setZipcode(objectToString(addressObject.get("zipcode")));

		customerDTO.setAddress(address);

		JSONArray ordersArray = (JSONArray) obj.get("orders");
		List<Order> orders = new ArrayList<Order>();

		for (int i = 0; i < ordersArray.size(); i++) {
			JSONObject orderObject = (JSONObject) ordersArray.get(i);

			Order order = new Order();
			order.setOrderId(objectToString(orderObject.get("orderId")));
			order.setDate(objectToString(orderObject.get("date")));

			JSONArray itemsArray = (JSONArray) orderObject.get("items");
			List<Item> items = new ArrayList<Item>();
			for (int j = 0; j < itemsArray.size(); j++) {
				JSONObject itemObject = (JSONObject) itemsArray.get(j);
				Item item = new Item();

				item.setId(objectToInt(itemObject.get("id")));
				item.setName(objectToString(itemObject.get("name")));
				item.setQuantity(objectToInt(itemObject.get("quantity")));

				items.add(item);
			}

			order.setItems(items);

			orders.add(order);
		}

		customerDTO.setOrders(orders);

		System.out.println(customerDTO); // JSON 파싱 -> DTO

	}

	public static int objectToInt(Object obj) {
		return Integer.parseInt(obj.toString());
	}

	public static String objectToString(Object obj) {
		if (obj == null)
			return null; // return "";
		else
			return obj.toString();
	}

}
