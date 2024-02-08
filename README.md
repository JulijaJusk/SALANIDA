
# The final assignment: Online clothing store "SALANIDA"
Website address: https://salanida.lt/en

Login address: https://salanida.lt/en/account/login?return_url=%2Fen%2Faccount

### Tests:
1. Try logging in using valid email and valid password:
   * enter text in input field <”Email”; (I entered “julija.demoqa@gmail.com”)
   * enter text in input field <”Password”; (I entered “SalanidaVilnius”)
   * click on button <“LOGIN”;
   
   Expected: correct account name <"Julia Roberts" appears.


2. Add new account address using valid city:
   * Login into the account using “julija.demoqa@gmail.com” username and “SalanidaVilnius” password;
   * click on button <"MANAGE ADDRESSES";
   * click on button <"ADD A NEW ADDRESS";
   * enter text “Vilnius” in the input field <"City";
   * click on button <"EDIT AN ADDRESS";
   
   Expected: entered city appears in the “DEFAULT ADDRESS” section.


3. Test search function using valid information:
   * Login into the account using “julija.demoqa@gmail.com” username and <"SalanidaVilnius" password;
   * click on search icon on the header section;
   * enter text “WHITE MOHAIR” in the input field <"SEARCH…";
   
   Expected: item with the entered keyword is found.


4. Test search function using numbers for a product that does not exist in the store:
   * Login into the account using “julija.demoqa@gmail.com” username and <"SalanidaVilnius" password;
   * click on search icon on the header section;
   * enter text “12345” in the input field <"SEARCH…";
   
   Expected: text <"No results could be found" appears.


5. Test add to cart function using first item from the search results list:
   * click on search icon on the header section;
   * enter text “MOHAIR” in the input field <"SEARCH…";
   * click the first item from the search results list;
   choose size <"L-XL";
   * click on button <"ADD TO CART";
   
   Expected: <"MELODY MOHAIR JUMPER WHITE" appears in the cart.


6. Test gift card application function using invalid code input:
   (before doing these steps you need to add an item into cart);
   * click on Terms and Conditions checkbox;
   * click on <"Checkout" button;
   * enter invalid gift card code <"NOT VALID";
   * click on button <"APPLY";
   
   Expected: message <"Enter a valid discount code or gift card" appears.
