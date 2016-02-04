package ly.generalassemb.drewmahrt.shoppinglistwithdetailview;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        int receivedId = intent.getIntExtra("ID_KEY", -1);

        ShoppingSQLiteOpenHelper mHelper = ShoppingSQLiteOpenHelper.getInstance(Details.this);

        String details = mHelper.getDetailsById(receivedId);

        TextView textView = (TextView)findViewById(R.id.detailTextView);
        textView.setText(details);

    }
}
