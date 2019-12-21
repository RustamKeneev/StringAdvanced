package com.example.stringadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    private static  final  String TAG = "ololo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String nameString = "Андрей, Алексей, Михаил, Павел, Роман";
//        String[] names = nameString.split(", ");
//        for (String name : names){
//            Log.i(TAG, "onCreate: My name " + name);
//        }
//        String geometry = "Геометрия";
//        String meter = geometry.substring(3,6);
//        Log.i(TAG, "onCreate: " + meter);

        String url = "<div class=\"channelListEntry\">\n" +
                "\t\t\t\t<a href=\"/pewdiepie\">\n" +
                "\t\t\t\t\t<div class=\"image\">\n" +
                "\t\t\t\t\t\t<img src=\"http://cdn.posh24.se/images/:profile/125c36388188a0fb85ef958158b6ef268\" alt=\"Pewdiepie\">\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\n" +
                "\t\t\t\t\t \n" +
                "\t\t\t\t\t\t\t\t\t\t<div class=\"info\">\n" +
                "\t\t\t\t\t\t<div class=\"status-container\">\n" +
                "\t\t\t\t\t\t\t<div class=\"position\">1</div>\n" +
                "\t\t\t\t\t\t\t \n" +
                "\t\t\t\t\t\t\t\t<div class=\"img pos\"></div>\n" +
                "\t\t\t\t\t\t\t\t<div class=\"value\">+16</div>\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t\t<div class=\"name\">\n" +
                "\t\t\t\t\t\t\tPewdiepie\n" +
                "\t\t\t\t\t\t</div>\n" +
                "\t\t\t\t\t</div>\n" +
                "\t\t\t\t</a>\n" +
                "\t\t\t</div>";
       Pattern patternImage = Pattern.compile("<img src=\"(.*? )\"");
       Pattern patternName = Pattern.compile("alt=\"(.*? )\"");
       Matcher matcherImage = patternImage.matcher(url);
       Matcher matcherName = patternName.matcher(url);
       while (matcherImage.find()){
           Log.i(TAG, "onCreate: " + matcherImage.group(1));
       }
        while (matcherName.find()){
            Log.i(TAG, "onCreate: " + matcherName.group(1));
        }
    }
}
