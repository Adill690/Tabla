package duenas.perez.tabla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {



    var progreso:Int? = null
    var adapater:ArrayAdapter<String>? = null
    var elementos = arrayOfNulls<String>(1 )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekControl.setOnSeeBarChangeListener(this)//seek bar



    }

    fun calcularTablas(progreso:Int){
    for (i in 0..10){
        val texto = "$progreso x $i  = $(progreso * i) "

        textView.adapter = adapter

             }
    }


    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        this.calcularTablas()
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {

    }

    override fun onStopTrackingTouch(p0: SeekBar?) {

    }

