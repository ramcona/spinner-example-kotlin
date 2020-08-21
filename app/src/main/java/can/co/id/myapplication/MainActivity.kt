package can.co.id.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    var listNama  = arrayOf("Agus", "Andi","Ahmad", "Boni")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // mempersiapkan adapter untuk spinner
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, listNama)

        //menambahkan layout untuk list spinner
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        //menambahkan adapter ke spinner
        main_spinner.setAdapter(spinnerAdapter)

        //memanggil fungsi ketika pengguna memilih salah satu nilai di spinner
        main_spinner.setOnItemSelectedListener(this)

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        val namaDipilih = listNama[p2]
    }
}