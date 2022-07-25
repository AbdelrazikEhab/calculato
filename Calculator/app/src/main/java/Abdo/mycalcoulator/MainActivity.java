package Abdo.mycalcoulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText edit;
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,equal,add,min,mul,div;
int n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit=findViewById(R.id.edit);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        add=findViewById(R.id.B_add);
        min=findViewById(R.id.B_min);
        mul=findViewById(R.id.B_Mul);
        div=findViewById(R.id.B_div);
        equal=findViewById(R.id.B_equal);

       n1=Integer.parseInt(b1.getText().toString());
        n2=Integer.parseInt(b2.getText().toString());
    b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
              edit.setText(edit.getText()+"1");
            }
            });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edit.setText(edit.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edit.setText(edit.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edit.setText(edit.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edit.setText(edit.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edit.setText(edit.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edit.setText(edit.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edit.setText(edit.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edit.setText(edit.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                edit.setText(edit.getText()+"0");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edit==null)
                    edit.setText("");
                else
                edit.setText(edit.getText()+"+");

            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edit==null)
                    edit.setText("");
                else
                    edit.setText(edit.getText()+"-");

            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edit==null)
                    edit.setText("");
                else
                    edit.setText(edit.getText()+"/");

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(edit==null)
                    edit.setText("");
                else
                    edit.setText(edit.getText()+"*");

            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int result =n1+n2;

                edit.setText(Integer.toString(result));


            }
        });
    }
}