package co.misw4203.grupo7.vinilos.ui.collectors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.brokers.VolleyBroker
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class AddCollectorActivity : AppCompatActivity() {
    private lateinit var inputTitle: TextInputEditText
    private lateinit var inputTitleLayout: TextInputLayout
    private lateinit var inputReleaseTelephone: TextInputEditText
    private lateinit var inputReleaseEmailLayout: TextInputEditText
    private lateinit var buttonAddCollector: MaterialButton
    private lateinit var volleyBroker: VolleyBroker


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_collector)

        volleyBroker = VolleyBroker(this.applicationContext)

        inputTitle = findViewById(R.id.collector_name_layout)
        inputTitleLayout = findViewById(R.id.collector_title_layout)
        inputReleaseTelephone = findViewById(R.id.collector_release_telephone)
        inputReleaseEmailLayout = findViewById(R.id.collector_release_email)
        buttonAddCollector= findViewById(R.id.button_add_collector)

    }

        // Make inputs required
        /*fun makeInputRequired(inputLayout: TextInputLayout, inputEditText: TextInputEditText) {
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
*/
    }
