package sn.esmt.employe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CvlistActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvlist);

        recyclerView = findViewById((R.id.cvList_recyclerView));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        loadCvEntities();
    }

    private void loadCvEntities() {
    }
}