<html>
   <head>
      <meta content="text/html; charset=UTF-8" http-equiv="content-type">
   </head>
   <body class="c4 c18">
      <h1 class="c5" id="h.g4ms7p50hwuz"><span class="c15">Foodkart:</span></h1>
      <h4 class="c11" id="h.g1oj7efeaa95"><span class="c14">Description:</span></h4>
      <p class="c13"><span class="c0">Foodkart is starting a new online food ordering service. In this Service, users can order food from a restaurant which is serviceable in their area and the restaurant will deliver it.</span></p>
      <h4 class="c11" id="h.i01wbcufj0mj"><span class="c14">Features:</span></h4>
      <ol class="c12 lst-kix_6xrkt1cx7bq2-0 start" start="1">
         <li class="c1 c3 li-bullet-0"><span class="c0">Restaurants can only serve one specialized dish.</span></li>
         <li class="c1 c3 li-bullet-0"><span class="c0">Restaurants can serve in multiple areas.</span></li>
         <li class="c1 c3 li-bullet-0"><span class="c0">At a time, users can order from one restaurant, and the quantity of food can be more than one.</span></li>
         <li class="c1 c3 li-bullet-0"><span class="c0">Users should be able to rate any restaurant with or without comment.</span></li>
         <li class="c1 c3 li-bullet-0"><span class="c0">Rating of a restaurant is the average rating given by all customers.</span></li>
      </ol>
      <h4 class="c11" id="h.tlbp5cwpxibq"><span class="c14">Requirements:</span></h4>
      <ol class="c12 lst-kix_34n9y8pm7cnn-0 start" start="1">
         <li class="c1 c3 li-bullet-0"><span class="c0">Register a User:</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-1 start" start="1">
         <li class="c6 c3 li-bullet-0"><span class="c0">register_user(user_details) </span></li>
         <li class="c6 c3 li-bullet-0"><span class="c0">user_details: name, gender, phoneNumber(unique) and pincode.</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-0" start="2">
         <li class="c1 c3 li-bullet-0"><span class="c0">Users should be able to login, and all the operations will happen in the context of that user. If another user logged in, the previous user will automatically be logged out.</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-1 start" start="1">
         <li class="c6 c3 li-bullet-0"><span class="c0">login_user(user_id): &nbsp;this should set the context for all the next operation to be done by this user.</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-0" start="3">
         <li class="c1 c3 li-bullet-0"><span class="c0">Register a restaurant in context of login user:</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-1 start" start="1">
         <li class="c6 c3 li-bullet-0"><span class="c0">Register_restaurant(resturant_name, list of serviceable pin-codes, food item &nbsp;name, food item price, initial quantity).</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-0" start="4">
         <li class="c1 c3 li-bullet-0"><span class="c0">Restaurant owners should be able to increase the quantity of the food item.</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-1 start" start="1">
         <li class="c6 c3 li-bullet-0"><span class="c0">update_quantity(restaurant name, quantity to Add)</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-0" start="5">
         <li class="c1 c3 li-bullet-0"><span class="c0">Users should be able to rate(1(Lowest)-5(Highest)) any restaurant with or without comment.</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-1 start" start="1">
         <li class="c3 c6 li-bullet-0"><span class="c0">rate_restaurant(restaurant name, rating, comment)</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-0" start="6">
         <li class="c1 c3 li-bullet-0"><span class="c0">User should be able to get list of all serviceable restaurant, food item name and price in descending order: show_restaurant(rating/price)</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-1 start" start="1">
         <li class="c6 c3 li-bullet-0"><span class="c0">Based on rating</span></li>
         <li class="c6 c3 li-bullet-0"><span class="c0">Based on Price</span></li>
      </ol>
      <p class="c6"><span class="c16">NOTE: </span><span class="c0">A restaurant is serviceable when it delivers to the user&#39;s pincode and has non-zero quantity of food item.</span></p>
      <ol class="c12 lst-kix_34n9y8pm7cnn-0" start="7">
         <li class="c1 c3 li-bullet-0"><span class="c0">Place an order from any restaurant with any allowed quantity.</span></li>
      </ol>
      <ol class="c12 lst-kix_34n9y8pm7cnn-1 start" start="1">
         <li class="c6 c3 li-bullet-0"><span class="c0">place_order(restaurant name, quantity)</span></li>
      </ol>
      <h4 class="c11" id="h.z7095zw3yett"><span class="c14">Bonus:</span></h4>
      <ol class="c12 lst-kix_zfgcncspqjsa-0 start" start="1">
         <li class="c1 c3 li-bullet-0"><span class="c0">Order History of User: For a given user you should be able to fetch order history.</span></li>
      </ol>
      <h4 class="c7" id="h.nava6yte4zjs"><span class="c14">Other Details:</span></h4>
      <ol class="c12 lst-kix_peyl0f2l61qk-0 start" start="1">
         <li class="c2 li-bullet-0"><span class="c0">Do not use any database or NoSQL store, use in-memory store for now. </span></li>
         <li class="c2 li-bullet-0"><span class="c0">Do not create any UI for the application.</span></li>
         <li class="c2 li-bullet-0"><span class="c0">Write a driver class for demo purposes. Which will execute all the commands at one place in the code and test cases.</span></li>
         <li class="c2 li-bullet-0"><span class="c0">Please prioritize code compilation, execution and completion.</span></li>
         <li class="c2 li-bullet-0"><span class="c0 c4">Please do not access the internet for anything EXCEPT syntax.</span></li>
         <li class="c2 li-bullet-0"><span class="c0 c4">You are free to use the language of your choice.</span></li>
         <li class="c2 li-bullet-0"><span class="c4">All work should be your own. If found otherwise, you may be disqualified.</span></li>
      </ol>
      <h4 class="c7" id="h.wij2qzg5wzwz"><span class="c14">Expectations:</span></h4>
      <ol class="c12 lst-kix_bitxgv4i06te-0 start" start="1">
         <li class="c2 li-bullet-0"><span class="c4">Code should be </span><span class="c4">demoable</span><span class="c0 c4">&nbsp;(very important)</span></li>
         <li class="c2 li-bullet-0"><span class="c0 c4">Complete coding within the duration of 90 minutes.</span></li>
         <li class="c2 li-bullet-0"><span class="c0 c4">Code should be modular, with Object Oriented design. Maintain good separation of concerns.</span></li>
         <li class="c2 li-bullet-0"><span class="c0 c4">Code should be extensible. It should be easy to add/remove functionality without rewriting the entire codebase.</span></li>
         <li class="c2 li-bullet-0"><span class="c0 c4">Code should handle edge cases properly and fail gracefully.</span></li>
         <li class="c2 li-bullet-0"><span class="c0 c4">Code should be readable. Follow good coding practices:</span></li>
         <li class="c2 li-bullet-0"><span class="c0 c4">Use intuitive variable names, function names, class names etc.</span></li>
         <li class="c2 li-bullet-0"><span class="c0 c4">Indent code properly.</span></li>
      </ol>
      <h4 class="c7" id="h.3djpyfshy4t9"><span class="c14">Sample Test Case:</span></h4>
      <p class="c13"><span class="c0">All the inputs here are just indicating the high level inputs that function should accept. You are free to model entities as per your choice.</span></p>
      <p class="c9"><span class="c0"></span></p>
      <p class="c1"><span class="c0">register_user(&ldquo;Pralove&rdquo;, &ldquo;M&rdquo;, &ldquo;phoneNumber-1&rdquo;, &ldquo;HSR&rdquo;)</span></p>
      <p class="c1"><span class="c0">register_user(&ldquo;Nitesh&rdquo;, &ldquo;M&rdquo;, &ldquo;phoneNumber-2&rdquo;, &ldquo;BTM&rdquo;)</span></p>
      <p class="c1"><span class="c0">register_user(&ldquo;Vatsal&rdquo;, &ldquo;M&rdquo;, &nbsp;&ldquo;phoneNumber-3&rdquo;, &ldquo;BTM&rdquo;)</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">login_user(&ldquo;phoneNumber-1&rdquo;)</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">register_restaurant(&ldquo;Food Court-1&rdquo;, &ldquo;BTM/HSR&rdquo;, &ldquo;NI Thali&rdquo;, 100, 5)</span></p>
      <p class="c1"><span class="c4 c16 c17">NOTE</span><span class="c0 c4">: we will have 2 delimiters in input : &#39;,&#39; to specify separate fields &amp; &#39;/&#39; to identify different pincodes.</span></p>
      <p class="c1"><span>register_restaurant(&ldquo;Food Court-2&rdquo;, &ldquo;BTM&rdquo;, &ldquo;Burger&rdquo;, 120, 3)</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">login_user(&ldquo;phoneNumber-2&rdquo;)</span></p>
      <p class="c1"><span class="c0">register_restaurant(&ldquo;Food Court-3&rdquo;, &ldquo;HSR&rdquo;, &ldquo;SI Thali&rdquo;, 150, 1)</span></p>
      <p class="c1"><span class="c0">login_user(&ldquo;phoneNumber-3&rdquo;)</span></p>
      <p class="c1"><span class="c0">show_restaurant(&ldquo;price&rdquo;)</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">Output : &nbsp;Food Court-2, Burger</span></p>
      <p class="c1"><span class="c0">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Food Court-1, NI Thali</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">place_order(&ldquo;Food Court-1&rdquo;, 2)</span></p>
      <p class="c1"><span class="c0">Output: Order Placed Successfully.</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">place_order(&ldquo;&ldquo;Food Court-2&rdquo;, 7)</span></p>
      <p class="c1"><span class="c0">Output : Cannot place order</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">create_review(&ldquo;Food Court-2&rdquo;, 3, &ldquo;Good Food&rdquo;)</span></p>
      <p class="c1"><span class="c0">create_review(&ldquo;Food Court-1&rdquo;, 5, &ldquo;Nice Food&rdquo;)</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">show_restaurant(&ldquo;rating&rdquo;)</span></p>
      <p class="c1"><span class="c0">Output : &nbsp;Food Court-1, NI Thali</span></p>
      <p class="c1"><span class="c0">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;Food Court-2, Burger</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">login_user(&ldquo;phoneNumber-1&rdquo;)</span></p>
      <p class="c1"><span class="c0">update_quantity(&ldquo;Food Court-2&rdquo;, 5)</span></p>
      <p class="c1"><span class="c0">Output: Food Court-2, BTM, Burger - 8</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c1"><span class="c0">update_location(&ldquo;Food Court-2&rdquo;, &ldquo;BTM/HSR&rdquo;)</span></p>
      <p class="c8"><span class="c0">Output: Food Court-2, &ldquo;BTM/HSR&rdquo;, Burger - 8</span></p>
      <p class="c1 c10"><span class="c0"></span></p>
      <p class="c9"><span class="c0"></span></p>
      <p class="c9"><span class="c0"></span></p>
      <p class="c9"><span class="c0"></span></p>
      <p class="c9"><span class="c0"></span></p>
      <p class="c9"><span class="c0"></span></p>
   </body>
</html>
