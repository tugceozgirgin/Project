package com.example.ozuclubs.fragments

import android.os.Bundle
import android.util.Log.d
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ozuclubs.R
import com.example.ozuclubs.adapter.MyAdapter
import com.example.ozuclubs.data.Club
import com.example.ozuclubs.databinding.FragmentRecyclerviewBinding

class RecyclerViewFragment: Fragment() {
    private  lateinit var adapter:MyAdapter
    private  lateinit var rv: RecyclerView
    private  lateinit var clubsArrayList:ArrayList<Club>

    lateinit var imageId: Array<Int>
    lateinit var clubName: Array<String>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentRecyclerviewBinding>(inflater,
            R.layout.fragment_recyclerview,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataInitialize()
        val layoutManager =LinearLayoutManager(context)
        rv=view.findViewById(R.id.recycler_view)
        rv.layoutManager=layoutManager
        rv.setHasFixedSize(true)
        adapter=MyAdapter(clubsArrayList)
        rv.adapter=adapter
    }



    private fun dataInitialize(){
        clubsArrayList= arrayListOf<Club>()
        imageId= arrayOf(
            R.drawable.image_a,
            R.drawable.image_b,
            R.drawable.image_c,
            R.drawable.image_d,
            R.drawable.image_e,
            R.drawable.image_f,
            R.drawable.image_g,
            R.drawable.image_h,
            R.drawable.image_i,
            R.drawable.image_j,
            R.drawable.image_k,
        )
        clubName= arrayOf(
            getString(R.string.club_a),
            getString(R.string.club_b),
            getString(R.string.club_c),
            getString(R.string.club_d),
            getString(R.string.club_e),
            getString(R.string.club_f),
            getString(R.string.club_g),
            getString(R.string.club_h),
            getString(R.string.club_i),
            getString(R.string.club_j),
            getString(R.string.club_k),
        )
        for(i in imageId.indices){
            val club=Club(clubName[i],imageId[i])
            clubsArrayList.add(club)
        }

    }



}