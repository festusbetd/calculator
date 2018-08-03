package com.example.festu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView mAnswer;
Button mAdd,mSub,mMultiply,mDivide;
EditText firstNumber,secondNumber;

String fNum,sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAnswer = findViewById(R.id.tvAnswer);

        firstNumber=findViewById(R.id.edtFnum);
        secondNumber = findViewById(R.id.edtSnum);

        mAdd = findViewById(R.id.btnAdd);
        mSub = findViewById(R.id.btnSub);
        mMultiply = findViewById(R.id.btnMul);
        mDivide = findViewById(R.id.btnDiv);




        mAdd.setOnClickListener(this);
        mSub.setOnClickListener(this);
        mDivide.setOnClickListener(this);
        mMultiply.setOnClickListener(this);
    }
   public void onClick(View view){
        try {

       fNum = firstNumber.getText().toString();
       sNum = secondNumber.getText().toString();
       if(fNum.isEmpty()||  sNum.isEmpty()){
           Toast.makeText(this, "Fill in The Inputs", Toast.LENGTH_SHORT).show();
       } else{
       switch (view.getId()){
           case R.id.btnAdd:

               double addition = Double.parseDouble(fNum)+ Double.parseDouble(sNum);
               mAnswer.setText(String.valueOf(addition));
               break;

           case R.id.btnSub:
               double subtraction = Double.parseDouble(fNum)- Double.parseDouble(sNum);
               mAnswer.setText(String.valueOf(subtraction));
               break;

           case R.id.btnMul:
               double multiplication = Double.parseDouble(fNum)*Double.parseDouble(sNum);
               mAnswer.setText(String.valueOf(multiplication));
               break;

           case R.id.btnDiv:
               double divide = Double.parseDouble(fNum) / Double.parseDouble(sNum);
               mAnswer.setText(String.format(String.valueOf(divide)));
               break;

             default:

       }}}catch (Exception e){
            Toast.makeText(this, "Enter correct values", Toast.LENGTH_SHORT).show();
        }
   }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
