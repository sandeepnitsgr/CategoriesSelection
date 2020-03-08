package com.tkpd.categoriesselection.presenter

import com.tkpd.categoriesselection.data.datamodel.Variants

interface CustomContract {
    interface Presenter {
        fun getList()

    }
    interface View {
        fun setData(variant : Variants?)
    }

}
