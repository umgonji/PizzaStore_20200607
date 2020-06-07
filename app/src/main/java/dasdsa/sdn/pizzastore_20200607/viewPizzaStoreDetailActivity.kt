package dasdsa.sdn.pizzastore_20200607

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import dasdsa.sdn.pizzastore_20200607.datas.PizzaStore
import kotlinx.android.synthetic.main.activity_view_pizza_store_detail.*
import kotlinx.android.synthetic.main.activity_view_pizza_store_detail.logoImg
import kotlinx.android.synthetic.main.pizza_store_list_item.*

class viewPizzaStoreDetailActivity : BaseActivity() {

    lateinit var  mPizzaStore : PizzaStore


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pizza_store_detail)

        setupevents()
        setValues()
    }


    override fun setupevents() {

        callBtn.setOnClickListener {
            val pl = object : PermissionListener {
                override fun onPermissionGranted() {
                    val myUri = Uri.parse("tel:${mPizzaStore.PhoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                }
            }

        }

    }

    override fun setValues() {
        // 받을때 Serializable 형식으로 받아야 한다. 왜냐면 PizzaStore 가 Serializable 이니까.
        // Serializable 형태로 첨부된 가게 정보를 받아서 => PizzaStore 형태로 변신시켜서 (Casting 시킨다)
        // 멤버변수로 있는 피자가게 변수에 대입
        mPizzaStore = intent.getSerializableExtra("store") as PizzaStore

        //대입 된 피자 가게 변수의 데이터들을 이용해서 화면에 출력
        Glide.with(mContext).load(mPizzaStore.logoUrl).into(logoImg)
        storeNameTxt.text = mPizzaStore.name
        phoneNumTxt.text = mPizzaStore.PhoneNum

    }


}
