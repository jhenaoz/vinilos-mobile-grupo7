package co.misw4203.grupo7.vinilos.ui.albums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.RadioGroup
import android.widget.Toast
import co.misw4203.grupo7.vinilos.R
import co.misw4203.grupo7.vinilos.brokers.VolleyBroker
import com.google.android.material.button.MaterialButton
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class AddAlbumActivity : AppCompatActivity() {
    private lateinit var inputReleaseDate: TextInputEditText
    private lateinit var inputReleaseDateLayout: TextInputLayout
    private lateinit var datePickerReleaseDate: MaterialDatePicker<Long>
    private lateinit var inputTitle: TextInputEditText
    private lateinit var inputTitleLayout: TextInputLayout
    private lateinit var inputCover: TextInputEditText
    private lateinit var inputCoverLayout: TextInputLayout
    private lateinit var radioGroupGenre: RadioGroup
    private lateinit var radioGroupRecordLabel: RadioGroup
    private lateinit var inputDescription: TextInputEditText
    private lateinit var inputDescriptionLayout: TextInputLayout

    private lateinit var buttonAddAlbum: MaterialButton

    private lateinit var volleyBroker: VolleyBroker


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_album)

        volleyBroker = VolleyBroker(this.applicationContext)

        inputTitle = findViewById(R.id.album_title)
        inputTitleLayout = findViewById(R.id.album_title_layout)
        inputReleaseDate = findViewById(R.id.album_release_year)
        inputReleaseDateLayout = findViewById(R.id.album_release_date_layout)
        inputCover = findViewById(R.id.album_cover)
        inputCoverLayout = findViewById(R.id.album_cover_layout)
        radioGroupGenre = findViewById(R.id.radio_group_album_genre)
        radioGroupRecordLabel = findViewById(R.id.radio_group_album_record_label)
        inputDescription = findViewById(R.id.album_description)
        inputDescriptionLayout = findViewById(R.id.album_description_layout)

        buttonAddAlbum = findViewById(R.id.button_add_album)

        // Input release date
        val datePickerBuilder = MaterialDatePicker.Builder.datePicker()
        datePickerBuilder.setTitleText("Seleccionar fecha")
        datePickerReleaseDate = datePickerBuilder.build()

        inputReleaseDate.setOnClickListener {
            datePickerReleaseDate.show(supportFragmentManager, "date_picker")
        }

        datePickerReleaseDate.addOnPositiveButtonClickListener { selectedDate ->
            val calendar = Calendar.getInstance()
            calendar.timeInMillis = selectedDate

            val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.US)
            val dateString = dateFormat.format(calendar.time)
            inputReleaseDate.setText(dateString)
        }

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

        makeInputRequired(inputTitleLayout, inputTitle)
        makeInputRequired(inputReleaseDateLayout, inputReleaseDate)
        makeInputRequired(inputCoverLayout, inputCover)
        makeInputRequired(inputReleaseDateLayout, inputReleaseDate)
        makeInputRequired(inputDescriptionLayout, inputDescription)

        // Button add album
        buttonAddAlbum.setOnClickListener {
            val title = inputTitle.text.toString()
            val cover = inputCover.text.toString()
            val releaseDate = inputReleaseDate.text.toString()
            val genre = when (radioGroupGenre.checkedRadioButtonId) {
                R.id.radio_button_classical -> getText(R.string.label_classical)
                R.id.radio_button_salsa -> getText(R.string.label_salsa)
                R.id.radio_button_rock -> getText(R.string.label_rock)
                R.id.radio_button_folk -> getText(R.string.label_folk)
                else -> getText(R.string.label_classical)
            }
            val recordLabel = when (radioGroupRecordLabel.checkedRadioButtonId) {
                R.id.radio_button_sony_music -> getText(R.string.label_sony_music)
                R.id.radio_button_emi -> getText(R.string.label_emi)
                R.id.radio_button_discos_fuentes -> getText(R.string.label_discos_fuentes)
                R.id.radio_button_elektra -> getText(R.string.label_elektra)
                R.id.radio_button_fania_records -> getText(R.string.label_fania_records)
                else -> getText(R.string.label_sony_music)
            }

            val description = inputDescription.text.toString()

            val postParams = mapOf<String, Any>(
                "name" to title,
                "cover" to cover,
                "releaseDate" to releaseDate.replace("\\", ""),
                "description" to description,
                "genre" to genre,
                "recordLabel" to recordLabel
            )

            volleyBroker.instance.add(VolleyBroker.postRequest("albums", JSONObject(postParams),
                { _ ->
                    Log.d("TAG", it.toString())
                    Toast.makeText(this.applicationContext, "Albúm creado correctamente", Toast.LENGTH_LONG).show()
                    finish()
                },
                {
                    Log.d("TAG", it.toString())
                    Toast.makeText(this.applicationContext, "Error al crear albúm", Toast.LENGTH_LONG).show()

                }
            ))
        }
    }
}