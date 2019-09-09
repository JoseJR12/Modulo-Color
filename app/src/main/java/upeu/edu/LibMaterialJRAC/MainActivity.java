package upeu.edu.LibMaterialJRAC;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.telecom.Call;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import upeu.edu.modulo.R;

public class MainActivity extends AppCompatActivity {

    private Window window;
    Spinner lista;
    String[] datos = {"Lista despegable","opcion1","opcion2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista=(Spinner)findViewById(R.id.lista1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        lista.setAdapter(adapter);


    }

    public void Window (View view){

            switch (view.getId()){
                case R.id.fondo1:
                    if (Build.VERSION.SDK_INT >= 21){
                        getWindow().setNavigationBarColor(getResources().getColor(R.color.material_blue_500));

                    }
                    getWindow().setStatusBarColor(getResources().getColor(R.color.material_blue_500));

            }
        switch (view.getId()){
            case R.id.fondo2:
                if (Build.VERSION.SDK_INT >= 21){
                    getWindow().setNavigationBarColor(getResources().getColor(R.color.material_red_500));
                }
                getWindow().setStatusBarColor(getResources().getColor(R.color.material_red_500));

        }
        switch (view.getId()){
            case R.id.fondo3:
                if (Build.VERSION.SDK_INT >= 21){
                    getWindow().setNavigationBarColor(getResources().getColor(R.color.material_green_500));
                }
                getWindow().setStatusBarColor(getResources().getColor(R.color.material_green_500));

        }
        switch (view.getId()){
            case R.id.fondo4:
                if (Build.VERSION.SDK_INT >= 21){
                    getWindow().setNavigationBarColor(getResources().getColor(R.color.material_orange_500));
                }
                getWindow().setStatusBarColor(getResources().getColor(R.color.material_orange_500));

        }
        switch (view.getId()){
            case R.id.fondo5:
                if (Build.VERSION.SDK_INT >= 21){
                    getWindow().setNavigationBarColor(getResources().getColor(R.color.material_lime_500));
                }
                getWindow().setStatusBarColor(getResources().getColor(R.color.material_lime_500));

        }
        switch (view.getId()){
            case R.id.fondo6:
                if (Build.VERSION.SDK_INT >= 21){
                    getWindow().setNavigationBarColor(getResources().getColor(R.color.material_teal_500));
                }
                getWindow().setStatusBarColor(getResources().getColor(R.color.material_teal_500));

        }
        switch (view.getId()){
            case R.id.fondo7:
                if (Build.VERSION.SDK_INT >= 21){
                    getWindow().setNavigationBarColor(getResources().getColor(R.color.material_purple_500));
                }
                getWindow().setStatusBarColor(getResources().getColor(R.color.material_purple_500));

        }
        switch (view.getId()){
            case R.id.fondo8:
                if (Build.VERSION.SDK_INT >= 21){
                    getWindow().setNavigationBarColor(getResources().getColor(R.color.material_gray_500));
                }
                getWindow().setStatusBarColor(getResources().getColor(R.color.material_gray_500));

        }



    }

}
