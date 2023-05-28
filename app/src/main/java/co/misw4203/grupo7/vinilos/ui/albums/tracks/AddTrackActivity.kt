package co.misw4203.grupo7.vinilos.ui.albums.tracks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Toast
import androidx.navigation.navArgs
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.brokers.VolleyBroker
import co.misw4203.grupo7.vinilos.ui.collectors.DetailCollectorActivityArgs
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.json.JSONObject

class AddTrackActivity : AppCompatActivity() {
    private lateinit var inputName: TextInputEditText
    private lateinit var inputNameLayout: TextInputLayout
    private lateinit var inputDuration: TextInputEditText
    private lateinit var inputDurationLayout: TextInputLayout

    private lateinit var buttonAddTrack: MaterialButton

    private lateinit var volleyBroker: VolleyBroker


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_track)

        volleyBroker = VolleyBroker(this.applicationContext)

        inputName = findViewById(R.id.track_name)
        inputNameLayout = findViewById(R.id.track_name_layout)
        inputDuration = findViewById(R.id.track_duration)
        inputDurationLayout = findViewById(R.id.track_duration_layout)

        buttonAddTrack = findViewById(R.id.button_add_track)

        // Make inputs required
        fun makeInputRequired(inputLayout: TextInputLayout, inputEditText: TextInputEditText) {
            inputEditText.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    if (s.isNullOrEmpty()) {
                        inputLayout.error = "Este campo es requerido"
                    } else {
                        inputLayout.error = null
                    }
                }

                override fun afterTextChanged(s: Editable?) {}
            })
        }

        makeInputRequired(inputNameLayout, inputName)
        makeInputRequired(inputDurationLayout, inputDuration)

        // Button add album
        buttonAddTrack.setOnClickListener {
            val title = inputName.text.toString()
            val duration = inputDuration.text.toString()

            val postParams = mapOf<String, Any>(
                "name" to title,
                "duration" to duration
            )
            val args: DetailCollectorActivityArgs by navArgs()

            volleyBroker.instance.add(
                VolleyBroker.postRequest("albums/${args.id}/tracks", JSONObject(postParams),
                { _ ->
                    Log.d("TAG", it.toString())
                    Toast.makeText(this.applicationContext, "Canción creada correctamente", Toast.LENGTH_LONG).show()
                    finish()
                },
                {
                    Log.d("TAG", it.toString())
                    Toast.makeText(this.applicationContext, "Error al crear canción", Toast.LENGTH_LONG).show()

                }
            ))
        }
    }
}