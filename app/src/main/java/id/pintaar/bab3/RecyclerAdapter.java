package id.pintaar.bab3;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<CarModel> rvData;
    private Context context;

    public RecyclerAdapter(Context context, List<CarModel> inputData) {
        this.rvData = inputData;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View v;
         ViewHolder vh;
         if(viewType == 0) {
             v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
             vh = new FirstHolder(v);
         }
         else {
             v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout2, parent, false);
             vh = new SecondHolder(v);
         }

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(rvData.get(position).warna.equals("biru")) {
            FirstHolder firstHolder = (FirstHolder) holder;
            firstHolder.merk.setText(rvData.get(position).merk);
            firstHolder.type.setText(rvData.get(position).type);
            firstHolder.warna.setText(rvData.get(position).warna);
            firstHolder.bahanBakar.setText(rvData.get(position).bahanBakar);
        }
        else {
            final SecondHolder secondHolder = (SecondHolder) holder;
            secondHolder.merk.setText(rvData.get(position).merk);
            secondHolder.type.setText(rvData.get(position).type);
            secondHolder.warna.setText(rvData.get(position).warna);
            secondHolder.bahanBakar.setText(rvData.get(position).bahanBakar);
            secondHolder.btnTest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Snackbar snackbar;
                    snackbar = Snackbar.make(secondHolder.parent,"haloooo", Snackbar.LENGTH_LONG).setDuration(8000);
                    snackbar.show();
                }
            });
        }

       //set holder

    }

    @Override
    public int getItemViewType(int position) {
        int a =0;
        if(!rvData.get(position).warna.equals("biru")) {
            a = 1;

        }
        return a;
    }

    @Override
    public int getItemCount() {
        return rvData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    public class FirstHolder extends ViewHolder {
        TextView merk,type,warna,bahanBakar;


        public FirstHolder(View v) {
            super(v);
            merk = v.findViewById(R.id.tv_merk);
            type = v.findViewById(R.id.tv_type);
            warna = v.findViewById(R.id.tv_warna);
            bahanBakar = v.findViewById(R.id.tv_bahanBakar);
         //inisiasi id view
        }
    }

    public class SecondHolder extends ViewHolder {
        TextView merk,type,warna,bahanBakar;
        Button btnTest;
        CardView parent;



        public SecondHolder(View v) {
            super(v);
            merk = v.findViewById(R.id.tv_merk);
            type = v.findViewById(R.id.tv_type);
            warna = v.findViewById(R.id.tv_warna);
            bahanBakar = v.findViewById(R.id.tv_bahanBakar);
            btnTest = v.findViewById(R.id.btn_test);
            parent = v.findViewById(R.id.parent);
            //inisiasi id view
        }
    }

}
