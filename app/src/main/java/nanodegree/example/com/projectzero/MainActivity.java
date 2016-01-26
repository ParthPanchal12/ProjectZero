package nanodegree.example.com.projectzero;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button spotifyStreamer=(Button)findViewById(R.id.spotifyButton);
        Button scoresApp=(Button)findViewById(R.id.scoresAppButton);
        Button libraryApp=(Button)findViewById(R.id.libraryAppButton);
        Button buildItBigger=(Button)findViewById(R.id.buildItBiggerButton);
        Button baconReader=(Button)findViewById(R.id.baconReaderButton);
        Button CapStone=(Button)findViewById(R.id.CapStoneButton);
        View.OnClickListener c=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.spotifyButton:{
                        Toast.makeText(getApplication(),"This button will launch my Spotify Streamer app!",Toast.LENGTH_LONG).show();
                        break;
                    }
                    case R.id.scoresAppButton:{
                        Toast.makeText(getApplication(),"This button will launch my Football Scores app!",Toast.LENGTH_LONG).show();
                        break;
                    }
                    case R.id.libraryAppButton:{
                        Toast.makeText(getApplication(),"This button will launch my Library app!",Toast.LENGTH_LONG).show();
                        break;
                    }
                    case R.id.buildItBiggerButton:{
                        Toast.makeText(getApplication(),"This button will launch my Build It Bigger app!",Toast.LENGTH_LONG).show();
                        break;
                    }
                    case R.id.baconReaderButton:{
                        Toast.makeText(getApplication(),"This button will launch my XYZ Reader app!",Toast.LENGTH_LONG).show();
                        break;
                    }
                    case R.id.CapStoneButton:{
                        Toast.makeText(getApplication(),"This button will launch my capstone app!",Toast.LENGTH_LONG).show();
                        break;
                    }
                }
            }
        };
        spotifyStreamer.setOnClickListener(c);
        scoresApp.setOnClickListener(c);
        libraryApp.setOnClickListener(c);
        buildItBigger.setOnClickListener(c);
        baconReader.setOnClickListener(c);
        CapStone.setOnClickListener(c);
    }
}
