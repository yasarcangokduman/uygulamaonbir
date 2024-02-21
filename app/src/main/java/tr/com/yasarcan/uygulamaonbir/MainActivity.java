package tr.com.yasarcan.uygulamaonbir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Integer[] notlar = new Integer[6];
    public int indis=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewbir=findViewById(R.id.textView);
        TextView textViewiki=findViewById(R.id.textView2);
        EditText editTextNum=findViewById(R.id.editTextNumber);
        Button button=findViewById(R.id.button);
        Button sil=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (indis < 6){
                int sayi;
                sayi=Integer.parseInt(editTextNum.getText().toString());
                notlar[indis]=sayi;
                indis++;
                textViewbir.setText("indis"+Integer.toString(indis));
                int toplam=0;
                for (int i=0;i<indis;i++){
                    toplam += notlar[i];
                }
                textViewiki.setText("toplam:"+Integer.toString(toplam));
                editTextNum.getText().clear();
            }
            else {
                textViewbir.setText("Dizi doldu");
            }
            }
        });
        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indis=0;
                textViewbir.setText("indis: 0");
                textViewiki.setText("Toıplam:0");
                notlar =new Integer[6];
            }
        });

    }
}