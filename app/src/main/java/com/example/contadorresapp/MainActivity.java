import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0; // Variável para armazenar o número de pessoas
    private TextView txtCount; // TextView que exibirá o número de pessoas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCount = findViewById(R.id.txtCount); // Referência para o TextView
        Button btnAdd = findViewById(R.id.btnAdd); // Referência para o botão de adicionar
        Button btnRemove = findViewById(R.id.btnRemove); // Referência para o botão de remover

        // Ação ao clicar no botão "Entrar"
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++; // Incrementa o número de pessoas
                updateCount(); // Atualiza o TextView
            }
        });

        // Ação ao clicar no botão "Sair"
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count > 0) {
                    count--; // Decrementa o número de pessoas
                    updateCount(); // Atualiza o TextView
                } else {
                    Toast.makeText(MainActivity.this, "Nenhuma pessoa para remover!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Método para atualizar o número de pessoas no TextView
    private void updateCount() {
        txtCount.setText(String.valueOf(count));
    }
}
