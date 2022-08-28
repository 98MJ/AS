package example.com.asusshoping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {

    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button StartBtn = findViewById(R.id.button);

        StartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Search.class);
                startActivity(intent);
            }
        });

        OnClickListener explicitClickListener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), Map.class);
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.map);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                intent.putExtra("image", byteArray);

                startActivity(intent);
            }
        }; findViewById(R.id.btn_send).setOnClickListener(explicitClickListener);
    }

    public void onButtonClicked(View v){
        Toast.makeText(this, "원하시는 요리를 검색해주세요", Toast.LENGTH_SHORT).show();
    }
}