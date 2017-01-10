package zacharysafran.fenwaygardensocietyfgsapp;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

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

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        // Any implementation of ImageView can be used!
        mImageView = (ImageView) findViewById(R.id.image_view);

        // Set the Drawable displayed
        //Drawable bitmap = getResources().getDrawable(R.drawable.fenway_mapimageview);
        //mImageView.setImageDrawable(bitmap);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.fenway_mapimageview);
        mImageView.setImageDrawable(drawable);

        // Attach a PhotoViewAttacher, which takes care of all of the zooming functionality.
        // (not needed unless you are going to change the drawable later)
        mAttacher = new PhotoViewAttacher(mImageView);

    }

    //mAttacher.update();

}
