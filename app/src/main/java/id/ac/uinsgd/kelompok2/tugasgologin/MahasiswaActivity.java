package id.ac.uinsgd.kelompok2.tugasgo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import id.ac.uinsgd.kelompok2.tugasgologin.R;

public class MahasiswaActivity extends AppCompatActivity {
    TextView nim1, nim2, nim3, nim4;
    TextView mahasiswa1, mahasiswa2, mahasiswa3, mahasiswa4;
    ProgressDialog loading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

        nim1 = findViewById(R.id.nim1);
        nim2 = findViewById(R.id.nim2);
        nim3 = findViewById(R.id.nim3);
        nim4 = findViewById(R.id.nim4);

        mahasiswa1 = findViewById(R.id.arsyil);
        mahasiswa2 = findViewById(R.id.afian);
        mahasiswa3 = findViewById(R.id.syarif);
        mahasiswa4 = findViewById(R.id.mahran);

//        tampilData();
    }

//    private void tampilData() {
//        loading = ProgressDialog.show(MahasiswaActivity.this, "Memuat Data", "Mohon Tunggu...");
//        RequestQueue queue = Volley.newRequestQueue(this);
//        String url = "https://fir-api-16c44-default-rtdb.firebaseio.com/-NKVwspVe1p3-R3oi3yW.json?auth=HNHAG2Laryv6F8IJtvxyijV525VQGwZu9oX07guH";
//        JSONObject jsonObject = new JSONObject();
//        final String requestBody = jsonObject.toString();
//
//        StringRequest stringRequest = new StringRequest(
//                Request.Method.GET, url, new Response.Listener<String>() {
//            @Override
//            public void onResponse(String response) {
//                try {
////                    JSONArray jo = new JSONArray(response);
////                    Log.d("arsyil", jo.getJSONObject(0).getString("nama"));
////                    String arsyil = jo.getJSONObject(0).getString("nama");
////                    mahasiswa1.setText(arsyil);
////                    loading.cancel();
////
////                    Log.d("afian", jo.getJSONObject(0).getString("nama"));
////                    String afian = jo.getJSONObject(0).getString("nama");
////                    mahasiswa2.setText(afian);
////                    loading.cancel();
////
////                    Log.d("syarif", jo.getJSONObject(0).getString("nama"));
////                    String syarif = jo.getJSONObject(0).getString("nama");
////                    mahasiswa3.setText(syarif);
////                    loading.cancel();
////
////                    Log.d("mahran", jo.getJSONObject(0).getString("nama"));
////                    String mahran = jo.getJSONObject(0).getString("nama");
////                    mahasiswa4.setText(mahran);
////                    loading.cancel();
//
//
//
////                    Log.d("spaghetti", jo.getJSONObject(1).getString("details"));
////                    String spaghetti = jo.getJSONObject(1).getString("details");
////                    spaghetti_description.setText(spaghetti);
////                    loading.cancel();
////
////                    Log.d("burger", jo.getJSONObject(2).getString("details"));
////                    String burger = jo.getJSONObject(2).getString("details");
////                    burger_description.setText(burger);
////                    loading.cancel();
////
////                    Log.d("steak", jo.getJSONObject(3).getString("details"));
////                    String steak = jo.getJSONObject(3).getString("details");
////                    steak_description.setText(steak);
////                    loading.cancel();
//
//
////                } catch (JSONException e) {
////                    e.printStackTrace();
////                }
////            }
////        }, new Response.ErrorListener() {
////            @Override
////            public void onErrorResponse(VolleyError error) {
////                loading.cancel();
////                Toast.makeText(MahasiswaActivity.this, "Gagal mengambil Rest Api" + error, Toast.LENGTH_SHORT).show();
////            }
//        }
//        );
//        queue.add(stringRequest);
//    }
}