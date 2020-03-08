package com.tkpd.categoriesselection.data.datamodel

import com.google.gson.annotations.SerializedName

data class PizzaData(
    @SerializedName("variants")
    var variants: Variants = Variants()
)

data class Variation(
    @SerializedName("name")
    var name: String = "",
    @SerializedName("price")
    var price: Int = -1,
    @SerializedName("default")
    var default: Int = -1,
    @SerializedName("id")
    var id: String = "",
    @SerializedName("inStock")
    var inStock: Int = -1,
    @SerializedName("isVeg")
    var isVeg: Int = -1
)

data class ExcludeList(
    @SerializedName("group_id")
    var groupId: String = "",
    @SerializedName("variation_id")
    var variationId: String = ""
)

data class Variants(
    @SerializedName("variant_groups")
    var variantGroups: List<VariantGroup> = mutableListOf(),
    @SerializedName("exclude_list")
    var excludeList: List<List<ExcludeList>> = mutableListOf()
)

data class VariantGroup(
    @SerializedName("group_id")
    var groupId: String = "",
    @SerializedName("name")
    var name: String = "",
    @SerializedName("variations")
    var variations: List<Variation> = mutableListOf()

)