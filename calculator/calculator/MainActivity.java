package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView sol;
    Button add,sub,mul,div;
    EditText i1,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        sol=findViewById(R.id.sol);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.Mul);
        add=findViewById(R.id.Add);
        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        div=findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(i1.getText().toString());
                int n2=Integer.parseInt(i2.getText().toString());
                int soln=n1+n2;
                sol.setText(Integer.toString(soln));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(i1.getText().toString());
                int n2=Integer.parseInt(i2.getText().toString());
                int soln=n1-n2;
                sol.setText(Integer.toString(soln));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(i1.getText().toString());
                int n2=Integer.parseInt(i2.getText().toString());
                int soln=n1*n2;
                sol.setText(Integer.toString(soln));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(i1.getText().toString());
                int n2=Integer.parseInt(i2.getText().toString());
                int soln=n1/n2;
                sol.setText(Integer.toString(soln));
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}