package net.greenrivertech.hliu.learningnumbers;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class LearningNumbers extends AppCompatActivity {

    Random r = new Random();

    public int n1 = r.nextInt(11);
    public int n2 = r.nextInt(11);

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        while(n1==n2)
        {
            n2 = r.nextInt(11);
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_numbers);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);

        btn1.setText(""+ n1 +"");
        btn2.setText(""+ n2 +"");
    }

    public void compareNumber1(View view)
    {
        int temp1 = n1;
        int temp2 = n2;

        if (n1 > n2)
        {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }

        refresh(temp1, temp2);
    }

    public void compareNumber2(View view)
    {
        int temp1 = n1;
        int temp2 = n2;

        if (n1 > n2)
        {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }

        refresh(temp1, temp2);
    }

    public void refresh(int temp1, int temp2)
    {
        n1 = r.nextInt(11);
        n2 = r.nextInt(11);

        while(n1==n2 || (n1==temp1 || n1==temp2) || (n2==temp1 || n2==temp2))
        {
            n2 = r.nextInt(11);
        }

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);

        btn1.setText(""+ n1 +"");
        btn2.setText(""+ n2 +"");
    }
}
