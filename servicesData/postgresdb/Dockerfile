FROM postgres:10.22-alpine
#FROM postgres:13.1-alpine
COPY base-datos.sh /docker-entrypoint-initdb.d/
RUN chmod +x /docker-entrypoint-initdb.d/*.sh
EXPOSE 5432
 
