package id.ac.uinsgd.kelompok2.tugasgologin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import id.ac.uinsgd.kelompok2.tugasgologin.R;

public class PdfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        PDFView pdfView = findViewById(R.id.pdfview);

        pdfView.fromAsset("silberschatz8thedition.pdf").load();
    }
}