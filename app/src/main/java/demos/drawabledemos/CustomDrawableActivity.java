package demos.drawabledemos;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import static android.R.attr.path;

/**
 * Created by wanghb on 16/10/26.
 */
public class CustomDrawableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = new View(this);
        view.setBackgroundDrawable(new CustomDrawable());
        setContentView(view);
    }

    public class CustomDrawable extends Drawable {

        private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        @Override
        public void draw(Canvas canvas) {
//            Rect r = getBounds();
//            canvas.drawCircle(r.exactCenterX(), r.exactCenterY(), Math.min(r.exactCenterX(), r.exactCenterY()), paint);
            onDraw(canvas);
        }

        @Override
        public void setAlpha(int alpha) {
            paint.setAlpha(alpha);
            invalidateSelf();
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {

        }

        @Override
        public int getOpacity() {
            return PixelFormat.TRANSLUCENT;
        }

        protected void onDraw(Canvas canvas) {
            int width = getBounds().width();
            int r = width / 2;

            float outR = getBounds().width() / 2 / 5;
            float inR = outR * sin(18) / sin(180 - 36 - 18);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.YELLOW);
            paint.setStrokeWidth(5);


            canvas.translate(r / 5, r);
            canvas.rotate(-18);
//            Path path = getCompletePath(outR, inR);
//            paint.setStyle(Paint.Style.STROKE);
//            canvas.drawPath(path, paint);
//            path = getHalfPath(outR, inR);
//            paint.setStyle(Paint.Style.FILL);
//            canvas.drawPath(path, paint);


            canvas.rotate(18);
            canvas.translate(r / 5 * 2 + 15, 0);
            canvas.rotate(-18);
            Path path = getCompletePath(outR, inR);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawPath(path, paint);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawPath(path, paint);


//            canvas.rotate(18);
//            canvas.translate(r / 5 * 2 + 15, 0);
//            canvas.rotate(-18);
//            path = getCompletePath(outR, inR);
//            paint.setStyle(Paint.Style.STROKE);
//            canvas.drawPath(path, paint);
//
//
//            canvas.rotate(18);
//            canvas.translate(r / 5 * 2 + 15, 0);
//            canvas.rotate(-18);
//            path = getHalfPath(outR, inR);
//            paint.setStyle(Paint.Style.STROKE);
//            canvas.drawPath(path, paint);
//
//
//            canvas.rotate(18);
//            canvas.translate(r / 5 * 2 + 15, 0);
//            canvas.rotate(-18);
//            path = getHalfPath(outR, inR);
//            paint.setStyle(Paint.Style.STROKE);
//            canvas.drawPath(path, paint);
//            paint.setStyle(Paint.Style.FILL);
//            canvas.drawPath(path, paint);

        }

        private Path getHalfPath(float outR, float inR) {
            Path path;
            path = new Path();

            path.moveTo(outR * cos(72 * 4), outR * sin(72 * 4));

            path.lineTo(inR * cos(72 * 1 + 36), inR * sin(72 * 1 + 36));
            path.lineTo(outR * cos(72 * 2), outR * sin(72 * 2));
            path.lineTo(inR * cos(72 * 2 + 36), inR * sin(72 * 2 + 36));
            path.lineTo(outR * cos(72 * 3), outR * sin(72 * 3));
            path.lineTo(inR * cos(72 * 3 + 36), inR * sin(72 * 3 + 36));

            path.close();
            return path;
        }

        private Path getCompletePath(float outR, float inR) {
            Path path = new Path();

            path.moveTo(outR * cos(72 * 0), outR * sin(72 * 0));

            path.moveTo(outR * cos(72 * 0), outR * sin(72 * 0));
            path.lineTo(inR * cos(72 * 0 + 36), inR * sin(72 * 0 + 36));
            path.lineTo(outR * cos(72 * 1), outR * sin(72 * 1));
            path.lineTo(inR * cos(72 * 1 + 36), inR * sin(72 * 1 + 36));
            path.lineTo(outR * cos(72 * 2), outR * sin(72 * 2));
            path.lineTo(inR * cos(72 * 2 + 36), inR * sin(72 * 2 + 36));
            path.lineTo(outR * cos(72 * 3), outR * sin(72 * 3));
            path.lineTo(inR * cos(72 * 3 + 36), inR * sin(72 * 3 + 36));
            path.lineTo(outR * cos(72 * 4), outR * sin(72 * 4));
            path.lineTo(inR * cos(72 * 4 + 36), inR * sin(72 * 4 + 36));
            path.close();
            return path;
        }


        float cos(int num) {
            return (float) Math.cos(num * Math.PI / 180);
        }

        float sin(int num) {
            return (float) Math.sin(num * Math.PI / 180);
        }
    }

}
