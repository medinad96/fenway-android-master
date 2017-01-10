package zacharysafran.fenwaygardensocietyfgsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

import java.io.FileDescriptor;
import java.io.IOException;

import uk.co.senab.photoview.PhotoViewAttacher;

public class GardenMap extends AppCompatActivity {

    ImageView mImageView;
    PhotoViewAttacher mAttacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garden_map);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Any implementation of ImageView can be used!
        mImageView = (ImageView) findViewById(R.id.image_view);

        // Set the Drawable displayed
        Drawable bitmap = getResources().getDrawable(R.drawable.fenway_mapimageview);
        mImageView.setImageDrawable(bitmap);

        // Attach a PhotoViewAttacher, which takes care of all of the zooming functionality.
        // (not needed unless you are going to change the drawable later)
        mAttacher = new PhotoViewAttacher(mImageView);
    }

// If you later call mImageView.setImageDrawable/setImageBitmap/setImageResource/etc then you just need to call
    //mAttacher.update();

    }
