package com.example.compiledact;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.HashMap;
import java.util.Map;

public class Activity8 extends AppCompatActivity {
    private Map<String, Integer> countryFlags;
    private ListView countryListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity8);

        countryListView = findViewById(R.id.countryListView);

        // Initialize country flags
        initializeFlags();

        // Set up custom adapter for ListView
        CustomAdapter adapter = new CustomAdapter();
        countryListView.setAdapter(adapter);

        // Handle item clicks
        countryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCountry = (String) parent.getItemAtPosition(position);
                displayFlag(selectedCountry);
            }
        });
    }

    private void initializeFlags() {
        countryFlags = new HashMap<>();
        // Add country flags with their respective resource identifiers

        countryFlags.put("USA", R.drawable.flag_usa);
        countryFlags.put("India", R.drawable.flag_india);
        countryFlags.put("France", R.drawable.flag_france);
        countryFlags.put("Japan", R.drawable.flag_japan);
        countryFlags.put("Afghanistan", R.drawable.flag_afghanistan);
        countryFlags.put("Aland Islands", R.drawable.flag_alandislands);
        countryFlags.put("Albania", R.drawable.flag_albania);
        countryFlags.put("Algeria", R.drawable.flag_algeria);
        countryFlags.put("American Samoa", R.drawable.flag_americansamoa);
        countryFlags.put("Andorra", R.drawable.flag_andorra);
        countryFlags.put("Angola", R.drawable.flag_angola);
        countryFlags.put("Anguilla", R.drawable.flag_anguilla);
        countryFlags.put("Antarctica", R.drawable.flag_antartica);
        countryFlags.put("Antigua and Barbuda", R.drawable.flag_antiguaandbarbuda);
        countryFlags.put("Argentina", R.drawable.flag_argentina);
        countryFlags.put("Armenia", R.drawable.flag_armenia);
        countryFlags.put("Aruba", R.drawable.flag_aruba);
        countryFlags.put("Australia", R.drawable.flag_australia);
        countryFlags.put("Austria", R.drawable.flag_austria);
        countryFlags.put("Azerbaijan", R.drawable.flag_azerbaijan);
        countryFlags.put("Bahamas", R.drawable.flag_bahamas);
        countryFlags.put("Bahrain", R.drawable.flag_bahrain);
        countryFlags.put("Bangladesh", R.drawable.flag_bangladesh);
        countryFlags.put("Barbados", R.drawable.flag_barbados);
        countryFlags.put("Belarus", R.drawable.flag_belarus);
        countryFlags.put("Belgium", R.drawable.flag_belgium);
        countryFlags.put("Belize", R.drawable.flag_belize);
        countryFlags.put("Benin", R.drawable.flag_benin);
        countryFlags.put("Bermuda", R.drawable.flag_bermuda);
        countryFlags.put("Bhutan", R.drawable.flag_bhutan);
        countryFlags.put("Bolivia", R.drawable.flag_bolivia);
        countryFlags.put("Bosnia and Herzegovina", R.drawable.flag_bosniaandherzegovina);
        countryFlags.put("Botswana", R.drawable.flag_botswana);
        countryFlags.put("Bouvet Island", R.drawable.flag_bouvetisland);
        countryFlags.put("Brazil", R.drawable.flag_brazil);
        countryFlags.put("British Indian Ocean Territory", R.drawable.flag_britishindianoceanterritory);
        countryFlags.put("British Virgin Islands", R.drawable.flag_britishvirginislands);
        countryFlags.put("Brunei", R.drawable.flag_brunei);
        countryFlags.put("Bulgaria", R.drawable.flag_bulgaria);
        countryFlags.put("Burkina Faso", R.drawable.flag_burkinafaso);
        countryFlags.put("Burundi", R.drawable.flag_burundi);
        countryFlags.put("Cambodia", R.drawable.flag_cambodia);
        countryFlags.put("Cameroon", R.drawable.flag_cameroon);
        countryFlags.put("Canada", R.drawable.flag_canada);
        countryFlags.put("Cape Verde", R.drawable.flag_capeverde);
        countryFlags.put("Caribbean Netherlands", R.drawable.flag_caribbeannetherlands);
        countryFlags.put("Cayman Islands", R.drawable.flag_caymanislands);
        countryFlags.put("Central African Republic", R.drawable.flag_centralafricanrepublic);
        countryFlags.put("Chad", R.drawable.flag_chad);
        countryFlags.put("Chile", R.drawable.flag_chile);
        countryFlags.put("China", R.drawable.flag_china);
        countryFlags.put("Christmas Island", R.drawable.flag_christmasisland);
        countryFlags.put("Cocos Islands", R.drawable.flag_cocosislands);
        countryFlags.put("Colombia", R.drawable.flag_colombia);
        countryFlags.put("Comoros", R.drawable.flag_comoros);
        countryFlags.put("Cook Islands", R.drawable.flag_cookislands);
        countryFlags.put("Costa Rica", R.drawable.flag_costarica);
        countryFlags.put("Cote d'Ivoire", R.drawable.flag_cotedlvoire);
        countryFlags.put("Croatia", R.drawable.flag_croatia);
        countryFlags.put("Cuba", R.drawable.flag_cuba);
        countryFlags.put("Curacao", R.drawable.flag_curacao);
        countryFlags.put("Cyprus", R.drawable.flag_cyprus);
        countryFlags.put("Czechia", R.drawable.flag_czechia);
        countryFlags.put("Denmark", R.drawable.flag_denmark);
        countryFlags.put("Djibouti", R.drawable.flag_djibouti);
        countryFlags.put("Dominica", R.drawable.flag_dominica);
        countryFlags.put("Dominican Republic", R.drawable.flag_dominicanrepublic);
        countryFlags.put("Democratic Republic of the Congo", R.drawable.flag_drcongo);
        countryFlags.put("Ecuador", R.drawable.flag_ecuador);
        countryFlags.put("Egypt", R.drawable.flag_egypt);
        countryFlags.put("El Salvador", R.drawable.flag_elsalvador);
        countryFlags.put("England", R.drawable.flag_england);
        countryFlags.put("Equatorial Guinea", R.drawable.flag_equatorguinea);
        countryFlags.put("Eritrea", R.drawable.flag_eritrea);
        countryFlags.put("Estonia", R.drawable.flag_estonia);
        countryFlags.put("Eswatini", R.drawable.flag_eswatini);
        countryFlags.put("Ethiopia", R.drawable.flag_ethiopia);
        countryFlags.put("Falkland Islands", R.drawable.flag_falklandislands);
        countryFlags.put("Faroe Islands", R.drawable.flag_faroeislands);
        countryFlags.put("Fiji", R.drawable.flag_fiji);
        countryFlags.put("Finland", R.drawable.flag_finland);
        countryFlags.put("France", R.drawable.flag_france);
        countryFlags.put("French Guiana", R.drawable.flag_frenchguiana);
        countryFlags.put("French Polynesia", R.drawable.flag_frenchpolynesia);
        countryFlags.put("French Southern Territories", R.drawable.flag_frenchsouthern);
        countryFlags.put("Gabon", R.drawable.flag_gabon);
        countryFlags.put("Gambia", R.drawable.flag_gambia);
        countryFlags.put("Georgia", R.drawable.flag_georgia);
        countryFlags.put("Germany", R.drawable.flag_germany);
        countryFlags.put("Ghana", R.drawable.flag_ghana);
        countryFlags.put("Gibraltar", R.drawable.flag_gibraltar);
        countryFlags.put("Greece", R.drawable.flag_greece);
        countryFlags.put("Greenland", R.drawable.flag_greenland);
        countryFlags.put("Grenada", R.drawable.flag_grenada);
        countryFlags.put("Guadeloupe", R.drawable.flag_guadeloupe);
        countryFlags.put("Guam", R.drawable.flag_guam);
        countryFlags.put("Guatemala", R.drawable.flag_guatemala);
        countryFlags.put("Guernsey", R.drawable.flag_guernsey);
        countryFlags.put("Guinea", R.drawable.flag_guinea);
        countryFlags.put("Guinea-Bissau", R.drawable.flag_guineabissau);
        countryFlags.put("Guyana", R.drawable.flag_guyana);
        countryFlags.put("Haiti", R.drawable.flag_haiti);
        countryFlags.put("Heard Island and McDonald Islands", R.drawable.flag_heardisland);
        countryFlags.put("Honduras", R.drawable.flag_honduras);
        countryFlags.put("Hong Kong", R.drawable.flag_hongkong);
        countryFlags.put("Hungary", R.drawable.flag_hungary);
        countryFlags.put("Iceland", R.drawable.flag_iceland);
        countryFlags.put("India", R.drawable.flag_india);
        countryFlags.put("Indonesia", R.drawable.flag_indonesia);
        countryFlags.put("Iran", R.drawable.flag_iran);
        countryFlags.put("Iraq", R.drawable.flag_iraq);
        countryFlags.put("Ireland", R.drawable.flag_ireland);
        countryFlags.put("Isle of Man", R.drawable.flag_isleofman);
        countryFlags.put("Israel", R.drawable.flag_israel);
        countryFlags.put("Italy", R.drawable.flag_italy);
        countryFlags.put("Jamaica", R.drawable.flag_jamaica);
        countryFlags.put("Japan", R.drawable.flag_japan);
        countryFlags.put("Jersey", R.drawable.flag_jersey);
        countryFlags.put("Jordan", R.drawable.flag_jordan);
        countryFlags.put("Kazakhstan", R.drawable.flag_kazakhstan);
        countryFlags.put("Kenya", R.drawable.flag_kenya);
        countryFlags.put("Kiribati", R.drawable.flag_kiribati);
        countryFlags.put("Kosovo", R.drawable.flag_kosovo);
        countryFlags.put("Kuwait", R.drawable.flag_kuwait);
        countryFlags.put("Kyrgyzstan", R.drawable.flag_kyrgyztan);
        countryFlags.put("Laos", R.drawable.flag_laos);
        countryFlags.put("Latvia", R.drawable.flag_latvia);
        countryFlags.put("Lebanon", R.drawable.flag_lebanon);
        countryFlags.put("Lesotho", R.drawable.flag_lesotho);
        countryFlags.put("Liberia", R.drawable.flag_liberia);
        countryFlags.put("Libya", R.drawable.flag_libya);
        countryFlags.put("Liechtenstein", R.drawable.flag_liechtenstein);
        countryFlags.put("Lithuania", R.drawable.flag_lithuania);
        countryFlags.put("Luxembourg", R.drawable.flag_luxembourg);
        countryFlags.put("Macau", R.drawable.flag_macau);
        countryFlags.put("Madagascar", R.drawable.flag_madagascar);
        countryFlags.put("Malawi", R.drawable.flag_malawi);
        countryFlags.put("Malaysia", R.drawable.flag_malaysia);
        countryFlags.put("Maldives", R.drawable.flag_maldives);
        countryFlags.put("Mali", R.drawable.flag_mali);
        countryFlags.put("Malta", R.drawable.flag_malta);
        countryFlags.put("Marshall Islands", R.drawable.flag_marshallislands);
        countryFlags.put("Martinique", R.drawable.flag_martinique);
        countryFlags.put("Mauritania", R.drawable.flag_mauritania);
        countryFlags.put("Mauritius", R.drawable.flag_mauritius);
        countryFlags.put("Mayotte", R.drawable.flag_mayotte);
        countryFlags.put("Mexico", R.drawable.flag_mexico);
        countryFlags.put("Micronesia", R.drawable.flag_micronesia);
        countryFlags.put("Moldova", R.drawable.flag_moldova);
        countryFlags.put("Monaco", R.drawable.flag_monaco);
        countryFlags.put("Mongolia", R.drawable.flag_mongolia);
        countryFlags.put("Montenegro", R.drawable.flag_montenegro);
        countryFlags.put("Montserrat", R.drawable.flag_montserrat);
        countryFlags.put("Morocco", R.drawable.flag_morocco);
        countryFlags.put("Mozambique", R.drawable.flag_mozambique);
        countryFlags.put("Myanmar", R.drawable.flag_myanmar);
        countryFlags.put("Namibia", R.drawable.flag_namibia);
        countryFlags.put("Nauru", R.drawable.flag_nauru);
        countryFlags.put("Nepal", R.drawable.flag_nepal);
        countryFlags.put("Netherlands", R.drawable.flag_netherlands);
        countryFlags.put("New Caledonia", R.drawable.flag_newcaledonia);
        countryFlags.put("New Zealand", R.drawable.flag_newzealand);
        countryFlags.put("Nicaragua", R.drawable.flag_nicaragua);
        countryFlags.put("Niger", R.drawable.flag_niger);
        countryFlags.put("Nigeria", R.drawable.flag_nigeria);
        countryFlags.put("Niue", R.drawable.flag_niue);
        countryFlags.put("Norfolk Island", R.drawable.flag_norfolkisland);
        countryFlags.put("Northern Ireland", R.drawable.flag_northernireland);
        countryFlags.put("Northern Mariana Islands", R.drawable.flag_northernmarianaislands);
        countryFlags.put("North Korea", R.drawable.flag_northkorea);
        countryFlags.put("North Macedonia", R.drawable.flag_northmacedonia);
        countryFlags.put("Norway", R.drawable.flag_norway);
        countryFlags.put("Oman", R.drawable.flag_oman);
        countryFlags.put("Pakistan", R.drawable.flag_pakistan);
        countryFlags.put("Palau", R.drawable.flag_palau);
        countryFlags.put("Palestine", R.drawable.flag_palestine);
        countryFlags.put("Panama", R.drawable.flag_panama);
        countryFlags.put("Papua New Guinea", R.drawable.flag_papanewguinea);
        countryFlags.put("Paraguay", R.drawable.flag_paraguay);
        countryFlags.put("Peru", R.drawable.flag_peru);
        countryFlags.put("Philippines", R.drawable.flag_ph);
        countryFlags.put("Pitcairn Islands", R.drawable.flag_pitcarinislands);
        countryFlags.put("Poland", R.drawable.flag_poland);
        countryFlags.put("Portugal", R.drawable.flag_portugal);
        countryFlags.put("Puerto Rico", R.drawable.flag_puertorico);
        countryFlags.put("Qatar", R.drawable.flag_qatar);
        countryFlags.put("Republic of the Congo", R.drawable.flag_republicofthecongo);
        countryFlags.put("Réunion", R.drawable.flag_reunion);
        countryFlags.put("Romania", R.drawable.flag_romania);
        countryFlags.put("Russia", R.drawable.flag_russia);
        countryFlags.put("Rwanda", R.drawable.flag_rwanda);
        countryFlags.put("Saint Barthélemy", R.drawable.flag_saintbarthelemy);
        countryFlags.put("Saint Helena", R.drawable.flag_sainthelena);
        countryFlags.put("Saint Kitts and Nevis", R.drawable.flag_saintkitts);
        countryFlags.put("Saint Lucia", R.drawable.flag_saintlucia);
        countryFlags.put("Saint Martin", R.drawable.flag_saintmartin);
        countryFlags.put("Saint Pierre and Miquelon", R.drawable.flag_saintpierre);
        countryFlags.put("Saint Vincent and the Grenadines", R.drawable.flag_saintvincent);
        countryFlags.put("Samoa", R.drawable.flag_samoa);
        countryFlags.put("San Marino", R.drawable.flag_sanmarino);
        countryFlags.put("Sao Tome and Principe", R.drawable.flag_saotomeandprincipe);
        countryFlags.put("Saudi Arabia", R.drawable.flag_saudiarabia);
        countryFlags.put("Senegal", R.drawable.flag_senegal);
        countryFlags.put("Serbia", R.drawable.flag_serbia);
        countryFlags.put("Seychelles", R.drawable.flag_seychelles);
        countryFlags.put("Sierra Leone", R.drawable.flag_sierraleone);
        countryFlags.put("Singapore", R.drawable.flag_singapore);
        countryFlags.put("Sint Maarten", R.drawable.sx);
        countryFlags.put("Slovakia", R.drawable.flag_slovakia);
        countryFlags.put("Slovenia", R.drawable.flag_slovenia);
        countryFlags.put("Solomon Islands", R.drawable.flag_solomonisland);
        countryFlags.put("Somalia", R.drawable.flag_somalia);
        countryFlags.put("South Africa", R.drawable.flag_southafrica);
        countryFlags.put("South Georgia and South Sandwich Islands", R.drawable.flag_southgeorgia);
        countryFlags.put("South Korea", R.drawable.flag_southkorea);
        countryFlags.put("South Sudan", R.drawable.flag_southsudan);
        countryFlags.put("Spain", R.drawable.flag_spain);
        countryFlags.put("Sri Lanka", R.drawable.flag_srilanka);
        countryFlags.put("Sudan", R.drawable.flag_sudan);
        countryFlags.put("Suriname", R.drawable.flag_suriname);
        countryFlags.put("Svalbard", R.drawable.flag_svalbardandjanmayen);
        countryFlags.put("Sweden", R.drawable.flag_sweden);
        countryFlags.put("Switzerland", R.drawable.flag_switzerland);
        countryFlags.put("Syria", R.drawable.flag_syria);
        countryFlags.put("Taiwan", R.drawable.flag_taiwan);
        countryFlags.put("Tajikistan", R.drawable.flag_tajikistan);
        countryFlags.put("Tanzania", R.drawable.flag_tanzania);
        countryFlags.put("Thailand", R.drawable.flag_thailand);
        countryFlags.put("Timor-Leste", R.drawable.flag_timorleste);
        countryFlags.put("Togo", R.drawable.flag_togo);
        countryFlags.put("Tokelau", R.drawable.flag_tokelau);
        countryFlags.put("Tonga", R.drawable.flag_tonga);
        countryFlags.put("Trinidad and Tobago", R.drawable.flag_trinidad);
        countryFlags.put("Tunisia", R.drawable.flag_tunisia);
        countryFlags.put("Turkey", R.drawable.flag_turkey);
        countryFlags.put("Turkmenistan", R.drawable.flag_turkmenistan);
        countryFlags.put("Tuvalu", R.drawable.flag_tuvalu);
        countryFlags.put("Uganda", R.drawable.flag_uganda);
        countryFlags.put("Ukraine", R.drawable.flag_ukraine);
        countryFlags.put("United Arab Emirates", R.drawable.flag_unitedarabemirates);
        countryFlags.put("United Kingdom", R.drawable.flag_unitedkingdom);
        countryFlags.put("United States", R.drawable.flag_usa);
        countryFlags.put("Uruguay", R.drawable.flag_uruguay);
        countryFlags.put("Uzbekistan", R.drawable.flag_uzbekistan);
        countryFlags.put("Vanuatu", R.drawable.flag_vanuatu);
        countryFlags.put("Vatican City", R.drawable.flag_vaticancity);
        countryFlags.put("Venezuela", R.drawable.flag_venezuela);
        countryFlags.put("Vietnam", R.drawable.flag_vietnam);
        countryFlags.put("Wallis and Futuna", R.drawable.flag_wallisandfutuna);
        countryFlags.put("Western Sahara", R.drawable.flag_westernsahara);
        countryFlags.put("Yemen", R.drawable.flag_yemen);
        countryFlags.put("Zambia", R.drawable.flag_zambia);
        countryFlags.put("Zimbabwe", R.drawable.flag_zimbabwe);

        // Add more countries as needed
    }

    private void displayFlag(String country) {
        Integer flagResId = countryFlags.get(country);
        CardView flagCardView = findViewById(R.id.flagCardView);
        ImageView flagImageView = findViewById(R.id.flagImageView);

        if (flagResId != null) {
            flagImageView.setImageResource(flagResId);
            flagCardView.setVisibility(View.VISIBLE);
        } else {
            flagCardView.setVisibility(View.GONE);
        }
    }

    // Custom Adapter for ListView
    private class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return countryFlags.size();
        }

        @Override
        public Object getItem(int position) {
            return countryFlags.keySet().toArray()[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(Activity8.this)
                        .inflate(R.layout.country_item, parent, false);
            }

            String country = (String) getItem(position);
            Integer flagResId = countryFlags.get(country);

            ImageView flagImageView = convertView.findViewById(R.id.countryFlagImageView);
            TextView countryNameTextView = convertView.findViewById(R.id.countryNameTextView);

            if (flagResId != null) {
                flagImageView.setImageResource(flagResId);
            }
            countryNameTextView.setText(country);

            return convertView;
        }
    }
}
