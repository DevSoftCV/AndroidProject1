package some.s;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AndroidProject1Activity extends Activity {
	Button button;
	EditText editText;
    
	/** Called when the activity is first created. */
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        button = (Button) findViewById(R.id.button2);
      
        
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	//editText = (EditText) v.findViewById(R.id.editText1);
            	button.setText("editText.getText()");
            	
            }
        });
    }
}