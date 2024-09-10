package com.example.series;

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

    Button bt;
    EditText n;
    TextView t1,s1,s2,sol1,sol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bt=findViewById(R.id.bt);
        n=findViewById(R.id.n);
        t1=findViewById(R.id.t1);
        s1=findViewById(R.id.s1);
        s2=findViewById(R.id.s2);
        sol1=findViewById(R.id.sol1);
        sol=findViewById(R.id.sol);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float num=Integer.parseInt(n.getText().toString());
                float sum=0;
                for(float i=1;i<=num;i++){
                    sum+=1/i;
                }
                sol1.setText(Float.toString(sum));
            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}