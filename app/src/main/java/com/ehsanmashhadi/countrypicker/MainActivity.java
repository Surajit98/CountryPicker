package com.ehsanmashhadi.countrypicker;

import android.os.Bundle;
import android.widget.Toast;

import com.ehsanmashhadi.library.view.CountryPicker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = new ArrayList<>();
        list.add("ALBANIA");
        list.add("ALgERia");

        CountryPicker countryPicker = new CountryPicker.Builder(this).showingDialCode(false).setPreSelectedCountry("guam").exceptCountriesName(list).showingFlag(false)
                .sortBy(CountryPicker.Sort.NONE).setViewType(CountryPicker.ViewType.BOTTOMSHEET).enablingSearch(true).setListener(country ->
                        Toast.makeText(this, country.getName(), Toast.LENGTH_LONG).show()).enableAutoDetectCountry(CountryPicker.DetectionMethod.LOCALE, country -> {
                    Toast.makeText(this, country.getName(), Toast.LENGTH_LONG).show();
                }).build();
        countryPicker.show(this);

    }

}
