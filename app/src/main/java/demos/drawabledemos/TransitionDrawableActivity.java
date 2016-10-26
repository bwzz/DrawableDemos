package demos.drawabledemos;

import android.app.Activity;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by wanghb on 16/10/25.
 */
public class TransitionDrawableActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_drawable);
        ImageView imageView = (ImageView) findViewById(R.id.image);
        final TransitionDrawable transitionDrawable = (TransitionDrawable) imageView.getDrawable();
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transitionDrawable.startTransition(1000);
            }
        });
    }
}
