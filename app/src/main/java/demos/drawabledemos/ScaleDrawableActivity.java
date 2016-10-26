package demos.drawabledemos;

import android.app.Activity;
import android.graphics.drawable.ScaleDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by wanghb on 16/10/25.
 */
public class ScaleDrawableActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_drawable);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        final ScaleDrawable scaleDrawable = (ScaleDrawable) imageView.getDrawable();
        scaleDrawable.setLevel(1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scaleDrawable.setLevel(scaleDrawable.getLevel() + 100);
            }
        });
    }
}
