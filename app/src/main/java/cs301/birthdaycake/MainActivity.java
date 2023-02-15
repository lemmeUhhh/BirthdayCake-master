package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView view = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(view);

        Button blowOut = findViewById(R.id.buttonBlowOut);
        blowOut.setOnClickListener(controller);

        Switch candles = findViewById(R.id.switchCandles);
        candles.setOnCheckedChangeListener(controller);

        SeekBar numCandles = findViewById(R.id.SeekBar);
        numCandles.setOnSeekBarChangeListener(controller);
    }
    public void goodbye(View button)
    {
        Log.i("button", "Goodbye");
    }
}
