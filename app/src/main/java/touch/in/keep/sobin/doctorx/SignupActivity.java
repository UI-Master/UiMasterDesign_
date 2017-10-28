package touch.in.keep.sobin.doctorx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }
    public void home(View view){
        Intent intent =new Intent(SignupActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
