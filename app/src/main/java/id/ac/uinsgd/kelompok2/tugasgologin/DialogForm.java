package id.ac.uinsgd.kelompok2.tugasgo;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import id.ac.uinsgd.kelompok2.tugasgologin.R;

public class DialogForm extends DialogFragment {
    String nama,catatan,key, pilih;

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    public DialogForm(String nama, String catatan, String key, String pilih ) {
        this.nama = nama;
        this.catatan = catatan;
        this.key = key;
        this.pilih = pilih;
    }

    TextView et_nama;
    TextView et_catatan;

    Button btnSimpan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.input_form, container, false);

        et_nama = view.findViewById(R.id.et_nama);
        et_catatan = view.findViewById(R.id.et_catatan);
        btnSimpan = view.findViewById(R.id.btnSimpan);
        et_nama.setText(nama);
        et_catatan.setText(catatan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama= et_nama.getText().toString();
                String catatan = et_catatan.getText().toString();

                if (TextUtils.isEmpty(nama)){
                    input((EditText) et_nama, "nama");
                }else if(TextUtils.isEmpty(catatan)){
                    input((EditText) et_catatan, "catatan");
                }else{
                    if(pilih.equals("Tambah")){
                        databaseReference.child("data").push().setValue(new Catatan(nama, catatan)).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(view.getContext(), "Data Tersimpan", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(view.getContext(), "Data Tidak Tersimpan", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }else {
                        databaseReference.child("data").child(key).setValue(new Catatan(nama, catatan)).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(view.getContext(), "Data Berhasil diubah", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(view.getContext(), "Data Tidak Berhasil diubah", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }

                }
            }
        });
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();

        Dialog dialog = getDialog();
        if(dialog != null){
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }


    }

    private void input(EditText txt, String s){
        txt.setError(s+"nama tidak boleh kosong");
        txt.requestFocus();
    }
}
