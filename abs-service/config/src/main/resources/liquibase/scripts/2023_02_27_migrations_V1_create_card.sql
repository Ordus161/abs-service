CREATE TABLE card
(
    id                BIGSERIAL PRIMARY KEY,
    uuid              UUID UNIQUE        NOT NULL,
    client_uuid       UUID UNIQUE        NOT NULL,
    card_number       VARCHAR(16) UNIQUE NOT NULL,
    account_number    VARCHAR(30) UNIQUE NOT NULL,
    transaction_limit DECIMAL(19, 4) CHECK ( transaction_limit >= 0 ),
    status            VARCHAR(30)        NOT NULL,
    expiration_date   DATE               NOT NULL CHECK ( now() < expiration_date ),
    holder_name       VARCHAR(50)        NOT NULL
);