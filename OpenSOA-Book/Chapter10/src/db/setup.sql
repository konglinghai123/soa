CONNECT 'jdbc:derby://localhost:1527/synapsedb;user=synapse;password=synapse;create=true';

create table customer (customerId varchar(20), customerName varchar(60), salesContactId int);
insert into customer values('GT00978567', 'IYT Corporation', 10021);
insert into customer values('GT00978568', 'Acme Corporation', 10022);

create table salesrep (salesContactId int, name varchar(60), email varchar(30));
insert into salesrep values(10021, 'John Doe', 'jdoe@someplace.com');
insert into salesrep values(10022, 'Jane Doe', 'jndoe@someplace.com');

select * from salesrep sr join customer c on sr.salesContactId = c.salesContactId where c.customerId = 'GT00978567';
