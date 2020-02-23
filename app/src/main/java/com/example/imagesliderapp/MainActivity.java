package com.example.imagesliderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider = findViewById(R.id.sliderImage);

        List<SlideModel>slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://images.unsplash.com/photo-1503066211613-c17ebc9daef0?ixlib=rb-1.2.1&w=1000&q=80","Tiger Bengal"));
        slideModels.add(new SlideModel("https://ichef.bbci.co.uk/news/660/cpsprodpb/BEEB/production/_108557884_gettyimages-486237421.jpg","African Lion"));
        slideModels.add(new SlideModel("https://wallup.net/wp-content/uploads/2016/01/3681-jaguars-animals-748x421.jpg","Jaguar"));
        slideModels.add(new SlideModel("https://images2.minutemediacdn.com/image/upload/c_crop,h_1188,w_2120,x_0,y_227/f_auto,q_auto,w_1100/v1554729678/shape/mentalfloss/58331-istock-479586616.jpg","Taucan"));
        slideModels.add(new SlideModel("https://10largest.com/wp-content/uploads/2019/03/fastest-land-animals-21.jpg","Cheetah"));
        slideModels.add(new SlideModel("https://media3.s-nbcnews.com/j/newscms/2019_36/2868366/190523-black-rhino-al-1308_901a090c4ecbfafeff493f486ca02193.fit-760w.jpg","Rhino"));
        imageSlider.setImageList(slideModels,true);
    }
}
