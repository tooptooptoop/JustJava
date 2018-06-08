/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */

    public void increment(View view){

        quantity = quantity+1 ;
        displayQuantity(quantity);

    }
    public void decrement(View view){

        quantity =quantity-2;
        displayQuantity(quantity);
    }
    public void submitOrder(View view) {
        int price = calculatePrice();
        displayMessage(createOrderSummary(price));

    }



    /**
     * Calculates the price of the order.
     *
    
     */
    private int calculatePrice() {
        return quantity * 5;

    }
     private String createOrderSummary(int price){
         String priceMessage = "Name: Kaptain Kunal";
         priceMessage +=  "\nQuantity: " + quantity;
         priceMessage +=  "\nTotal: $" + price ;
         priceMessage += "\nThank you!";
         return priceMessage;
     }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int nummber) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + nummber);

    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}
