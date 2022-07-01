package id.ac.uinsgd.kelompok2.tugasgologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrakBasdatActivity extends AppCompatActivity {
    Button lmsPrakBasdat;
    Button absenPrakBasdat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prak_basdat);
        lmsPrakBasdat = findViewById(R.id.lmsPrakBasdat);

        lmsPrakBasdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://eknows.uinsgd.ac.id/course/view.php?id=8523");
            }
        });

        absenPrakBasdat = findViewById(R.id.absenPrakBasdat);
        absenPrakBasdat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://eknows.uinsgd.ac.id/mod/attendance/view.php?id=185304");
            }
        });

    }

    private void goLink(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}