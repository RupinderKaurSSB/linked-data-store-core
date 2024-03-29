import no.ssb.lds.api.persistence.PersistenceInitializer;

module no.ssb.lds.core {
    requires no.ssb.lds.persistence.api;
    requires no.ssb.config;
    requires no.ssb.concurrent.futureselector;
    requires no.ssb.saga.api;
    requires no.ssb.saga.execution;
    requires jdk.unsupported;
    requires java.base;
    requires java.net.http;
    requires org.slf4j;
    requires undertow.core;
    requires xnio.api;
    requires org.json;
    requires hystrix.core;
    requires org.everit.json.schema;
    requires java.xml; // TODO this should be in test-scope only!

    requires graphql.java;

    uses PersistenceInitializer;

    exports no.ssb.lds.core;
}
