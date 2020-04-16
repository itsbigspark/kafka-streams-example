package dev.bigspark.kafka;
import org.apache.kafka.streams.kstream.KStreamBuilder;

@FunctionalInterface
public interface TopologyBuilder {
    void buildTopology(String viewTopic, String clickTopic, KStreamBuilder builder);
}
