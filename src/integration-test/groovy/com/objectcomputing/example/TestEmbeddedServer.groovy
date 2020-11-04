package com.objectcomputing.example

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.ApplicationConfiguration
import io.micronaut.runtime.server.EmbeddedServer

import javax.inject.Singleton

@Singleton
class TestEmbeddedServer implements EmbeddedServer {

    int port

    @Override
    String getHost() {
        throw new UnsupportedOperationException()
    }

    @Override
    String getScheme() {
        throw new UnsupportedOperationException()
    }

    @Override
    URL getURL() {
        "http://localhost:${getPort()}".toURL()
    }

    @Override
    URI getURI() {
        throw new UnsupportedOperationException()
    }

    @Override
    ApplicationContext getApplicationContext() {
        throw new UnsupportedOperationException()
    }

    @Override
    ApplicationConfiguration getApplicationConfiguration() {
        throw new UnsupportedOperationException()
    }

    @Override
    boolean isRunning() {
        throw new UnsupportedOperationException()
    }
}