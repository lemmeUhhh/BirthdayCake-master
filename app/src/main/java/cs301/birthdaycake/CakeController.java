package cs301.birthdaycake;

import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{
    private CakeView view;
    private CakeModel model;

    public CakeController(CakeView v)
    {
        view = v;
        model = view.getModel();
    }

    public void onClick(View v)
    {
        if(v.getId() == R.id.buttonBlowOut)
        {
            Log.d("buttonBlowOut", "blow out candles");
            model.toggleLit();
            view.invalidate();
            if(model.areCandlesLit())
            {
                ((Button) v).setText("Blow out");
            }
            else
            {
                ((Button) v).setText("Relight");
            }
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton b, boolean isChecked)
    {
        if(b.getId() == R.id.switchCandles)
        {
            Log.d("switchCandles", "toggle candles");
            model.toggleCandles();
            view.invalidate();
        }
    }

    @Override
    public void onProgressChanged(SeekBar s, int progress, boolean fromUser) {
        if(s.getId() == R.id.SeekBar)
        {
            Log.d("SeekBar", "change num candles");
            model.setNumCandles(s.getProgress());
            view.invalidate();
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
