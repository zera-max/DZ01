package com.example.dz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int cash = 312;
    private int coat = 70;
    private int coatDiscount = 77;

    private  int hat = 25;
    private int hatDiscount = 37;

    private  int suit = 53;
    private int suitDiscount = 44;

    private int shirt = 19;
     private int shoes = 41;
     private  int shoesDiscount = 32;

     private float calculation () {
         float count = ( coat * (100 - coatDiscount) + hat * (100 - hatDiscount) + suit * (100 - suitDiscount)
                 + shirt + shoes * (100 - shoesDiscount))/100;
         return count;
     }
     private boolean possibility() {
         if (calculation() <= cash){
             return  true;
         } else {
             return false;
         }
     }
     private float balance() {
         if (possibility()) {
             return cash - calculation();
         } else {
             return -1;
         }
     }
     private TextView possibilityOut;
     private TextView balanceOut;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        possibilityOut = findViewById(R.id.possibilityOut);
        balanceOut = findViewById(R.id.balanceOut);
        if (possibility()) {
            possibilityOut.setText("Имеется достаточно средств для покупки");
            balanceOut.setText("Остаток от покупки" + balance() + " монет");
        } else {
            possibilityOut.setText("Недостаточно средств для покупки");
            balanceOut.setText("-");
        }

    }
}