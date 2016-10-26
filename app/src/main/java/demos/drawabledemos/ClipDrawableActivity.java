package demos.drawabledemos;

import android.app.Activity;
import android.graphics.drawable.ClipDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by wanghb on 16/10/25.
 */
public class ClipDrawableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip_drawable);
//        ImageView imageView = (ImageView) findViewById(R.id.image);
//        final ClipDrawable drawable = (ClipDrawable) imageView.getDrawable();
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                drawable.setLevel(drawable.getLevel() + 10);
//            }
//        });
    }
}
