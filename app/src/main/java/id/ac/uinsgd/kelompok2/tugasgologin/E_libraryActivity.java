package id.ac.uinsgd.kelompok2.tugasgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;

import id.ac.uinsgd.kelompok2.tugasgologin.R;
import id.ac.uinsgd.kelompok2.tugasgologin.pdfRplActivity;

public class E_libraryActivity extends AppCompatActivity {
    ImageButton imageButton,imageButton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elibrary);

        imageButton = findViewById(R.id.soPdf);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(E_libraryActivity.this, PdfActivity.class);
                startActivity(intent);
            }
        });

        imageButton2 = findViewById(R.id.rplPdf);

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(E_libraryActivity.this, pdfRplActivity.class);
                startActivity(intent);
            }
        });

    }
}