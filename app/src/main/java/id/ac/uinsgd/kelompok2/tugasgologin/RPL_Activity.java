package id.ac.uinsgd.kelompok2.tugasgologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RPL_Activity extends AppCompatActivity {
    Button lmsRPL;
    Button absenRPL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpl);
        lmsRPL = findViewById(R.id.lmsRPL);

        lmsRPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://eknows.uinsgd.ac.id/course/view.php?id=8524");
            }
        });

        absenRPL = findViewById(R.id.absenRPL);
        absenRPL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://eknows.uinsgd.ac.id/mod/attendance/view.php?id=187050");
            }
        });

    }

    private void goLink(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}