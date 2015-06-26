package makanan.a;
import java.util.ArrayList;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class phplogin extends Activity implements OnClickListener {
	Button loginBtn;
	EditText user, pass;
	EditText status;
	private String url = "http://127.0.0.1/android/loginDB.php";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		user = (EditText) findViewById(R.id.editText1);
		pass = (EditText) findViewById(R.id.textView2);
		status = (EditText) findViewById(R.id.editText3);
		loginBtn = (Button) findViewById(R.id.button1);
		loginBtn.setOnClickListener(this);
	}

	public void onClick(View a) {
		// TODO Auto-generated method stub
		kirimData();
	}

	private void kirimData() {
		// TODO Auto-generated method stub
		ArrayList<NameValuePair> kirimkephp = new ArrayList<NameValuePair>();
		kirimkephp.add(new BasicNameValuePair("auser", user.getText()
				.toString()));
		kirimkephp.add(new BasicNameValuePair("apass", pass.getText()
				.toString()));
		String respon = null;
		try {
			respon = clientToServer.eksekusiHttpPost(url, kirimkephp);
			String res = respon.toString();
			res = res.trim();
			Toast.makeText(this, res.toString(), Toast.LENGTH_SHORT).show();
			status.setText(res.toString());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
