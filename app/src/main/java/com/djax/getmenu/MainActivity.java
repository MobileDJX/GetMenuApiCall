package com.djax.getmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.djax.getmenu.model.Menu;
import com.djax.getmenu.viewModel.MainViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MainViewModel mainViewModel;
    TextView textView;
    Button btn;
    ArrayList<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewModel =  ViewModelProviders.of(this).get(MainViewModel.class);
        textView = findViewById(R.id.menuName);
        btn = findViewById(R.id.getMenu);
        list = new ArrayList<>();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMenuName();
            }
        });




    }

    public void getMenuName(){

        mainViewModel.getResponseModelLiveData().observe(this, responseModel -> {

            ArrayList<Menu> menuArrayList = responseModel.getMenuArrayList();

            String menuName = null;
            for (int i = 0; i < menuArrayList.size(); i++) {

                Menu menu = menuArrayList.get(i);
                list.add(menu.getMenuName());
                menuName = list.toString();

            }

            Log.i("TAGMenu", String.valueOf(list));
            textView.setText(menuName +"\n");


        });


    }
}