package com.dita.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman = ArrayList()
        listTeman.add(
            MyFriend("Livia Dita","Perempuan", "liviadita123@gmail.com",
            "088234039767","Malang")
        )
        listTeman.add(
            MyFriend("Denisa Mei Linda","Perempuan","denisalinda16@gmail.com",
            "085888043162","Blitar")
        )
        listTeman.add(
            MyFriend("Ergi Alifio","Laki-Laki","riferoergi@gmail.com",
            "085258022025","Malang")
        )
        listTeman.add(
            MyFriend("Alief Affansyah","Laki-Laki","aliefaffan7@gmail.com",
            "089654034070","Malang")
        )
        listTeman.add(
            MyFriend("Indah Kurniani","Perempuan","indahkurniani291@gmail.com",
            "082232829301","Malang")
        )
        listTeman.add(
            MyFriend("Rahayu Fitria","Perempuan","rahayufitria1212@gmail.com",
            "089653375232","Malang ")
        )
    }

    private fun tampilTeman(){
        rv_listMyFriends.layoutManager = LinearLayoutManager(activity)
        rv_listMyFriends.adapter = MyFriendAdapter(requireActivity(), listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}