package makanan.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public abstract class sharing extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
         Button shareit =(Button)findViewById(R.id.button3);
         shareit.setOnClickListener(this);}
    public void onClick(View ab){
	share();
	
}

private void share(){
	Intent sharingIntent = new Intent(Intent.ACTION_SEND);
	sharingIntent.setType("text/html");
	sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, Html.fromHtml("<p>Thisis the text that will be shared </p>"));
	startActivity(Intent.createChooser(sharingIntent, "Sharing Using"));
	
}
}
