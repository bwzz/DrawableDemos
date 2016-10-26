package demos.drawabledemos;

import android.graphics.drawable.LevelListDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by wanghb on 16/10/25.
 */
public class LevelListDrawableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_list_drawable);
        final TextView textView = (TextView) findViewById(android.R.id.text1);
        final LevelListDrawable levelListDrawable = (LevelListDrawable) textView.getBackground();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                levelListDrawable.setLevel((levelListDrawable.getLevel() + 1) % 4);
                textView.setText(String.valueOf(levelListDrawable.getLevel()));
            }
        });
    }
}
