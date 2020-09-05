package com.example.android.bluetoothlegatt;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class tabs extends Activity {

    private TextView energy;
    private TextView speed,distance,power;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);
       speed = (TextView) findViewById(R.id.speedid);
       energy= (TextView) findViewById(R.id.energy);
       power= (TextView) findViewById(R.id.pwrid);
       distance= (TextView) findViewById(R.id.distid);
        float energ;
        float spd;
        float dist;
        float pwr;
        BluetoothLeService service = new BluetoothLeService();
        if ((service.ene).equals(null)){energy.setText(0);}
        else{
        energ=Float.valueOf(service.ene)/100;
        energy.setText(String.valueOf(energ));}
        if ((service.spe).equals(null)){speed.setText(0);}
        else{
        spd = Float.valueOf(service.spe)/100;
        speed.setText(String.valueOf(spd));}
        if ((service.dist).equals(null)){distance.setText(0);}
        else {
            dist = Float.valueOf(service.dist) / 100;
            distance.setText(String.valueOf(dist));
        }
        if (service.pwr==null){power.setText(0);}
        else{
        pwr = Float.valueOf(service.pwr)/100;
        power.setText(String.valueOf(pwr));

            }


};}


