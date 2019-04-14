package com.example.carinscrollview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Vehicle> list = new ArrayList<>();
    private EditText etCompany, etYear, etColor, etPurchasePrice, etEngneSize;
    private Button btnCreate, btnClear;
    private TextView tvOutput;

    private int vehicleCount = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCompany = (EditText) findViewById(R.id.etCompany);
        etYear = (EditText) findViewById(R.id.etYear);
        etColor = (EditText) findViewById(R.id.etColor);
        etPurchasePrice = (EditText) findViewById(R.id.etPurchasePrice);
        etEngneSize = (EditText) findViewById(R.id.etEngineSize);

        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnClear = (Button) findViewById(R.id.btnClear);

        tvOutput = (TextView) findViewById(R.id.tvResult);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            String company, color;
            int year, purchasePrice;
            float engineSize;

            @Override
            public void onClick(View view) {
                if(validateEmpty()) {
                    company = etCompany.getText().toString().trim();
                    color = etColor.getText().toString().trim();
                    year = Integer.parseInt(etYear.getText().toString().trim());
                    purchasePrice = Integer.parseInt(etPurchasePrice.getText().toString().trim());
                    engineSize = Float.parseFloat(etEngneSize.getText().toString().trim());

                    vehicleCount++;

                    String title = "This is vehicle no: " + vehicleCount + "\n";
                    String body = "Manufacturer: " + company + " | Color: " + color + " " + " | Price: NRs. " + purchasePrice + "\n\n";
                    tvOutput.append(title + body);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etColor.setText("");
                etCompany.setText("");
                etPurchasePrice.setText("");
                etYear.setText("");
                etEngneSize.setText("");
            }
        });

    }

    private boolean validateEmpty() {
        if (TextUtils.isEmpty(etCompany.getText().toString())) {
            etCompany.setError("ENTER COMPANY NAME");
            etCompany.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(etYear.getText().toString())) {
            etYear.setError("ENTER YEAR");
            etYear.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(etColor.getText().toString())) {
            etColor.setError("ENTER COLOR");
            etColor.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(etPurchasePrice.getText().toString())) {
            etPurchasePrice.setError("ENTER PURCHASE PRICE");
            etPurchasePrice.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(etEngneSize.getText().toString())) {
            etEngneSize.setError("ENTER ENGINE SIZE");
            etEngneSize.requestFocus();
            return false;
        }
        return true;
    }
}
