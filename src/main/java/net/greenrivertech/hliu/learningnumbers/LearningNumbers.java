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
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class LearningNumbers extends AppCompatActivity {

<<<<<<< HEAD
    //region old code
    /*Random r = new Random();

    public int n1 =  r.nextInt(11);
    public int n2 =  r.nextInt(11);
=======
    Random r = new Random();

    public int n1 = r.nextInt(11);
    public int n2 = r.nextInt(11);
>>>>>>> origin/master

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        while(n1==n2)
        {
<<<<<<< HEAD
            n2 =  r.nextInt(11);
=======
            n2 = r.nextInt(11);
>>>>>>> origin/master
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
<<<<<<< HEAD
        n1 =  r.nextInt(11);
        n2 =  r.nextInt(11);

        while(n1==n2 || (n1==temp1 || n1==temp2) || (n2==temp1 || n2==temp2))
        {
            n2 =  r.nextInt(11);
=======
        n1 = r.nextInt(11);
        n2 = r.nextInt(11);

        while(n1==n2 || (n1==temp1 || n1==temp2) || (n2==temp1 || n2==temp2))
        {
            n2 = r.nextInt(11);
>>>>>>> origin/master
        }

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);

        btn1.setText(""+ n1 +"");
        btn2.setText(""+ n2 +"");
    }*/
    //endregion

    //region new code
    private LearningNumbersModel model = new LearningNumbersModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_numbers);

        generate();

        showInfo();
    }

    public void handleLeftBtnClick(View v)
    {
        boolean result = model.play(model.LEFT_BTN);
        generate();
        showResult(result);
        showInfo();
    }
    public void handleRightBtnClick(View v)
    {
        boolean result = model.play(model.RIGHT_BTN);
        generate();
        showResult(result);
        showInfo();
    }

    public void generate()
    {
        model.generateNumbers();

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);

        btn1.setText("" + model.getLeftNum() + "");
        btn2.setText("" + model.getRightNum() + "");
    }

    public void showResult(boolean b)
    {
        if(b)
        {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
    }

    public void showInfo()
    {
        TextView t1 = (TextView) findViewById(R.id.gp);
        TextView t2 = (TextView) findViewById(R.id.gw);

        t1.setText("Games Played: " + model.getGamesPlayed());
        t2.setText("Games Won: " + model.getGamesWon());
    }
    //endregion
}
