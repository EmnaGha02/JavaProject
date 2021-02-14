/*accc : root 
mdp : root

name the  data base : swing_demo
--------------------------------------------------------*/
create database swing_demo;
 
CREATE TABLE accountDoctor
( txtCin varchar(250) NOT NULL,
  txtFullname varchar(250) NOT NULL,
  txtId varchar(250) NOT NULL,
  txtPassword varchar(250),
  txtMail varchar(250) NOT NULL,
  txtSpeciality vrchar(250) NOT NULL
  txtAboutme varchar(250) NOT NULL
);


/*-------------------------------------------------------*/

CREATE TABLE accountPatient
( txtCin varchar(250) NOT NULL,
  txtFullname varchar(250) NOT NULL,
  txtId varchar(250) NOT NULL,
  txtPassword varchar(250),
  txtMail varchar(250) NOT NULL,
  
);


/*------------------------------------------------------*/
CREATE TABLE accountAdmin
( txtCin varchar(250) NOT NULL,
  txtFullname varchar(250) NOT NULL,
  txtId varchar(250) NOT NULL,
  txtPassword varchar(250),
  txtMail varchar(250) NOT NULL,
  
);
				

/*------------------------END--------------------------------*/


