package dasdsa.sdn.pizzastore_20200607

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dasdsa.sdn.pizzastore_20200607.adapters.PizzaStoreAdapter
import dasdsa.sdn.pizzastore_20200607.datas.PizzaStore

class MainActivity : BaseActivity() {

    val pizzastore = ArrayList<PizzaStore>()

    lateinit var pizzastoreAdapter:PizzaStoreAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupevents()
        setValues()
    }

    override fun setupevents() {

    }

    override fun setValues() {

        pizzastore.add(PizzaStore("피자헛", "img_01", "01011112222" ))
        pizzastore.add(PizzaStore("파파존스", "img_01", "020001234" ))

   //     pizzastoreAdapter = PizzaStoreAdapter(this, R.layout.pizza_store_list_item)


    }


}
