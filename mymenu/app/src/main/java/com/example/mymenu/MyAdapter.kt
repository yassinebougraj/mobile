package com.example.mymenu

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(var mCtx:Context, var ressources:Int, var items:List<Repas>)
    :ArrayAdapter<Repas>(mCtx,ressources,items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater:LayoutInflater= LayoutInflater.from(mCtx)
        val view:View=layoutInflater.inflate(ressources,null)
        val imageView:ImageView=view.findViewById(R.id.img)
        val nomtextView:TextView=view.findViewById(R.id.titre)
        val prixtextView:TextView=view.findViewById(R.id.prix)
        val repas=items[position]

        imageView.setImageDrawable(mCtx.resources.getDrawable(repas.imgid))
        nomtextView.text=repas.nom
        prixtextView.text=repas.prix.toString()+" DH"
        return view
    }
}