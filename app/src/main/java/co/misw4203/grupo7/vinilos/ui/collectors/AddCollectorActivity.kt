package co.misw4203.grupo7.vinilos.ui.collectors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.brokers.VolleyBroker
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class AddCollectorActivity : AppCompatActivity() {
    private var inputTitle: TextInputEditText? = null
    private var inputTitleLayout: TextInputLayout? = null
    private var inputReleaseTelephone: TextInputEditText? = null
    private var inputReleaseEmailLayout: TextInputEditText? = null
    private var buttonAddCollector: MaterialButton? = null
    private var volleyBroker: VolleyBroker? = null


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
}
