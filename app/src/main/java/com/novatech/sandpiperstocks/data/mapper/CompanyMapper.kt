package com.novatech.sandpiperstocks.data.mapper

import com.novatech.sandpiperstocks.data.local.CompanyListingEntity
import com.novatech.sandpiperstocks.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListing(): CompanyListingEntity {
    return CompanyListingEntity(
        // the id will be automatically generated
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}