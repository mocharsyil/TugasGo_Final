package id.ac.uinsgd.kelompok2.tugasgologin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity2 extends AppCompatActivity {
    private Button buttonKelas;
    private Button buttonTodo;
    private Button buttonElibrary;
    private TextView ourtim;
    private Button logout;

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonKelas = (Button) findViewById(R.id.buttonKelas);
        buttonKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KelasActivity();
            }
        });

        buttonTodo = (Button) findViewById(R.id.buttonTodo);
        buttonTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToDoActivity();
            }
        });

        buttonElibrary = (Button) findViewById(R.id.buttonElibrary);
        buttonElibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                E_libraryActivity();
            }
        });

        ourtim = (TextView) findViewById(R.id.ourtim);
        ourtim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MahasiswaActivity();
            }
        });

        logout = findViewById(R.id.logout);
        mAuth = FirebaseAuth.getInstance();

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user== null){
            startActivity(new Intent(MainActivity2.this, MainActivity.class ));
        }

    }

    public void KelasActivity(){
        Intent intent = new Intent(this, KelasActivity.class);
        startActivity(intent);
    }

    public void ToDoActivity(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void E_libraryActivity(){
        Intent intent = new Intent(this, E_libraryActivity.class);
        startActivity(intent);
    }

    public void MahasiswaActivity(){
        Intent intent = new Intent(this, MahasiswaActivity.class);
        startActivity(intent);
    }


}