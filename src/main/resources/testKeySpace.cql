CREATE KEYSPACE IF NOT EXISTS testKeySpace WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };

CREATE TABLE IF NOT EXISTS testKeySpace.greetings (
    id int,
    content text,
    PRIMARY KEY (id)
);