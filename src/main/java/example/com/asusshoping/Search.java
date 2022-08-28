package example.com.asusshoping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Search extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        String textView;

    }
    public void onButtonClicked3(View view){
        EditText editText = (EditText) findViewById(R.id.search);


        if (editText.getText().toString().equals("김치찌개")){
            Intent intent = new Intent(Search.this, Kimchi_stew.class);
            startActivity(intent);
        } else if (editText.getText().toString().equals("된장찌개")){
            Intent intent = new Intent(Search.this, Soybean_Paste_Stew.class);
            startActivity(intent);
        } else if (editText.getText().toString().equals("제육볶음")){
            Intent intent = new Intent(Search.this, stir_fried_pork.class);
            startActivity(intent);
        } else if (editText.getText().toString().equals("카레")){
            Intent intent = new Intent(Search.this, Curry.class);
            startActivity(intent);
        }

    }
}