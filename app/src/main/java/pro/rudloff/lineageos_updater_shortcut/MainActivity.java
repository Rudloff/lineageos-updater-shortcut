package pro.rudloff.lineageos_updater_shortcut;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            this.startActivity(new Intent("android.settings.SYSTEM_UPDATE_SETTINGS"));
        } catch (RuntimeException exception) {
            Toast.makeText(this, R.string.launch_error, Toast.LENGTH_SHORT).show();
        }

        finish();
    }
}
