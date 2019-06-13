package androi.edu.plazi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import androi.edu.plazi.view.ContainerActivity;
import androi.edu.plazi.view.CrearUsuarioActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void Contenedor(View view){

        Intent frmConteiner = new Intent(this, ContainerActivity.class);
        startActivity(frmConteiner);

    }

    public void crear(View view){
        Intent frmLogin = new Intent(this, CrearUsuarioActivity.class);
        startActivity(frmLogin);
    }

}
