package com.example.tx.ndkdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText_num1,editText_num2;
    private TextView textView_result;

    //加载动态链接库
    static {
        System.loadLibrary("add");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_num1 = (EditText) findViewById(R.id.editText_num1);
        editText_num2 = (EditText) findViewById(R.id.editText_num2);
        textView_result = (TextView) findViewById(R.id.textView);
    }

    public void addClick(View view){
        String num1 = editText_num1.getText().toString().trim();
        String num2 = editText_num2.getText().toString().trim();
        int reslut = add(Integer.parseInt(num1),Integer.parseInt(num2));
        textView_result.setText("结果："+reslut);
    }

    public native int add(int num1,int num2);
}
