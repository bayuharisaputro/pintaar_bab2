package id.pintaar.bab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvTest;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private List<CarModel> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvTest = findViewById(R.id.recycler_view);
        rvTest.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        rvTest.setLayoutManager(layoutManager);
        list.add(new CarModel("merah","Ford","mustang", "gasoline"));
        list.add(new CarModel("biru","toyota","prius", "electicity"));
        list.add(new CarModel("hijau","volkswagen","golf", "diesel"));
        list.add(new CarModel("merah","volkswagen","golf", "diesel"));

        adapter = new RecyclerAdapter(this,list);
        rvTest.setAdapter(adapter);
        adapter.notifyDataSetChanged();


    }
}
