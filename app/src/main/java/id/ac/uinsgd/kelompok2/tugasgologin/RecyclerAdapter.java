package id.ac.uinsgd.kelompok2.tugasgo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

import id.ac.uinsgd.kelompok2.tugasgologin.R;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private List<Catatan> cList;
    private Activity activity;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    public RecyclerAdapter(List<Catatan> cList, Activity activity) {
        this.cList = cList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {
        Catatan ctatan = cList.get(position);
        holder.tv_nama.setText("Matkul: "+ ctatan.getNama());
        holder.tv_catatan.setText("Catatan: "+ ctatan.getCatatan());
        holder.hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        databaseReference.child("data").child(ctatan.getKey()).removeValue().addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(activity, "Data Berhasil Dihapus", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(activity, "Data Tidak Berhasil Dihapus", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                       dialog.dismiss();
                    }
                }).setMessage("Hapus Data "+ ctatan.getNama());
                builder.show();
            }
        });

        holder.card_view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                FragmentManager manager = ((AppCompatActivity)activity).getSupportFragmentManager();

                DialogForm dialogForm = new DialogForm(ctatan.getNama(),
                        ctatan.getCatatan(),
                        ctatan.getKey(),
                        "ubah");
                dialogForm.show(manager, "form");
                return true;
            }
        });
    }

    @Override
    public int getItemCount() {
        return cList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama;
        TextView tv_catatan;

        CardView card_view;

        ImageView hapus;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_nama= itemView.findViewById(R.id.tv_nama);
            tv_catatan= itemView.findViewById(R.id.tv_catatan);

            card_view= itemView.findViewById(R.id.card_view);
            hapus= itemView.findViewById(R.id.hapus);
        }
    }
}
