package pro.rudloff.lineageos_updater_shortcut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent("android.settings.SYSTEM_UPDATE_SETTINGS");
        this.startActivity(intent);
        finish();
    }
}
