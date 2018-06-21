# blooddonor
Blood Donor is an application for find nearest Blood bank and Donor

# Keyspace cration
Cassandra keyspace create in google app engin by bitnam
CREATE KEYSPACE donorinfo WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'}  AND durable_writes = true;


# Table creation for donor info
CREATE TABLE donorinfo.donor_info_table (
  donor_id text PRIMARY KEY,
  first_name text,
  last_name text,
  emails text,
  phone_number text,
  age int,
  gender text,
  zip text,
  city text,
  blood_type text,
  laste_date_of_don date
);

# Alter the above table add lastedonated date
ALTER TABLE donorinfo.donor_info_table
ADD laste_date_of_don date;
