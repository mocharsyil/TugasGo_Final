package id.ac.uinsgd.kelompok2.tugasgologin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import id.ac.uinsgd.kelompok2.tugasgo.Catatan;
import id.ac.uinsgd.kelompok2.tugasgo.DialogForm;
import id.ac.uinsgd.kelompok2.tugasgo.RecyclerAdapter;

public class MainActivity3 extends AppCompatActivity {

    FloatingActionButton fb_add;
    RecyclerAdapter recyclerAdapter;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();
    ArrayList<Catatan> listCatatan;
    RecyclerView rv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        fb_add = findViewById(R.id.fb_add);
        rv_view = findViewById(R.id.rv_view);

        RecyclerView.LayoutManager cLayout= new LinearLayoutManager(this);
        rv_view.setLayoutManager(cLayout);
        rv_view.setItemAnimator(new DefaultItemAnimator());

        fb_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogForm dialogForm = new DialogForm("", "","","Tambah");
                dialogForm.show(getSupportFragmentManager(), "form");
            }
        });

        showData();
    }

    private void showData(){
        databaseReference.child("data").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
            listCatatan = new ArrayList<>();
                for(DataSnapshot item : snapshot.getChildren()){
                    Catatan ctt = item.getValue(Catatan.class);
                    ctt.setKey(item.getKey());
                    listCatatan.add(ctt);
                }

                recyclerAdapter = new RecyclerAdapter(listCatatan, MainActivity3.this);
                rv_view.setAdapter(recyclerAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}