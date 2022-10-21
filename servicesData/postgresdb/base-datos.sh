#!/bin/bash
set -e

#psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

#    CREATE USER admin PASSWORD 'admin';
#    CREATE DATABASE redsocialdb OWNER admin;
#    GRANT ALL PRIVILEGES ON DATABASE redsocialdb TO admin;

#EOSQL

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
	CREATE USER admin PASSWORD 'admin';
	CREATE DATABASE redsocialdb OWNER admin;
	GRANT ALL PRIVILEGES ON DATABASE redsocialdb TO admin;
EOSQL
