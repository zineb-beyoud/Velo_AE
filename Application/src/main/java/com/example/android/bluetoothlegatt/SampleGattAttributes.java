/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes {
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String Temperature ="00002a1c-0000-1000-8000-00805F9B34FB";
    public static String Humidity ="00002a6f-0000-1000-8000-00805F9B34FB";
    public static String energy="00002af0-0000-1000-8000-00805F9B34FB";
    public static String speed="00002ae1-0000-1000-8000-00805F9B34FB";
    public static String distance="00002ae0-0000-1000-8000-00805F9B34FB";
    public static String AV_power="00002b0e-0000-1000-8000-00805F9B34FB";

    static {
        // Sample Services.
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "generic access");
        attributes.put("1801", "generic attribute");
        attributes.put("0AB5B670-C2CE-C4AB-E711-6CCBAA65C888","Mesures");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
       // attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");

        attributes.put(Temperature,"Temperature");
        attributes.put(Humidity,"Humidity");
        attributes.put(energy,"energie");
        attributes.put(speed,"vitesse");
        attributes.put(distance,"distance");
        attributes.put(AV_power,"Puissance Moyenne");

    }

    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
