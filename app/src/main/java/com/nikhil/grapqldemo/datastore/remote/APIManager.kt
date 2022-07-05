package com.nikhil.grapqldemo.datastore.remote

import com.apollographql.apollo3.ApolloClient


object APIManager {
    private const val baseurl ="https://api.spacex.land/graphql/"

   fun getApolloClient() = ApolloClient.Builder()
       .serverUrl(baseurl)
       .build()
}

