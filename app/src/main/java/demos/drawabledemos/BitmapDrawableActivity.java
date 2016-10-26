package demos.drawabledemos;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by wanghb on 16/10/23.
 */

public class BitmapDrawableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmap_drawable);
        // 这里会使 TextView 背景的图片着色,神奇
        Drawable drawableA = DrawableCompat.wrap(ContextCompat.getDrawable(this, R.drawable.android));
        DrawableCompat.setTintList(drawableA, ContextCompat.getColorStateList(this, R.color.selector));
    }
}
