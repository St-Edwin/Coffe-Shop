package com.example.cc.coffe_shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private Button btnOrder;

    TextView tv;
    TextView tv2;

    private Button Order;
    final double COFFEE=20;
    final double HOT=35;
    final double CUPPA=30;

    double amount=0;
    double Total=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox=(CheckBox) findViewById(R.id.checkBox);
        checkBox2=(CheckBox) findViewById(R.id.checkBox2);
        checkBox3=(CheckBox) findViewById(R.id.checkBox3);

        tv=(TextView) findViewById(R.id.textView);
        tv2=(TextView) findViewById(R.id.textView2);
        btnOrder=(Button)findViewById(R.id.button);



    }

    public void Coffee (View view){

        checkBox=(CheckBox) findViewById(R.id.checkBox);
        if (checkBox.isChecked()){

            amount = amount + COFFEE;

            Toast.makeText(MainActivity.this,"$   "+ amount,Toast.LENGTH_LONG).show();
        }else
        {

            amount = amount -COFFEE;
            Toast.makeText(MainActivity.this,"$   "+ amount,Toast.LENGTH_LONG).show();
        }
    }
public void Hot(View view){

    checkBox2=(CheckBox) findViewById(R.id.checkBox2);

    if (checkBox2.isChecked()){

        amount = amount+ HOT;

        Toast.makeText(MainActivity.this,"$  " + amount,Toast.LENGTH_LONG).show();
    }else

        amount = amount - HOT;

    Toast.makeText(MainActivity.this,"$  " + amount,Toast.LENGTH_LONG).show();
}

public void Cuppa(View view){

    checkBox3=(CheckBox) findViewById(R.id.checkBox3);

    if (checkBox3.isChecked()){

        amount= amount+ CUPPA;
        Toast.makeText(MainActivity.this,"$ " + amount,Toast.LENGTH_LONG).show();
    }else

        amount= amount- CUPPA;
    Toast.makeText(MainActivity.this,"$ " + amount,Toast.LENGTH_LONG).show();
}

   public void total(View view){

       tv2=(TextView) findViewById(R.id.textView2);

    Total= Total + amount;
    tv2.setText("$ " + Total);

    }


}
