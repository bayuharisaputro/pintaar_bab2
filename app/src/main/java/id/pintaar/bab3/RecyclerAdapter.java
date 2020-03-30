package id.pintaar.bab3;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
             v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
             vh = new FirstHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            FirstHolder firstHolder = (FirstHolder) holder;
            firstHolder.merk.setText(rvData.get(position).merk);
            firstHolder.type.setText(rvData.get(position).type);
            firstHolder.warna.setText(rvData.get(position).warna);
            firstHolder.bahanBakar.setText(rvData.get(position).bahanBakar);

       //set holder

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


        public SecondHolder(View v) {
            super(v);
            merk = v.findViewById(R.id.tv_merk);
            type = v.findViewById(R.id.tv_type);
            warna = v.findViewById(R.id.tv_warna);
            bahanBakar = v.findViewById(R.id.tv_bahanBakar);
            //inisiasi id view
        }
    }

}
