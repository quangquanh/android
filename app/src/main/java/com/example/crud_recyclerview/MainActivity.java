package com.example.crud_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.crud_recyclerview.model.Spinner.Cat;
import com.example.crud_recyclerview.model.Spinner.CatAdapter;
import com.example.crud_recyclerview.model.Spinner.SpinnerAdapter;

public class MainActivity extends AppCompatActivity {
    private int[] imgs = {R.drawable.anh1, R.drawable.anh2, R.drawable.anh3,
            R.drawable.anh4, R.drawable.anh5, R.drawable.anh6};
    private Spinner sp;
    private RecyclerView recyclerView;
    private CatAdapter catAdapter;
    private EditText name, desc, price;
    private Button btnAdd, btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        catAdapter = new CatAdapter(this);
        LinearLayoutManager manager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(catAdapter);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"moi nhap lai",Toast.LENGTH_LONG);
                Cat cat = new Cat();
                    String i = sp.getSelectedItem().toString();
                    String n = name.getText().toString();
                String d = desc.getText().toString();
                int img = R.drawable.anh1;
                double p = 0;
                    try {
                    img = imgs[Integer.parseInt(i)];
                    p = Double.parseDouble(price.getText().toString());
                    }catch (NumberFormatException e){
                        Toast.makeText(getApplicationContext(),"moi nhap lai",Toast.LENGTH_LONG);
                    }
                    cat.setName(n);
                    cat.setDescripe(d);
                    cat.setImg(img);
                    cat.setPrice(p);
                    catAdapter.addCat(cat);
            }
        });
    }

    private void initView() {
        Toast.makeText(getApplicationContext(),"moi nhap lai",Toast.LENGTH_LONG);

        sp = findViewById(R.id.img);
        SpinnerAdapter spinnerAdapter = new SpinnerAdapter(this);
        sp.setAdapter(spinnerAdapter);
        recyclerView = findViewById(R.id.recycleView);
        name = findViewById(R.id.name);
        desc = findViewById(R.id.description);
        price = findViewById(R.id.price);

        btnUpdate = (Button) findViewById(R.id.btnUpdate);
    }
}