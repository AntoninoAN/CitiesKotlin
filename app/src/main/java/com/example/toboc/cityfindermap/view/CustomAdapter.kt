package com.example.toboc.cityfindermap.view

import android.nfc.Tag
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import com.example.toboc.cityfindermap.R.id.tv_subtitle
import com.example.toboc.cityfindermap.R.id.tv_title
import com.example.toboc.cityfindermap.model.PojoCities

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>(), Filterable {

    lateinit var dataSet: ArrayList<PojoCities>
    lateinit var filteredDataSet: ArrayList<PojoCities>


    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                println(TAG + "performFiltering" + constraint)
                var tempList = ArrayList<PojoCities>()
                filteredDataSet = if (constraint!!.toString().isEmpty()) {
                    dataSet
                } else {
                    for (city in dataSet) {
                        if (city.name.contains(constraint, true))
                            tempList.add(city)
                    }
                    tempList
                }
                val filteredResults = FilterResults()
                filteredResults.values = filteredDataSet
                return filteredResults
            }

            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title = tv_title
        var subtitle = tv_subtitle
    }

    companion object {
        var TAG = CustomAdapter::class.java.simpleName
    }
}