package sn.esmt.employe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import sn.esmt.employe.model.CvEntities;
import sn.esmt.employe.retrofit.CvApi;
import sn.esmt.employe.retrofit.RetrofitService;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeCompoments();
    }

    private void initializeCompoments() {
        TextInputEditText inputEditTextId = findViewById(R.id.form_textFieldId);
        TextInputEditText inputEditTextPrenom = findViewById(R.id.form_textFieldPrenom);
        TextInputEditText inputEditTextNom = findViewById(R.id.form_textFieldNom);
        TextInputEditText inputEditTextAge = findViewById(R.id.form_textFieldAge);
        TextInputEditText inputEditTextAdresse = findViewById(R.id.form_textFieldAdresse);
        TextInputEditText inputEditTextEmail = findViewById(R.id.form_textFieldEmail);
        TextInputEditText inputEditTextTelephone = findViewById(R.id.form_textFieldTelephone);
        TextInputEditText inputEditTextNiveauEtude = findViewById(R.id.form_textFieldNiveauEtude);
        TextInputEditText inputEditTextExperienceProfessionnelle = findViewById(R.id.form_textFieldExperienceProfessionnelle);
        MaterialButton buttonSave = findViewById(R.id.form_buttonSave);

        RetrofitService retrofitService = new RetrofitService();
        CvApi cvApi = retrofitService.getRetrofit().create(CvApi.class);

        buttonSave.setOnClickListener(view ->{
            int id = Integer.parseInt(inputEditTextId.getText().toString());
            String prenom = String.valueOf(inputEditTextPrenom.getText());
            String nom = String.valueOf(inputEditTextNom.getText());
            int age = Integer.parseInt(inputEditTextAge.getText().toString());
            String adresse = String.valueOf(inputEditTextAdresse.getText());
            String email = String.valueOf(inputEditTextEmail.getText());
            String niveauEtude = String.valueOf(inputEditTextNiveauEtude.getText());
            String experienceProfessionnelle = String.valueOf(inputEditTextExperienceProfessionnelle.getText());

            CvEntities cvEntities = new CvEntities();
            cvEntities.setId(id);
            cvEntities.setprenom(prenom);
            cvEntities.setnom(nom);
            cvEntities.setage(age);
            cvEntities.setadresse(adresse);
            cvEntities.setEmail(email);
            cvEntities.setniveauEtude(niveauEtude);
            cvEntities.setexperienceProfessionnelle(experienceProfessionnelle);

            cvApi.save(cvEntities)
                    .enqueue(new Callback<List<CvEntities>>() {
                        @Override
                        public void onResponse(Call<List<CvEntities>> call, Response<List<CvEntities>> response) {
                            Toast.makeText(MainActivity.this, "Sauvegarde réussi", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onFailure(Call<List<CvEntities>> call, Throwable t) {
                            Toast.makeText(MainActivity.this, "Sauvegarde réussi", Toast.LENGTH_SHORT).show();
                            Logger.getLogger(MainActivity.class.getName()).log(Level.SEVERE, "error occured");
                        }
                    });
        });



    }
}
