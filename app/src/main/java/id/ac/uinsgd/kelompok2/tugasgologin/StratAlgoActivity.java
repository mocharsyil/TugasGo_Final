package id.ac.uinsgd.kelompok2.tugasgologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StratAlgoActivity extends AppCompatActivity {

    Button lmsStratAlgo;
    Button absenStratAlgo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strat_algo);
        lmsStratAlgo = findViewById(R.id.lmsStratAlgo);

        lmsStratAlgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://eknows.uinsgd.ac.id/course/view.php?id=8528");
            }
        });

        absenStratAlgo = findViewById(R.id.absenStratAlgo);
        absenStratAlgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://eknows.uinsgd.ac.id/mod/attendance/view.php?id=185607");
            }
        });

    }

    private void goLink(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}