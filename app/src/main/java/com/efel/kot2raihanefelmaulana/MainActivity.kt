package com.efel.kot2raihanefelmaulana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nama = findViewById<EditText>(R.id.editnama)
        val harga = findViewById<EditText>(R.id.editharga)
        val jumlah = findViewById<EditText>(R.id.editjumlah)
        val chk1 = findViewById<CheckBox>(R.id.chkpayung)
        val chk2 = findViewById<CheckBox>(R.id.chksetrika)
        val chk3 = findViewById<CheckBox>(R.id.chkkompo)
        val chk4 = findViewById<CheckBox>(R.id.chktv)
        val chk5 = findViewById<CheckBox>(R.id.chkmotor)
        val chk6 = findViewById<CheckBox>(R.id.chktv1)
        val rgBayar = findViewById<RadioGroup>(R.id.rg1)
        val output = findViewById<TextView>(R.id.txtoutput)
        val submit = findViewById<Button>(R.id.btnsubmit)
        submit.setOnClickListener {
            val nmBarang = nama.text
            val hgBarang = harga.text
            val jumBarang = jumlah.text
            val payung = chk1.isChecked
            val setrika = chk2.isChecked
            val kompo = chk3.isChecked
            val tv = chk4.isChecked
            val motor = chk5.isChecked
            val tv1 = chk6.isChecked
            val caraBayar = rgBayar.checkedRadioButtonId
            val bayar = findViewById<RadioButton>(caraBayar)

            val transaksi = "Transaksi Minimarket : \n " +
                    "Nama Barang: $nmBarang \n" +
                    "Harga Barang: $hgBarang \n" +
                    "Jumlah Beli : $jumBarang \n" +
                    "Promo : \n" +
                    (if (payung) "\nPayung" else "") +


                    "\n Metode Pembayaran : ${bayar.text}"
            output.setText(transaksi)


        }
    }}