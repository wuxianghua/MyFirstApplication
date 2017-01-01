package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int applicationId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openApplication(View view) {
        applicationId = view.getId();
        switch (applicationId) {
            case R.id.tv_popular_film:
                showToast(getString(R.string.popular_film));
                break;
            case R.id.tv_share_eagle:
                showToast(getResources().getString(R.string.share_eagle));
                break;
            case R.id.tv_XYZ_reader:
                showToast(getResources().getString(R.string.XYZ_reader));
                break;
            case R.id.tv_recent_news:
                showToast(getResources().getString(R.string.recent_news));
                break;
            case R.id.tv_graduate_design:
                showToast(getResources().getString(R.string.graduate_design));
                break;
        }
    }
    private void showToast(String name) {
        Toast.makeText(this,this.getString(R.string.toast_content)+name,Toast.LENGTH_SHORT).show();
    }
}
