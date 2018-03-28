package com.example.uplabdhisingh.redox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity
{
    TextView nameTextView, ageTextView, genderTextView, trainingTypeTextView, exerciseTypeTextView;
    EditText nameEditText;
    RadioGroup ageRadioGroup, genderRadioGroup, trainingTypeRadioGroup, exerciseTypeRadioGroup;

    RadioButton ageRadioButton, genderRadioButton;
    RadioButton mauiRadioButton, jujutsuRadioButton, karateRadioButton, judoRadioButton;
    RadioButton cardioRadioButton, strengthRadioButton, staminaRadioButton, muscleRadioButton;

    CheckBox swimmingCheckBox, runningCheckBox, footballCheckBox, rugbyCheckBox, danceCheckBox;

    int maui_count=0, jujutsu_count=0, karate_count=0, judo_count=0;
    int cardio_count=0, strength_count=0, stamina_count = 0, muscle_count = 0;
    int swim_count=0, run_count=0, football_count=0, rugby_count=0, dance_count=0;

    Button submitButton;

    public static String firstEncodedString;
    public String secondEncodedString, a="0",b="0",c="0",d="0",e="0";

    public int training_hours;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        nameTextView=(TextView) findViewById(R.id.tv_name);
        ageTextView=(TextView) findViewById(R.id.tv_age);
        genderTextView=(TextView) findViewById(R.id.tv_gender);
        trainingTypeTextView=(TextView) findViewById(R.id.tv_training_type);
        exerciseTypeTextView=(TextView) findViewById(R.id.tv_exercise_type);


        nameEditText=(EditText) findViewById(R.id.et_name);

        ageRadioGroup=(RadioGroup) findViewById(R.id.rg_age);
        genderRadioGroup=(RadioGroup) findViewById(R.id.rg_gender);
        trainingTypeRadioGroup=(RadioGroup) findViewById(R.id.rg_training_type);
        exerciseTypeRadioGroup=(RadioGroup) findViewById(R.id.rg_exercise_type);

        submitButton=(Button) findViewById(R.id.btn_submit);
    }


    public void onClickButtonMethod(View v)
    {
        String name = nameEditText.getText().toString();

        /*
        * Now we will extract String for checked Age RadioButton.
        */

        int id_age = ageRadioGroup.getCheckedRadioButtonId();
        ageRadioButton=(RadioButton) findViewById(id_age);
        String age = "not selected";

        if(id_age==-1)
        {
            Toast.makeText(this, "Please Select Age!", Toast.LENGTH_SHORT).show();
        } else
        {
            age = ageRadioButton.getText().toString();
        }

        int id_gender = genderRadioGroup.getCheckedRadioButtonId();
        genderRadioButton=(RadioButton) findViewById(id_gender);
        String gender = "not selected";
        if(id_gender==-1)
        {
            Toast.makeText(this, "Please Select Gender!", Toast.LENGTH_SHORT).show();
        } else
            {
                gender = genderRadioButton.getText().toString();
            }


        mauiRadioButton = (RadioButton) findViewById(R.id.rb_maui);
        jujutsuRadioButton = (RadioButton) findViewById(R.id.rb_jujutsu);
        karateRadioButton = (RadioButton) findViewById(R.id.rb_karate);
        judoRadioButton = (RadioButton) findViewById(R.id.rb_judo);

        cardioRadioButton = (RadioButton) findViewById(R.id.rb_cardio);
        strengthRadioButton = (RadioButton) findViewById(R.id.rb_strength);
        staminaRadioButton = (RadioButton) findViewById(R.id.rb_stamina);
        muscleRadioButton = (RadioButton) findViewById(R.id.rb_muscle);

        swimmingCheckBox = (CheckBox) findViewById(R.id.cb_swim);
        runningCheckBox = (CheckBox) findViewById(R.id.cb_running);
        footballCheckBox = (CheckBox) findViewById(R.id.cb_football);
        rugbyCheckBox = (CheckBox) findViewById(R.id.cb_rugby);
        danceCheckBox = (CheckBox) findViewById(R.id.cb_dance);





        if(age.equals("Less than 10")|| age.equals("10-15") || gender.equals("Female"))
        {
            training_hours=1;


            if(trainingTypeRadioGroup.getCheckedRadioButtonId()==-1)
            {
                Toast.makeText(this, "No Options Selected!", Toast.LENGTH_SHORT).show();
            } else if(mauiRadioButton.isChecked())
            {
                maui_count = 1;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            } else if (jujutsuRadioButton.isChecked())
            {
                jujutsu_count = 1;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            } else if (karateRadioButton.isChecked())
            {
             karate_count = 1;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            } else if (judoRadioButton.isChecked())
            {
                judo_count = 1;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }

            if(!(mauiRadioButton.isChecked()))
            {
                maui_count=0;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
            if(!(jujutsuRadioButton.isChecked()))
            {
                jujutsu_count=0;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
            if (!(karateRadioButton.isChecked()))
            {
                karate_count = 0;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
            if (!(judoRadioButton.isChecked()))
            {
                judo_count = 0;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
        }
        else if (age.equals("16-40") || age.equals("Above 40") && gender.equals("Male"))
        {
            training_hours = 2;

            if(trainingTypeRadioGroup.getCheckedRadioButtonId()==-1){
                Toast.makeText(this, "No Options Selected!", Toast.LENGTH_SHORT).show();
            } else if(mauiRadioButton.isChecked())
            {
                maui_count = 2;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
            else if (jujutsuRadioButton.isChecked())
            {
                jujutsu_count = 2;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
            else if (karateRadioButton.isChecked())
            {
                karate_count = 2;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }

            else if (judoRadioButton.isChecked())
            {
                judo_count = 2;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }


            if(!(mauiRadioButton.isChecked()))
            {
                maui_count=0;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
            if(!(jujutsuRadioButton.isChecked()))
            {
                jujutsu_count=0;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
            if (!(karateRadioButton.isChecked()))
            {
                karate_count = 0;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
            if (!(judoRadioButton.isChecked()))
            {
                judo_count = 0;
                firstEncodedString = name+"_"+gender+" "+
                        "A:"+maui_count + " "+
                        "B:"+jujutsu_count + " "+
                        "C:"+ karate_count + " "+
                        "D:" + judo_count+" ";
            }
        }

        else
            {
                training_hours = 0;

                if(trainingTypeRadioGroup.getCheckedRadioButtonId()==-1){
                    Toast.makeText(this, "No Options Selected!", Toast.LENGTH_SHORT).show();
                } else if(mauiRadioButton.isChecked())
                {
                    maui_count = 0;
                    firstEncodedString = name+"_"+gender+" "+
                            "A:"+maui_count + " "+
                            "B:"+jujutsu_count + " "+
                            "C:"+ karate_count + " "+
                            "D:" + judo_count+" ";
                } else if (jujutsuRadioButton.isChecked())
                {
                    jujutsu_count = 0;
                    firstEncodedString = name+"_"+gender+" "+
                            "A:"+maui_count + " "+
                            "B:"+jujutsu_count + " "+
                            "C:"+ karate_count + " "+
                            "D:" + judo_count+" ";
                } else if (karateRadioButton.isChecked())
                {
                    karate_count = 0;
                    firstEncodedString = name+"_"+gender+" "+
                            "A:"+maui_count + " "+
                            "B:"+jujutsu_count + " "+
                            "C:"+ karate_count + " "+
                            "D:" + judo_count+" ";
                } else if (judoRadioButton.isChecked())
                {
                    judo_count = 0;
                    firstEncodedString = name+"_"+gender+" "+
                            "A:"+maui_count + " "+
                            "B:"+jujutsu_count + " "+
                            "C:"+ karate_count + " "+
                            "D:" + judo_count+" ";
                }

                if(!(mauiRadioButton.isChecked()))
                {
                    maui_count=0;
                    firstEncodedString = name+"_"+gender+" "+
                            "A:"+maui_count + " "+
                            "B:"+jujutsu_count + " "+
                            "C:"+ karate_count + " "+
                            "D:" + judo_count+" ";
                }
                if(!(jujutsuRadioButton.isChecked()))
                {
                    jujutsu_count=0;
                    firstEncodedString = name+"_"+gender+" "+
                            "A:"+maui_count + " "+
                            "B:"+jujutsu_count + " "+
                            "C:"+ karate_count + " "+
                            "D:" + judo_count+" ";
                }
                if (!(karateRadioButton.isChecked()))
                {
                    karate_count = 0;
                    firstEncodedString = name+"_"+gender+" "+
                            "A:"+maui_count + " "+
                            "B:"+jujutsu_count + " "+
                            "C:"+ karate_count + " "+
                            "D:" + judo_count+" ";
                }
                if (!(judoRadioButton.isChecked()))
                {
                    judo_count = 0;
                    firstEncodedString = name+"_"+gender+" "+
                            "A:"+maui_count + " "+
                            "B:"+jujutsu_count + " "+
                            "C:"+ karate_count + " "+
                            "D:" + judo_count+" ";
                }
            }


        if(exerciseTypeRadioGroup.getCheckedRadioButtonId()==-1)
        {
            Toast.makeText(this, "No Options Selected!", Toast.LENGTH_SHORT).show();
        } else if(cardioRadioButton.isChecked())
        {
            cardio_count=1;
            secondEncodedString = "P:"+cardio_count+" "+
                    "Q:"+strength_count+" "+
                    "R:"+stamina_count+" "+
                    "S:"+muscle_count+" ";
        } else if (strengthRadioButton.isChecked())
        {
            strength_count=1;
            secondEncodedString = "P:"+cardio_count+" "+
                    "Q:"+strength_count+" "+
                    "R:"+stamina_count+" "+
                    "S:"+muscle_count+" ";
        } else if (staminaRadioButton.isChecked())
        {
            stamina_count = 1;
            secondEncodedString = "P:"+cardio_count+" "+
                    "Q:"+strength_count+" "+
                    "R:"+stamina_count+" "+
                    "S:"+muscle_count+" ";
        } else if (muscleRadioButton.isChecked())
        {
            muscle_count = 1;
            secondEncodedString = "P:"+cardio_count+" "+
                    "Q:"+strength_count+" "+
                    "R:"+stamina_count+" "+
                    "S:"+muscle_count+" ";
        }

        firstEncodedString+=secondEncodedString;

        if(swimmingCheckBox.isChecked())
        {
            swim_count=1;
            a = "V:"+swim_count+" ";
        } else if (!(swimmingCheckBox.isChecked()))
        {
            swim_count=0;
            a = "V:"+swim_count+" ";
        }


        if(runningCheckBox.isChecked())
        {
            run_count=1;
            b = "W:"+run_count+" ";
        } else if (!(runningCheckBox.isChecked()))
        {
            run_count=0;
            b = "W:"+run_count+" ";
        }


        if(footballCheckBox.isChecked())
        {
            football_count=1;
            c = "X:"+football_count+" ";
        } else if (!(footballCheckBox.isChecked()))
        {
            football_count=0;
            c = "X:"+football_count+" ";
        }


        if (rugbyCheckBox.isChecked())
        {
            rugby_count=1;
            d = "Y:"+rugby_count+" ";
        } else if (!(rugbyCheckBox.isChecked()))
        {
            rugby_count=0;
            d = "Y:"+rugby_count+" ";
        }


        if(danceCheckBox.isChecked())
        {
            dance_count=1;
            e = "Z:"+dance_count;
        } else if (!(danceCheckBox.isChecked()))
        {
            dance_count=0;
            e = "Z:"+dance_count+" ";
        }

        firstEncodedString+=a+b+c+d+e;

        Intent intentToSecondActivity = new Intent(FirstActivity.this,SecondActivity.class);
        startActivity(intentToSecondActivity);
        }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        finish();
    }
}
