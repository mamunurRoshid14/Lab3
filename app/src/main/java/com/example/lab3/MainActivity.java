package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view){
        Spinner item =  findViewById(R.id.item);
        String selectedItem = String.valueOf(item.getSelectedItem());
        String description="";
        switch (selectedItem) {
            case "Apple":
                description = "Selected item: Apple\n\nScientific Name: Malus domestica\n\nDescription: Apples are rich in fiber, vitamin C, and various antioxidants. They come in many varieties, each with its own unique flavor and texture. Apples are also known for their health benefits, including improving heart health and reducing the risk of diabetes.";
                break;
            case "Banana":
                description = "Selected item: Banana\n\nScientific Name: Musa spp.\n\nDescription: Bananas are a good source of potassium, vitamin B6, and vitamin C. They are known for their energy-boosting properties and are often used in smoothies and desserts.";
                break;
            case "Cherry":
                description = "Selected item: Cherry\n\nScientific Name: Prunus spp.\n\nDescription: Cherries are rich in antioxidants, vitamins A and C, and fiber. They are known for their anti-inflammatory properties and can help improve sleep quality and reduce muscle soreness.";
                break;
            case "Date":
                description = "Selected item: Date\n\nScientific Name: Phoenix dactylifera\n\nDescription: Dates are high in natural sugars, fiber, potassium, and magnesium. They are known for their energy-boosting properties and can help improve digestive health.";
                break;
            case "Elderberry":
                description = "Selected item: Elderberry\n\nScientific Name: Sambucus nigra\n\nDescription: Elderberries are high in vitamin C, dietary fiber, and antioxidants. They are often used in syrups and jams and are known for their immune-boosting properties and ability to reduce cold and flu symptoms.";
                break;
        }
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(SecondActivity.EXTRA_MESSAGE, description);
        startActivity(intent);
    }
}
