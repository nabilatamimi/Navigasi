package xir2n17.remidiuts.telkomschid.remidiuts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pindah = (Button) findViewById(R.id.nav1);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(MainActivity.this, navig1.class);
                startActivity(intentpindah);
            }
        });

        pindah = (Button) findViewById(R.id.nav2);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(MainActivity.this, navig2.class);
                startActivity(intentpindah);
            }
        });

        pindah = (Button) findViewById(R.id.nav3);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(MainActivity.this, navig3.class);
                startActivity(intentpindah);
            }
        });

        pindah = (Button) findViewById(R.id.nav4);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentpindah = new Intent(MainActivity.this, navig4.class);
                startActivity(intentpindah);
            }
        });
    }

}
