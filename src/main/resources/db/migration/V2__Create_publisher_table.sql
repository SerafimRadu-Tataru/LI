CREATE TABLE publisher (
                           id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
                           name VARCHAR(100) NOT NULL
);

ALTER TABLE book
    ADD COLUMN publisher_id BIGINT;

ALTER TABLE book
    ADD CONSTRAINT fk_publisher
        FOREIGN KEY (publisher_id)
            REFERENCES publisher(id);
