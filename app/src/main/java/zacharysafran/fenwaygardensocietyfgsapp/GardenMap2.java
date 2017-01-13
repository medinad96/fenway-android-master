package zacharysafran.fenwaygardensocietyfgsapp;

/**
 * Created by slimj on 1/10/2017.
 */
/*
 * Copyright (C) 2011 Scott Lund
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import android.app.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;

import android.os.Bundle;
import android.widget.Toast;


public class GardenMap2 extends Activity{


        ImageMap mImageMap;




    public void tomapToast(int theid){
        /*Intent intent = new Intent(this, GardenMap.class);
        startActivity(intent);*/
        /*Intent intent = new Intent(this, Calender.class);
        startActivity(intent);*/


       Toast.makeText(getApplicationContext(),Integer.toString(theid),Toast.LENGTH_SHORT).show();


        if (theid == 2131558587) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            // Set the dialog title
            builder.setTitle(R.string.Accessible_Garden);
            builder.setMessage(R.string.infoAccessible_Garden);
            builder.setNegativeButton(R.string.close, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
           AlertDialog dialog = builder.create();
            dialog.show();

        }


    }

        @Override

        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_graden2);



            // find the image map in the view

            mImageMap = (ImageMap)findViewById(R.id.map);

            mImageMap.setImageResource(R.drawable.fenway_mapimageview);



            // add a click handler to react when areas are tapped

            mImageMap.addOnImageMapClickedHandler(new ImageMap.OnImageMapClickedHandler()

            {


                @Override

                public void onImageMapClicked(int id, ImageMap imageMap)

                {
                    // when the area is tapped, show the name in a
                    // text bubble
                    //mImageMap.showBubble(id)
                    tomapToast(id);


                }


                @Override

                public void onBubbleClicked(int id)

                {

                    // react to info bubble for area being tapped

                }

            });

        }


}

