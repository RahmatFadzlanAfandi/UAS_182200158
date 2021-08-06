package ac.id.atmaluhur.uas1822500158aplikasipasiencovid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.RadioButton;
public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void keluar(View View) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void tambah(View View) {
        Intent i = new Intent(this, TambahdataActivity.class);
        startActivity(i);
    }
    public void tampil(View View) {
        Intent i = new Intent(this, TampildataActivity.class);
        startActivity(i);
    }
}