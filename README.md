### The final assignment: Online clothing store "SALANIDA"
Website address: https://salanida.lt/en

Login address: https://salanida.lt/en/account/login?return_url=%2Fen%2Faccount

### Tests:

   **#1. Try logging in using valid email and valid password**
   1. Enter text in input field "Email"; (I entered “julija.demoqa@gmail.com”)
   2. Enter text in input field "Password"; (I entered “SalanidaVilnius”)
   3. Click on button “LOGIN”;

   **Expected:** correct account name "Julia Roberts" appears.


   **#2. Add new account address using valid city**
   1. Login into the account using “julija.demoqa@gmail.com” username and "SalanidaVilnius" password;
   2. Click on button "MANAGE ADDRESSES";
   3. Click on button "ADD A NEW ADDRESS";
   4. Enter text “Vilnius” in the input field "City";
   5. Click on checkbox "Set as default address";
   6. Click on button "ADD A NEW ADDRESS";
   
   **Expected:** entered city appears in the “DEFAULT ADDRESS” section.


   **#3. Test search function using valid information:**
   1. Login into the account using “julija.demoqa@gmail.com” username and <"SalanidaVilnius" password;
   2. Click on search icon on the header section;
   3. Enter text “WHITE MOHAIR” in the input field "SEARCH…";
   
   **Expected:** item with the entered keyword is found.


   **#4. Test search function using numbers for a product that does not exist in the store**
   1. Login into the account using “julija.demoqa@gmail.com” username and "SalanidaVilnius" password;
   2. Click on search icon on the header section;
   3. Enter text “12345” in the input field "SEARCH…";
   
   **Expected:** text <"No results could be found" appears.


   **#5. Test add to cart function using first item from the search results list:**
   1. Click on search icon on the header section;
   2. Enter text “MOHAIR” in the input field "SEARCH…";
   3. Click the first item from the search results list;
   4. Choose size "L-XL";
   5. Click on button "ADD TO CART";
   
   **Expected:** "MELODY MOHAIR JUMPER WHITE" appears in the cart.


   **#6. Test gift card application function using invalid code input:**
   _(before doing these steps you need to add an item into cart);_
   1. Click on Terms and Conditions checkbox;
   2. Click on "Checkout" button;
   3. Enter invalid gift card code "NOT VALID";
   4. Click on button "APPLY";
   
   **Expected:** message "Enter a valid discount code or gift card" appears.
