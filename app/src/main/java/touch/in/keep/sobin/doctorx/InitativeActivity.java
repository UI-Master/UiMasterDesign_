package touch.in.keep.sobin.doctorx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class InitativeActivity extends AppCompatActivity {

    ImageView imageView;
    String photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initative);

        Bundle b =getIntent().getExtras();

         photo =b.getString("file");
        imageView= (ImageView) findViewById(R.id.photo);
        Glide
                .with(this)
                .load(photo)
                .into(imageView);

    }
    public void onBackPressed(){
        super.onBackPressed();
        finish();
    }
}
