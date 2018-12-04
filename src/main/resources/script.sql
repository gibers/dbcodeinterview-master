create table contact (
	idcont bigint not null
		constraint contact_pkey
			primary key,
	firstname text,
	lastname text,
	phonenumber text,
	emailaddress text
);

-- alter table contact owner to player2 ;

-- create sequence seq_contact;




