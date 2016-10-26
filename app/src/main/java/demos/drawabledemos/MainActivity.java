package demos.drawabledemos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });

        LinearLayout container = (LinearLayout) findViewById(R.id.content_main);
        addItem(container, "BitmapDrawable", "<bitmap_selector>", BitmapDrawableActivity.class);
        addItem(container, "ShapeDrawable", "<shape>", ShapeDrawableActivity.class);
        addItem(container, "LayerDrawable", "<layer-list>", LayerDrawableActivity.class);
        addItem(container, "StateListDrawable", "<selector>", StateListDrawableActivity.class);
        addItem(container, "LevelListDrawable", "<level-list>", LevelListDrawableActivity.class);
        addItem(container, "TransitionDrawable", "<transition>", TransitionDrawableActivity.class);
        addItem(container, "ScaleDrawable", "<scale>", ScaleDrawableActivity.class);
        addItem(container, "ClipDrawable", "<clip>", ClipDrawableActivity.class);
        addItem(container, "CustomDrawable", "none", CustomDrawableActivity.class);
    }

    private void addItem(LinearLayout container, String title, String summary, final Class<? extends Activity> activityClass) {
        View itemView = getLayoutInflater().inflate(R.layout.item_view, container, false);
        ((TextView) itemView.findViewById(android.R.id.title)).setText(title);
        ((TextView) itemView.findViewById(android.R.id.summary)).setText(summary);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, activityClass));
            }
        });
        container.addView(itemView);
    }

}
