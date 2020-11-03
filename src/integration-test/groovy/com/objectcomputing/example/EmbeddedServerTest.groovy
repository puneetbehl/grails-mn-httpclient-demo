package com.objectcomputing.example

import grails.testing.spock.OnceBefore
import io.micronaut.runtime.server.EmbeddedServer

import javax.inject.Inject

trait EmbeddedServerTest {
    @Inject
    EmbeddedServer myEmbeddedServer

    @OnceBefore
    void initializeServerPort() {
        myEmbeddedServer.port = serverPort
    }
}