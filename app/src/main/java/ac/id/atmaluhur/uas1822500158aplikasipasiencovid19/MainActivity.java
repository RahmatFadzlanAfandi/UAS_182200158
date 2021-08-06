package ac.id.atmaluhur.uas1822500158aplikasipasiencovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText kolom1;
    EditText kolom2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kolom1 = (EditText) findViewById(R.id.kolom1);
        kolom2 = (EditText) findViewById(R.id.kolom2);
    }

    public void pindah(View View) {
        String kim1 = kolom1.getText().toString();
        String kim2 = kolom2.getText().toString();
        if (kim1.equals("1822500158") && kim2.equals("1822500158")) {
            Intent i = new Intent(this, DashboardActivity.class);
            startActivity(i);
        } else {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}