package dryseed.ndkapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) this.findViewById(R.id.test);

        NdkJniUtils jni = new NdkJniUtils();

        mTextView.setText(jni.getCLanguageString());
    }
}
