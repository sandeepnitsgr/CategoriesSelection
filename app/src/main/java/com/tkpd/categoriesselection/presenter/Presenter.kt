package com.tkpd.categoriesselection.presenter


class Presenter(val view: CustomContract.View) : CustomContract.Presenter {

    override fun getList() {
//        val observable: Observable<PizzaData> = getApi().getData()
//        observable.subscribeOn(Schedulers.newThread())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribe(object : Subscriber<PizzaData>() {
//                override fun onCompleted() {
//
//                }
//
//                override fun onError(e: Throwable) {
//                }
//
//                override fun onNext(dta: PizzaData) {
//                    view.setData(dta.variants)
//                }
//            })

    }

//    fun getApi(): Api {
//        return Retrofit.Builder()
//            .baseUrl("https://api.myjson.com")
//            .addConverterFactory(GsonConverterFactory.create())
//            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//            .client(createClient())
//            .build().create(Api::class.java)
//    }
//
//    //
//    fun createClient(): OkHttpClient {
//        val logging = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { message -> Log.d("sandeep", message) })
//        val builder: OkHttpClient.Builder = OkHttpClient.Builder()
//        return builder.addInterceptor(logging).build()
//    }
}
