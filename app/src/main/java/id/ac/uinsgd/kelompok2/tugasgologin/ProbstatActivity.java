package id.ac.uinsgd.kelompok2.tugasgologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProbstatActivity extends AppCompatActivity {
    Button lmsProbstat;
    Button absenProbstat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_probstat);
        lmsProbstat = findViewById(R.id.lmsProbstat);

        lmsProbstat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://eknows.uinsgd.ac.id/course/view.php?id=8527");
            }
        });

        absenProbstat = findViewById(R.id.absenProbstat);
        absenProbstat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://eknows.uinsgd.ac.id/mod/attendance/view.php?id=185714");
            }
        });

    }

    private void goLink(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}