package dasdsa.sdn.pizzastore_20200607

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupevents()
    abstract fun setValues()

}