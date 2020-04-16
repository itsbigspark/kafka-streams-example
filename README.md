This assumes that you already have kafka running (and a fairly recent version, otherwise swap out bootstrap-server for zookeeper server )

Running the following to create the topics

`
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 2 --topic view --config message.timestamp.type=CreateTime
bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 2 --topic click --config message.timestamp.type=CreateTime
`

Run the class there are examples of

InnerJoin
InnerWindowedJoinStream

I will add more in the future

// TODO update the Streams version to 2.5.x (change in the streamsBuilder class is quite nice) 
