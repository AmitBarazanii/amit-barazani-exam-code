//AMIT BARAZANI
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand=new Random();
    List<String> charac;
    String[] THEWORDS=new String[]{"alon","hila","amit","tom","amos","eran","ron","alin","nadav","taylorswift"};
    TextView after,score;
    EditText ans;
    String Theword=rndWord(THEWORDS);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ans=findViewById(R.id.answer);
        setContentView(R.layout.activity_main);
        Theword=rndWord(THEWORDS);
        after=findViewById(R.id.after);
        score=findViewById(R.id.score);

        String ans;
        List<String> charac= Arrays.asList(Theword);
        String after=messedWord(charac);
        //I didn't have time to finish the app but here's what i would write:
        //will print the shuffled word
        //will get the input from the user and store it in ans
        String score=Compare(ans,after);
        //will print the score

    }
    public String rndWord(String[] arstr){ //gets a random word from the array
        int Next;
        Next= rand.nextInt(arstr.length);
        return arstr[Next];
    }
    public String messedWord(List<String> charac) { //shuffles the word
        {
            Collections.shuffle(charac);
            String afterShuffle = "";
            for (String character : charac) {
                afterShuffle += charac;
            }
            //System.out.println(afterShuffle);
            return (afterShuffle);
        }
    }
    public String Compare(String ans,String after)
    {
        String score;
        int count=0;
        if(after.length()==ans.length())
        {
            for (int j = 0; j < after.length(); j++) {
                for(int i=0;i<ans.length();i++)
                {
                    if(ans.charAt(i)==after.charAt(j))
                    {
                        count++;
                    }
                }
            }
            if (count==ans.length()) { score = "well done!";}
            else{score = "wrong word";}
        }
        else{score = "wrong word";}
        return score;

    }


}