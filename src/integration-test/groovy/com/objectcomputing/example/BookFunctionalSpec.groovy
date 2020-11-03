package com.objectcomputing.example


import grails.testing.mixin.integration.Integration
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import org.springframework.beans.factory.annotation.Autowired
import spock.lang.Specification

@Integration
class BookFunctionalSpec extends Specification implements EmbeddedServerTest {

    @Autowired
    BookClient bookClient

    void "Test the index action"() {
        when:"The index action is requested"
        HttpResponse<List<Map>> response = bookClient.index()

        then:"The response is correct"
        response.status == HttpStatus.OK
        response.body() == []
    }
}


