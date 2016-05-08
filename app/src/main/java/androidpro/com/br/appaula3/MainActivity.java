package androidpro.com.br.appaula3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animation fadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fadein);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.startAnimation(fadein);
    }
}
