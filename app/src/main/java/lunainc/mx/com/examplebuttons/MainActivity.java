package lunainc.mx.com.examplebuttons;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {


    private Button boton;
    private ImageButton imgButton;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private ToggleButton toggleButton1;
    private ToggleButton toggleButton2;
    private SwitchCompat switchCompat;
    private FloatingActionButton floatingActionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }



    public void initViews(){
        boton = (Button) findViewById(R.id.buttonSimple1);
        imgButton = (ImageButton) findViewById(R.id.imgButton);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
        toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
        switchCompat = (SwitchCompat) findViewById(R.id.switch1);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.floatBtn);


    }


    @Override
    protected void onStart() {
        super.onStart();
        eventos();
    }




    public void eventos(){


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Boton simple 1", Toast.LENGTH_SHORT).show();
            }
        });

        boton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                Toast.makeText(MainActivity.this, "Boton simple 1 - click largo", Toast.LENGTH_SHORT).show();

                return false;
            }
        });



        imgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Boton imagenButton", Toast.LENGTH_SHORT).show();
            }
        });

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox1.isChecked()){
                    Toast.makeText(MainActivity.this, "Seleccionaste CheckBox 1", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this, "Deseleccionaste CheckBox 1", Toast.LENGTH_SHORT).show();

                }

            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBox1.isChecked()){
                    Toast.makeText(MainActivity.this, "Seleccionaste CheckBox 2", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(MainActivity.this, "Deseleccionaste CheckBox 2", Toast.LENGTH_SHORT).show();

                }
            }
        });

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Radio Button 1", Toast.LENGTH_SHORT).show();
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Radio Button 2", Toast.LENGTH_SHORT).show();
            }
        });

        radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Radio Button 3", Toast.LENGTH_SHORT).show();
            }
        });

        toggleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (toggleButton1.isChecked()){
                    Toast.makeText(MainActivity.this, "Toggle button Activado", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Toggle button desactivado", Toast.LENGTH_SHORT).show();

                }



            }
        });

        toggleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggleButton1.isChecked()){
                    Toast.makeText(MainActivity.this, "Toggle button 2 Activado", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Toggle button 2 desactivado", Toast.LENGTH_SHORT).show();

                }
            }
        });

        switchCompat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (switchCompat.isChecked()){
                    Toast.makeText(MainActivity.this, "Seleccionado", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "No Seleccionado", Toast.LENGTH_SHORT).show();
                }

            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Floating Action Button", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
