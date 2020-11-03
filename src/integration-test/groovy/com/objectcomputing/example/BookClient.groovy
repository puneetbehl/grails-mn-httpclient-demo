package com.objectcomputing.example

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client(Test.BASE_URL)
interface BookClient {

    @Get(uri = '/book', processes = 'application/json')
    HttpResponse<List<Map>> index()
}
