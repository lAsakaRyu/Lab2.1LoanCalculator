package com.practical.aldnoah.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String LOAN_STATUS = "status";
    public static final String LOAN_PAYMENT = "monthlyPayment";
    private EditText editTextCarPrice,editTextDownPayment,editTextLoanPeriod,editTextInterestRate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculateLoan(View view){
        String status = "Approve";
        double monthlyPayment = 450.0;

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(LOAN_STATUS, status);
        intent.putExtra(LOAN_PAYMENT, monthlyPayment);
        startActivity(intent);
    }
}
