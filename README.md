Foodkart:
Description:
Foodkart is starting a new online food ordering service. In this Service, users can order food from a restaurant which is serviceable in their area and the restaurant will deliver it.
Features:
1.	Restaurants can only serve one specialized dish.
2.	Restaurants can serve in multiple areas.
3.	At a time, users can order from one restaurant, and the quantity of food can be more than one.
4.	Users should be able to rate any restaurant with or without comment.
5.	Rating of a restaurant is the average rating given by all customers.
6.	Requirements:
7.	Register a User:
8.	register_user(user_details) 
9.	user_details: name, gender, phoneNumber(unique) and pincode.
10.	Users should be able to login, and all the operations will happen in the context of that user. If another user logged in, the previous user will automatically be logged out.
11.	login_user(user_id):  this should set the context for all the next operation to be done by this user.
12.	Register a restaurant in context of login user:
13.	Register_restaurant(resturant_name, list of serviceable pin-codes, food item  name, food item price, initial quantity).
14.	Restaurant owners should be able to increase the quantity of the food item.
15.	update_quantity(restaurant name, quantity to Add)
16.	Users should be able to rate(1(Lowest)-5(Highest)) any restaurant with or without comment.
17.	rate_restaurant(restaurant name, rating, comment)
18.	User should be able to get list of all serviceable restaurant, food item name and price in descending order: show_restaurant(rating/price)
19.	Based on rating
20.	Based on Price
21.	NOTE: A restaurant is serviceable when it delivers to the user's pincode and has non-zero quantity of food item.
22.	Place an order from any restaurant with any allowed quantity.
23.	place_order(restaurant name, quantity)
24.	Bonus:
25.	Order History of User: For a given user you should be able to fetch order history.
26.	Other Details:
27.	Do not use any database or NoSQL store, use in-memory store for now. 
28.	Do not create any UI for the application.
29.	Write a driver class for demo purposes. Which will execute all the commands at one place in the code and test cases.
30.	Please prioritize code compilation, execution and completion.
31.	Please do not access the internet for anything EXCEPT syntax.
32.	You are free to use the language of your choice.
33.	All work should be your own. If found otherwise, you may be disqualified.
34.	Expectations:
1.	Code should be demoable (very important)
2.	Complete coding within the duration of 90 minutes.
3.	Code should be modular, with Object Oriented design. Maintain good separation of concerns.
4.	Code should be extensible. It should be easy to add/remove functionality without rewriting the entire codebase.
5.	Code should handle edge cases properly and fail gracefully.
6.	Code should be readable. Follow good coding practices:
7.	Use intuitive variable names, function names, class names etc.
8.	Indent code properly.

Sample Test Case:
All the inputs here are just indicating the high level inputs that function should accept. You are free to model entities as per your choice.

register_user(“Pralove”, “M”, “phoneNumber-1”, “HSR”)
register_user(“Nitesh”, “M”, “phoneNumber-2”, “BTM”)
register_user(“Vatsal”, “M”,  “phoneNumber-3”, “BTM”)

login_user(“phoneNumber-1”)

register_restaurant(“Food Court-1”, “BTM/HSR”, “NI Thali”, 100, 5)
NOTE: we will have 2 delimiters in input : ',' to specify separate fields & '/' to identify different pincodes.
register_restaurant(“Food Court-2”, “BTM”, “Burger”, 120, 3)

login_user(“phoneNumber-2”)
register_restaurant(“Food Court-3”, “HSR”, “SI Thali”, 150, 1)
login_user(“phoneNumber-3”)
show_restaurant(“price”)

Output :  Food Court-2, Burger
	   Food Court-1, NI Thali

place_order(“Food Court-1”, 2)
Output: Order Placed Successfully.

place_order(““Food Court-2”, 7)
Output : Cannot place order

create_review(“Food Court-2”, 3, “Good Food”)
create_review(“Food Court-1”, 5, “Nice Food”)

show_restaurant(“rating”)
Output :  Food Court-1, NI Thali
	   Food Court-2, Burger

login_user(“phoneNumber-1”)
update_quantity(“Food Court-2”, 5)
Output: Food Court-2, BTM, Burger - 8

update_location(“Food Court-2”, “BTM/HSR”)
Output: Food Court-2, “BTM/HSR”, Burger - 8
