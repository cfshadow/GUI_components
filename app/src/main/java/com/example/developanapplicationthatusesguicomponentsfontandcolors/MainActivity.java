package com.example.developanapplicationthatusesguicomponentsfontandcolors;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    TextView box,countText;
    Integer count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickMeListener(View view){
        countText = (TextView) findViewById(R.id.count);
        box = (TextView)findViewById(R.id.box);
        count++ ;
        box.setBackgroundColor(randomColor());
        countText.setText("Count : "+count);
    }
    public int randomColor(){
        Random random = new Random();
        int alpha = random.nextInt(255);
        int red = random.nextInt(255);
        int green = random.nextInt(255);
        int blue = random.nextInt(255);
        return Color.argb(alpha,red,green,blue) ;
    }
}