package touch.in.keep.sobin.doctorx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void profile(View view){
        Intent intent =new Intent(MainActivity.this,ProfileActivity.class);
        startActivity(intent);
    }
    public void Activity(View view){
        Intent intent =new Intent(MainActivity.this,RecordActivity.class);
        startActivity(intent);
    }
}
