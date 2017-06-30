package com.example.android.googlefusedlocationprovider;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by android on 7/1/2017.
 */

public class DedectedActivityIntent extends IntentService {
    private String Tag = "Dedected_is";
    public DedectedActivityIntent(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
