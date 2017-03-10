create table students (stdid NUMBER CONSTRAINT students_stdid_primaryKey PRIMARY KEY,
stdname VARCHAR2(40) CONSTRAINT students_stddname_unique UNIQUE,
stdphone VARCHAR2(11),
email VARCHAR2(30),
stdgender char(1),
stdbirthday DATE,
stdyear NUMBER
);

alter TABLE students add (stdimage blob);

SELECT * FROM students;

UPDATE STUDENTS set stdphone='01289286468' WHERE stdid=7;

select SEQbranch.nextval FROM dual;


select stdid,
stdname,
stdphone,
CASE(stdgender) WHEN '0' THEN 'Male'
                WHEN '1' THEN 'Female' ELSE 'Other' END,
TO_char(stdbirthday,'dd-Mon-YYYY'),
CASE(stdyear) WHEN 0 THEN '1st Primary'
              WHEN 1 THEN '2nd Primary'
              WHEN 2 THEN '3rd Primary'
              WHEN 3 THEN '4th Primary'
              WHEN 4 THEN '5th Primary'
              WHEN 5 THEN '6th Primary'
              WHEN 6 THEN '1st Secondary'
              WHEN 7 THEN '2nd Secondary'
              WHEN 8 THEN '3rd Secondary'
              WHEN 9 THEN '1st High school'
              WHEN 10 THEN '2nd High school'
              WHEN 11 THEN '3rd High school'
              WHEN 12 THEN 'Others-General'
              else null END
from students;


set serveroutput on;

begin 
load_file(1,'img-not-found.png','A:\');
end;


create or replace PROCEDURE load_file ( studentID NUMBER,ImageName VARCHAR2,DirectoryPath VARCHAR2)
AUTHID CURRENT_USER IS 

l_size number; 
l_file_ptr bfile;
l_blob blob;
sqlCommand VARCHAR2(250);
begin 
dbms_output.put_line('5');

sqlCommand :='CREATE OR REPLACE DIRECTORY IMGDIR AS '''||DirectoryPath||'''' ;
--dbms_output.put_line(sqlCommand );
 
 EXECUTE IMMEDIATE (sqlCommand);

l_file_ptr := bfilename('IMGDIR', ImageName); 

dbms_lob.fileopen(l_file_ptr); 

l_size := dbms_lob.getlength(l_file_ptr);

update STUDENTS  set   STDIMAGE = empty_blob() WHERE STDID= studentID
returning STDIMAGE into l_blob;


dbms_lob.loadfromfile(l_blob, l_file_ptr, l_size);

commit;
dbms_lob.close(l_file_ptr);
end load_file;


insert into Students values
(
(311),
('Fsdhfdg'),
('43242343223'),
('fdgdfsgfd@fds.com'),
('1'),
(to_date('30-7-2017','DD-MM-YYYY')),
(2),
load_file(1044,'img-not-found.png','A:\')
);

 
create SEQUENCE SEQstudents increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQcourses increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQemployees increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQdept increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQrooms increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQbranch increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQgroup increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQappointment increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQpayroll increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQexams increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE SEQexamsDetail increment by 1 start with 1 nomaxvalue nocycle nocache;
create SEQUENCE center.SEQCOMISSION increment by 1 start with 1 nomaxvalue nocycle CACHE 2;
create SEQUENCE SEQattendance increment by 1 start with 1 nomaxvalue nocycle nocache;


DROP SEQUENCE SEQCOMISSION;

select SEQattendance.nextval from DUAL;
select SEQpayroll.CURrval from DUAL;

drop SEQUENCE SEQgroup; 

select nvl(enddate,sysdate+100*92),enddate from courses;


CREATE OR REPLACE PROCEDURE CENTER.load_file (sqlDML NUMBER,numberupdate NUMBER,studentname VARCHAR2,studentphone VARCHAR2 ,studentemail VARCHAR2,studentgender CHAR,studentbirthday date,studentyear NUMBER,ImageName VARCHAR2,DirectoryPath VARCHAR2)
AUTHID CURRENT_USER IS 
l_size number; 
l_file_ptr bfile;
l_blob blob;
sqlCommand VARCHAR2(250);
begin 

  IF (sqlDML =0)   then --INSERTING

      IF  (ImageName ='' and DirectoryPath ='') or (ImageName is NULL or DirectoryPath is NULL) then --NO IMAGE
      
      insert into STUDENTS VALUES 
      (
        SEQstudents.NEXTVAL,
        studentname,
        studentphone,
        studentemail,
        studentgender,
        studentbirthday,
        studentyear,
        null
      );
      
      else --IMAGE FOUND
      sqlCommand :='CREATE OR REPLACE DIRECTORY IMGDIR AS '''||DirectoryPath||'''' ;
      EXECUTE IMMEDIATE (sqlCommand);
      l_file_ptr := bfilename('IMGDIR', ImageName); 
      dbms_lob.fileopen(l_file_ptr); 
      l_size := dbms_lob.getlength(l_file_ptr);
      insert into STUDENTS VALUES 
      (
        SEQstudents.NEXTVAL,
        studentname,
        studentphone,
        studentemail,
        studentgender,
        studentbirthday,
        studentyear,
        empty_blob()
        )returning STDIMAGE into l_blob;
        
        dbms_lob.loadfromfile(l_blob, l_file_ptr, l_size);
        dbms_lob.close(l_file_ptr);
      end if;
--------------------------------------
  else   --updateing
    IF  (ImageName ='' and DirectoryPath ='') or (ImageName is NULL or DirectoryPath is NULL) then --NO IMAGE
      update students set stdname = studentname ,
                          stdphone =studentphone,
                          email=studentemail,
                          stdgender=studentgender,
                          stdbirthday=studentbirthday,
                          stdyear=studentyear
                          WHERE STDID=numberupdate;
    else   
      
      sqlCommand :='CREATE OR REPLACE DIRECTORY IMGDIR AS '''||DirectoryPath||'''' ;
      EXECUTE IMMEDIATE (sqlCommand);
      l_file_ptr := bfilename('IMGDIR', ImageName); 
      dbms_lob.fileopen(l_file_ptr); 
      l_size := dbms_lob.getlength(l_file_ptr); 
      
      update students set stdname = studentname ,
                          stdphone =studentphone,
                          email=studentemail,
                          stdgender=studentgender,
                          stdbirthday=studentbirthday,
                          stdyear=studentyear,
                          STDIMAGE=empty_blob() 
                          WHERE STDID=numberupdate
                          returning STDIMAGE into l_blob;
        
        dbms_lob.loadfromfile(l_blob, l_file_ptr, l_size);
        dbms_lob.close(l_file_ptr);
        
    end if;
------------------------------

  END if;
  

commit;

end load_file; 


BEGIN
execute load_file(1 ,1000,'David shiref','01289286468','david_alltime@yahoo.com','1',to_date('31-7-2017','DD-MM-YYYY') ,'13','','');
end;

--begin 
execute load_file('Ahmed1','737','@yahoo.com','0',sysdate,1,'img-not-found.png','A:\');
--end;

select COALESCE(stdimage,false) from students;

select * from hr.user_table;

alter table validations modify formID varchar2(100);

SELECT    adding,edite,remove,viewdata,showform FROM users JOIN VALIDATIONS on VALIDATIONS.USER_ID = users.USER_ID  where USERName ='admin' and password='admin' and FormID='Students.Student';



create table employees (
employeeid NUMBER CONSTRAINT emp_empid_primaryKey PRIMARY KEY ,
employeename VARCHAR2(40) CONSTRAINT employees_employeedname_unique UNIQUE,
employeeEmail VARCHAR2(30),
employeePhone VARCHAR2(11),
employeesalary NUMBER,
employeeDepartment NUMBER CONSTRAINT emp_employeeDepartment_fk REFERENCES departments(departmentid),
);

alter TABLE employees add (gender CHAR(1));

drop TABLE employees CASCADE CONSTRAINTS PURGE;


create table departments (
departmentid NUMBER CONSTRAINT dept_departmentid_primaryKey PRIMARY KEY,
departmentname VARCHAR2(40) CONSTRAINT dept_departmentname_unique UNIQUE,
departmentmanger VARCHAR2(30)
);



create table courses (
courseid NUMBER CONSTRAINT courses_courseid_primaryKey PRIMARY KEY,
coursename VARCHAR2(40) CONSTRAINT courses_coursedname_unique UNIQUE,
courseprice NUMBER,
courseblocked char(1),
courseStatus CHAR(1),
courseInstructor NUMBER CONSTRAINT courses_courseInstructor_fk REFERENCES employees (employeeid)
);

drop TABLE courses;

select courseid,
       coursename,
       courseprice,
       employeename,
       courseblocked,
       coursestatus  
       from courses JOIN EMPLOYEES 
       on EMPLOYEES.EMPLOYEEID=courseInstructor;

select courseid,
       coursename,
       courseprice,
       courseinstructor,
       courseblocked,
       coursestatus  from courses;where courseid=2;


insert into Courses values(
                          (SEQcourses.nextval),
                          ('E'),
                          (1),
                          (0),
                          (0),
                          (select employeeid from employees where employeename like'kareem' ));
ROLLBACK;

update  courses set  coursename =(Engl), 
                    courseprice =(5), 
                    courseblocked =(1), 
                    courseStatus =(0), 
                    courseInstructor =((select employeeid from employees where employeename like 'david')) where courseID=3;
                    
                    
select employeeid,
       employeename,
       employeeemail,
       employeephone,
       employeesalary,
       departmentname,
       to_char(employeebirthday,'DD-MM-YYYY'),
       to_char(employeehiredate,'DD-MM-YYYY'),
       case gender WHEN '1' THEN 'Male' ELSE 'Female' END
       from employees join departments on employees.employeedepartment=departments.departmentid
order by employeename ASC;


select EMPLOYEEID,
        employeename ,
        employeeemail,
        employeephone ,
        employeesalary||' EGP',
        departmentname,
        TO_char(sysdate,'YYYY')-TO_char(EMPLOYEEHIREDATE,'YYYY'),
        TO_char(sysdate,'YYYY')-TO_char(EMPLOYEEBIRTHDAY,'YYYY'),
        case (gender) WHEN '1' THEN 'Male' WHEN '0' THEN 'Female' END
        from EMPLOYEES join departments on departments.DEPARTMENTID=EMPLOYEES.EMPLOYEEDEPARTMENT;



update  employees set  
        employeename =('david'), 
        employeeemail =('david_alltime'), 
        employeephone =('01289286468'), 
        employeesalary =('1500'), 
        employeedepartment =(select departmentid from departments where departmentname = 'Instructor' ),
        employeebirthday =(to_date('11-8-2017','DD-MM-YYYY') ), 
        gender =('0') where employeeid=1;


select employeename,
       employeeemail,
       employeephone,
       employeesalary,
       departmentname,
       to_char(employeebirthday,'DD-MM-YYYY'),
       to_char(employeehiredate,'DD-MM-YYYY'),
       gender 
from employees join departments on employees.employeedepartment=departments.departmentid where employeeid=1
        
--(TO_char(sysdate,'YYYY') - TO_char(birthday ,'YYYY' ))        


select  departmentid , 
        departmentname , 
        nvl(employeename,'No Manger') 
        from departments left join employees 
        on departments.departmentmanger= employees.employeeid;
      

select  departmentname , 
        nvl(employeename,'No Manger') 
        from departments left join employees 
        on departments.departmentmanger= employees.employeeid(+)  where departmentid=3;


update  departments set 
        departmentname =(Instructor), 
        departmentmanger =(select employeeid from employees where employeename ='Kareem saead' ) 
        where departmentid=1;        
          
SELECT * FROM USER_TAB_COLUMNS WHERE TABLE_NAME ='DEPARTMENTS';       

DELETE FROM DEPARTMENTS WHERE DEPARTMENTID<>1;
COMMIT
alter table departments modify departmentmanger number;


select * from all_TRIGGERS;


SELECT COURSEID,
       COURSENAME,
       COURSEPRICE||' L.E',
       CASE(COURSEBLOCKED) WHEN '0' THEN 'Blocked'ELSE 'Non-Blocked' END,
       COURSESTATUS,
       EMPLOYEENAME,
       TO_CHAR(STARTDATE,'DD-MON-YYYY'),
       NVL(TO_CHAR(COURSES.ENDDATE,'DD-MON-YYYY'),'Opened'),
       CASE (PAYMENT) WHEN '0' THEN 'One Time' 
                      WHEN '1' THEN 'Per Session'
                      WHEN '2' THEN 'Per Cycle'
                      WHEN '3' THEN 'Free + Profit '
                      WHEN '4' THEN 'Full Free' END,
         (NVL (TO_CHAR(COURSES.CYCLE),'NO Cycle'))
       FROM CENTER.COURSES JOIN CENTER.EMPLOYEES ON CENTER.EMPLOYEES.EMPLOYEEID=CENTER.COURSES.COURSEINSTRUCTOR;

CREATE table CenterBranch 
(
centerid number constraints CenterBranch_centerid_pk primary key,
centerName varchar2(100),
centeraddress varchar2(100),
center_mangerID number constraints CenterBranch_centermangerID_fk references employees(employeeid),
capacity number,
startTime time
);
alter TABLE CenterBranch add (openTime TIMESTAMP,closetime TIMESTAMP);

insert into CENTERBRANCH VALUES
(
  2,
  'sand2',
  'suez',
  1,
  TO_TIMESTAMP('1:4PM', 'hh:mi AM'),
  CURRENT_timestamp
  );

SELECT to_char(opentime,'AM HH12:MI') from CENTERBRANCH;

CREATE table rooms 
(
CenterID NUMBER CONSTRAINT rooms_center_id REFERENCES CenterBranch(centerid),
roomID NUMBER ,
mincapacity number,
maxcapcity number,
roomlocation VARCHAR2(50)
);


select ROOMS.TABLEID,
       CENTERname,
       roomfloor ,
       ROOMS.ROMMSEQ,
       mincapacity,
       MAXCAPCITY       
from ROOMS join CENTERBRANCH on ROOMS.BRANCHID = CENTERBRANCH.CENTERID
where ROOMS.BRANCHID=(select CENTERBRANCH.CENTERID from CENTERBRANCH where CENTERBRANCH.CENTERNAME ='sand');

CREATE or REPLACE procedure center.rank (i NUMBER)  is 
begin
null;
end;

end rank ;




select         
      CENTERname,       
      roomfloor ,       
      mincapacity,       
      MAXCAPCITY  
from ROOMS join 
CENTERBRANCH on ROOMS.BRANCHID = CENTERBRANCH.CENTERID -- where Tableid=3;    
    
    
 update  rooms set  
 branchid =(select CENTERID from CENTERBRANCH where centername like '%sand%'), 
 roomfloor =(2), 
 ROMMSEQ =(select (count(*)+1)from rooms where ROOMFLOOR=2), 
 mincapacity =(0), 
 MAXCAPCITY =(0) 
 where TableId=3;    
    

select  centerID,centername,centeraddress ,employeename ,to_char(opentime,'hh:mi AM'),to_char(closetime,'hh:mi AM') from CENTERBRANCH JOIN EMPLOYEES ON EMPLOYEES.EMPLOYEEID=CENTERBRANCH.CENTER_MANGERID;
        
select centername,centeraddress ,employeename ,to_char(opentime,'hh:mi AM'),to_char(closetime,'hh:mi AM') from CENTERBRANCH JOIN EMPLOYEES ON EMPLOYEES.EMPLOYEEID=CENTERBRANCH.CENTER_MANGERID where centerID=1    


update  CENTERBRANCH set  
      CENTERNAME =(sand), 
      CENTERADDRESS =(suez), 
      CENTER_MANGERID =(select employeeid from employees where employeename like '%david shiref nazeer%' ),
      OPENTIME =(TO_TIMESTAMP('3:14PM', 'hh:mi AM')),
      CLOSETIME =(TO_TIMESTAMP('4:51AM', 'hh:mi AM'))
      where CENTERid=1;
      
      
      
insert into CENTERBRANCH values(
  (SEQbranch.nextval),
  ('jTextField1'),
  ('ws'),
  (select employeeid from employees where employeename like '%Kareem saead%' ),(TO_TIMESTAMP('2:2AM', 'hh:mi AM')),(TO_TIMESTAMP('3:4AM', 'hh:mi AM')));      


delete from CENTERBRANCH WHERE CENTERid=4;

DROP TABLE groups;


CREATE TABLE GROUPS
(
groupID NUMBER CONSTRAINT GROUPS_GROUPID_PK PRIMARY KEY,
groupNUMBER number,
CourseID NUMBER CONSTRAINT GROUPS_COURSEID_FK REFERENCES courses(COURSEID),
roomID CONSTRAINT GROUPS_roomID_FK REFERENCES Rooms(TABLEID),
per char(1)--week - Mounthly
); 


CREATE TABLE GROUPSAPPOINTMENTS
(
GroupID number CONSTRAINT GROUPSAPPOINTMENTS_GROUPID_FK REFERENCES GROUPS(GROUPID),
DayNumber number(1),
STARTTIME Timestamp,
endTime timestamp
);

select coursename from courses where COURSEBLOCKED='0' and NVL(ENDDATE,sysdate)>=sysdate; 


DECLARE
t1 timestamp;
t2 timestamp;
begin 

select starttime , endtime into t1 , t2 from GROUPSAPPOINTMENTS;

if  (t1<t2) THEN
  insert into GROUPSAPPOINTMENTS select * from GROUPSAPPOINTMENTS;
  end if;
 
end;

select (count(*)+1)from groups where courseid=(select courses.courseid from courses where courses.coursename= 'Dsa');

select COURSENAME from courses where COURSEBLOCKED='0' and NVL(ENDDATE,sysdate)>=sysdate;

select ( count(*)+1) from groups where courseid in(select courseid from courses where coursename like 'English' )  ;

select GROUPNumber,
       coursename,
       roomfloor||'0'||rommseq,
       case (per) when '0' then 'Every Month'
                  when '1' then 'Every Week' end,
       case(to_CHAR(DAYNUMBER)) when '0' then 'Sunday'
                       when '1' then 'Monday'
                       when '2' then 'Tuesday'
                       when '3' then 'Wednesday'
                       when '4' then 'Thursday'
                       when '5' then 'Friday'
                       when '6' then 'Sturday' end,
       to_char (starttime,'hh:mi AM'),                
       to_char (endtime,'hh:mi AM')

from GROUPS RIGHT JOIN GROUPSAPPOINTMENTS ON GROUPSAPPOINTMENTS.GROUPID = GROUPS.GROUPID
LEFT JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID
LEFT JOIN ROOMS on GROUPS.ROOMID = ROOMS.TABLEID;

                        
                        
select GROUPS.GROUPID,GROUPNumber,
--       coursename,
--     roomfloor||'0'||rommseq,
        per,
       DAYNUMBER,
       to_char (starttime,'hh:mi AM'),                
       to_char (endtime,'hh:mi AM')

from GROUPS   INNER JOIN GROUPSAPPOINTMENTS ON GROUPSAPPOINTMENTS.GROUPID = GROUPS.GROUPID
--LEFT JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID
--JOIN ROOMS on GROUPS.ROOMID = ROOMS.TABLEID
  ;
  
  
select groupnumber ,courseid ,roomid,NULL from GROUPS
UNION
select null,daynumber,0,starttime from GROUPSAPPOINTMENTS
;                        
          

select GROUPNumber,
       coursename,
       roomfloor||'0'||rommseq,
       case (per) when '0' then 'Every Month'
                  when '1' then 'Every Week' end,null,null,null

from GROUPS RIGHT JOIN GROUPSAPPOINTMENTS ON GROUPSAPPOINTMENTS.GROUPID = GROUPS.GROUPID
JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID
JOIN ROOMS on GROUPS.ROOMID = ROOMS.TABLEID
UNION
(select null,null,null,null, DAYS(DAYNUMBER),to_char (starttime,'hh:mi AM'),                
       to_char (endtime,'hh:mi AM')
from GROUPSAPPOINTMENTS    
   );


CREATE OR REPLACE FUNCTION DAYS (daynumber number) RETURN VARCHAR2 is
 BEGIN
 
 case (to_char(daynumber)) 
                       when '1'THEN RETURN 'Sunday';
                       when '2'THEN RETURN 'Monday';
                       when '3'THEN RETURN 'Tuesday';
                       when '4'THEN RETURN 'Wednesday';
                       when '5'THEN RETURN 'Thursday';
                       when '6'THEN RETURN 'Friday';
                       when '7'THEN RETURN 'Sturday' ;
                        
 end case;
end DAYS;


select z.starttime,GROUPNumber,
       case (per) when '0' then 'Every Month'
                  when '1' then 'Every Week' end
        ,f.GROUPNUMBER          
        
FROM GROUPS f , ( select DAYS(daynumber)s , starttime , endtime from groupsappointments,GROUPS where GROUPSAPPOINTMENTS.GROUPID = GROUPS.GROUPID ) z 
;


CREATE TABLE GROUPS 
(
  TABLEID NUMBER NOT NULL CONSTRAINT GROUPS_PK PRIMARY KEY 
, GROUPID NUMBER 
, COURSEID NUMBER CONSTRAINT fk198 references courses(courseid)
, ROOMID NUMBER CONSTRAINT fk199 references rooms (tableID)
, PER NUMBER(1) 
, ENDATE DATE 

)  ;


create TABLE appointment 
(
MAINID NUMBER primary Key,
group_ID number REFERENCES groups(TABLEID),
lectureday number (1),
starttime TIMESTAMP,
endtime TIMESTAMP
);


select GROUPS.TableID,
       groupID,
       coursename ,
       roomfloor||'0'||rommseq,
       per,
       DAYS(lectureday),
       to_char(starttime,'hh:mi am'),
       to_char(endtime,'hh:mi am')
from APPOINTMENT JOIN GROUPS
ON GROUPS.TABLEID=APPOINTMENT.GROUP_ID
JOIN COURSES 
ON GROUPS.COURSEID = COURSES.COURSEID
JOIN ROOMS 
on ROOMS.TABLEID = GROUPS.ROOMID
;

select GROUPS.TableID,
       groupID,
       coursename ,
       roomfloor||'0'||rommseq,
       case(per) when 0 then 'Every Week' else 'Every Month' END
from COURSES JOIN   GROUPS
ON GROUPS.COURSEID = COURSES.COURSEID
JOIN ROOMS 
on ROOMS.TABLEID = GROUPS.ROOMID
;
 


--set serveroutput on;
create or REPLACE TRIGGER schedule BEFORE INSERT ON Appointment FOR EACH ROW
 DECLARE
starttime1 timestamp;
endtime1 timestamp;
lecday number;
room number;
seq number;
  CURSOR   sch_cursor(rom number)   IS
SELECT starttime,endtime,LECTUREDAY 
from Appointment JOIN GROUPS ON APPOINTMENT.GROUP_ID=GROUPS.TABLEID
WHERE    ROOMID=rom AND  APPOINTMENT.LECTUREDAY=:new.lectureday;
BEGIN   
select groups.roomID into room from groups where tableID=(select max(tableid) from groups);
OPEN sch_cursor (room) ;
  LOOP
   FETCH sch_cursor INTO starttime1, endtime1,lecday;
IF( ( to_timestamp( to_char(:new.starttime,'hh:MI AM') )< to_timestamp( to_char(starttime1,'hh:MI AM') )) and 
(  to_timestamp( to_char(:new.endtime,'hh:MI AM') )< to_timestamp( to_char(endtime1,'hh:MI AM') )     ) ) THEN 
 RAISE_APPLICATION_ERROR(-20000, 'Another Groups on Same Time');
else null;
end if ;
     EXIT WHEN    sch_cursor%NOTFOUND;        
end loop;
end;  
 


ALTER TRIGGER schedule disable;
5-10>areeb abonna 

insert into appointment values 
(
5, 
1,
1,
to_timestamp('14:12' ,'hh24:MI'),
to_timestamp('14:52' ,'hh24:MI')
);



--create or replace TRIGGER schedule BEFORE INSERT ON Appointment FOR EACH ROW
set serveroutput on;
 DECLARE
starttime1 timestamp;
endtime1 timestamp;
lecday number;
room number;
seq number;
CURSOR   sch_cursor(rom number)   IS
SELECT starttime,endtime,LECTUREDAY 
from Appointment JOIN GROUPS ON APPOINTMENT.GROUP_ID=GROUPS.TABLEID
WHERE    ROOMID=rom AND  APPOINTMENT.LECTUREDAY=1;

BEGIN 


select groups.roomID into room from groups where tableID=(select max(tableid) from groups);
dbms_output.put_line('room= '||room);
OPEN sch_cursor (room) ;
  LOOP
   FETCH sch_cursor INTO starttime1, endtime1,lecday;
IF( ( to_timestamp( to_char('4:05 AM','hh:MI AM') )< to_timestamp( to_char(starttime1,'hh:MI AM') )) and 
(  to_timestamp( to_char('4:55 AM','hh:MI AM') )< to_timestamp( to_char(endtime1,'hh:MI AM') )     ) )


THEN  RAISE_APPLICATION_ERROR(-20105, 'Another Groups on Same Time');

else null;
end if ;
dbms_output.put_line('5');
     EXIT WHEN    sch_cursor%NOTFOUND;        
end loop;
end;  

select groupID from groups where courseID=(select courseID from courses where coursename ='Java');

SELECT * FROM STUDENTS;


SELECT * from STUDENTS where stdid not in 
(
select REGISTERS.STUDENT_ID  from REGISTERS   JOIN GROUPS 
on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES 
on GROUPS.COURSEID = COURSES.COURSEID 
WHERE COURSES.COURSENAME=('Java')

);
 
 
SELECT * from STUDENTS where stdid not in 
(
select REGISTERS.STUDENT_ID  from REGISTERS   JOIN GROUPS 
on REGISTERS.GROUPSID = GROUPS.TABLEID  
WHERE REGISTERS.GROUPSID=( select courses.COURSEID from COURSES WHERE COURSES.COURSENAME=('Java'))
);


select stdname,COURSES.COURSENAME,GROUPS.GROUPID  from REGISTERS   JOIN GROUPS 
on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES 
on GROUPS.COURSEID = COURSES.COURSEID JOIN STUDENTS
on STUDENTS.STDID=REGISTERS.STUDENT_ID
WHERE GROUPS.GROUPID=1
ORDER BY REGISTERS.REGDATE;


select stdname,COURSES.COURSENAME,GROUPS.GROUPID  from REGISTERS   JOIN GROUPS 
on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES 
on GROUPS.COURSEID = COURSES.COURSEID JOIN STUDENTS
on STUDENTS.STDID=REGISTERS.STUDENT_ID
WHERE  REGISTERS.TABLEID=1 ORDER BY REGISTERS.REGDATE;

select REGISTERS.TABLEID, stdname,COURSES.COURSENAME,GROUPS.GROUPID  from REGISTERS   JOIN GROUPS on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID JOIN STUDENTS on STUDENTS.STDID=REGISTERS.STUDENT_ID ORDER BY  COURSES.COURSENAME, REGISTERS.REGDATE;

select stdname,COURSES.COURSENAME,GROUPID  from REGISTERS   JOIN GROUPS on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID JOIN STUDENTS on STUDENTS.STDID=REGISTERS.STUDENT_ID  where  REGISTERS.TABLEID=2 ORDER BY REGISTERS.REGDATE;

select SEQregister.nextval from dual;

update registers set groupsID=(select tableid  from groups where groupID=1 and courseid =(select courseid from courses where coursename ='Java') ) , student_id=(select stdid from students where stdname='Dsfs' ) where registers.tableid=12;

CREATE or REPLACE TRIGGER reg_Capacity BEFORE insert on registers FOR EACH ROW
DECLARE
maxy number;
counter number;
BEGIN
select (MAXCAPCITY) INTO maxy from rooms JOIN GROUPS on GROUPS.TABLEID=ROOMS.TABLEID
where GROUPS.GROUPID=(select groupid from GROUPS where GROUPS.tableID=:NEW.GROUPSID);

select count(student_id+1) into counter from registers;

IF (counter >= maxy) then --true Ignore
    RAISE_APPLICATION_ERROR(-20002, 'Group IS Closed - Full Number Registered');
  end if;

end;


select (mincapacity+MAXCAPCITY)  from rooms JOIN GROUPS on GROUPS.TABLEID=ROOMS.TABLEID
where GROUPS.GROUPID=(select groupid from GROUPS where GROUPS.tableID=5);


select stdname from students where stdid not in 
            ( 
            select REGISTERS.STUDENT_ID  from REGISTERS   JOIN GROUPS 
            on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES 
            on GROUPS.COURSEID = COURSES.COURSEID 
            WHERE COURSES.COURSENAME=('Java') AND REGISTERS.GROUPSID=(select tableid from groups where GROUPS.GROUPID=1)
            );
            

select coursename||'-'||GROUPS.groupid,stdname,lecnumber from 
ATTENDANCE JOIN SUBATTEND on SUBATTEND.TABLEID = ATTENDANCE.TABLEID
join GROUPS on GROUPS.TABLEID = ATTENDANCE.GROUPID
JOIN COURSES  
on GROUPS.COURSEID = COURSES.COURSEID
JOIN STUDENTS on SUBATTEND.ST_ID = STUDENTS.STDID
WHERE months=(select max(months) from ATTENDANCE where groupid=(select tableid from groups where groupid=1))
 ;
 
 
select coursename,GROUPID ,lectureday,to_char(starttime,'HH:MI AM'),to_char(endtime,'HH:MI AM')from APPOINTMENT JOIN GROUPS on GROUPS.TABLEID=APPOINTMENT.GROUP_ID join COURSES on GROUPS.COURSEID = COURSES.COURSEID WHERE APPOINTMENT.LECTUREDAY=7;


insert into subattend values(
  (SEQsubattend.nextval),
  (SEQattendance.currval),
  (select stdid from students where lower(stdname)='rwer'),(sysdate)
  );

 
 select stdname from students where stdid   in  
            ( 
            select REGISTERS.STUDENT_ID  from REGISTERS   JOIN GROUPS 
            on REGISTERS.GROUPSID = GROUPS.TABLEID  JOIN COURSES 
            on GROUPS.COURSEID = COURSES.COURSEID 
            WHERE COURSES.COURSENAME=('Java') AND REGISTERS.GROUPSID=(select groups.TABLEID from groups where GROUPS.groupID=1)
            )  and lower(stdname) like'%%';
      

select coursename||'-'||GROUPS.groupid,stdname,lecnumber from 
ATTENDANCE JOIN SUBATTEND on SUBATTEND.TABLEID = ATTENDANCE.TABLEID
join GROUPS on GROUPS.TABLEID = ATTENDANCE.GROUPID
JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID
JOIN STUDENTS on SUBATTEND.ST_ID = STUDENTS.STDID
WHERE months=(select max(months) from ATTENDANCE where groupid=(select tableid from groups where groupid=));


select 
stdname,
stdphone,
email,
to_number(to_char(sysdate,'YYYY')-to_char(stdbirthday,'YYYY')),
stdphone,
case stdgender when '0' then 'Male' else 'Female' end 
from students;
 

create RESTORE point aa;

insert into students SELECT * FROM students;

select
rownum,
DEPARTMENTS.DEPARTMENTNAME,
DEPARTMENTS.DEPARTMENTMANGER,
EMPLOYEES.EMPLOYEENAME,
EMPLOYEES.EMPLOYEEPHONE,
DEPARTMENTS.DEPARTMENTID,
EMPLOYEES.EMPLOYEEID,
EMPLOYEES.EMPLOYEESALARY
from DEPARTMENTS INNER join 
EMPLOYEES on DEPARTMENTS.DEPARTMENTID=EMPLOYEES.EMPLOYEEDEPARTMENT
WHERE DEPARTMENTS.DEPARTMENTNAME like '%%'
ORDER by ROWNUM,EMPLOYEES.EMPLOYEENAME,DEPARTMENTS.DEPARTMENTNAME;


select count(EMPLOYEEID),departmentname from DEPARTMENTS INNER join 
EMPLOYEES on DEPARTMENTS.DEPARTMENTID=EMPLOYEES.EMPLOYEEDEPARTMENT
GROUP by departmentname ;


select 
ROWNUM,
courseid, 
coursename,
to_char(courseprice,'999,9')||' LE' ,
to_char(startdate,'DD/MM/YYYY'),
to_char(enddate,'DD/MM/YYYY'),
case(coursestatus) when '0'then 'Open to Public'
when '1' then 'Private
'else 'Offer' end,
case (payment) WHEN '0' THEN 'One Shot' WHEN '1' THEN 'Per Session' WHEN '2' THEN 'Per Cycle' WHEN '3' THEN 'Free Profit' WHEN '4' THEN 'Full Free' END,
nvl(to_char(CYCLE),'NO')
from courses where COURSEBLOCKED='0' and NVL(ENDDATE,sysdate)>=sysdate;


SELECT stdid,stdname,stdphone,EMAIL,case(stdgender)WHEN'0'THEN'Male'ELSE 'Female' end f,
to_char(STDBIRTHDAY,'DD/Mon/YYYY'),
to_number(to_char(Sysdate,'YYYY')) -to_number(to_char(STDBIRTHDAY,'YYYY')) bi
FROM STUDENTS
WHERE to_number(to_char(Sysdate,'YYYY'))-to_number(to_char(STDBIRTHDAY,'YYYY')) between '10' and '100'
ORDER by STDNAME,STDGENDER;


select centerid,
       centername,
       centeraddress,
       to_char(opentime,'HH:MI AM'),
       to_char(closetime,'HH:MI AM'),
       J.G
from CENTERBRANCH ,
(select count(ROOMS.TABLEID) g,ROOMS.BRANCHID ff from rooms GROUP BY ROOMS.BRANCHID) j 
WHERE J.FF=CENTERBRANCH.CENTERID
 ;       
 

select centername,
       mincapacity,
       ROOMS.MAXCAPCITY,
       roomfloor,
       roomfloor||''||rommseq
       from rooms JOIN CENTERBRANCH on ROOMS.BRANCHID=CENTERBRANCH.CENTERID
       ;--WHERE centername =
       

select COURSES.courseid,
       coursename,
       EMPLOYEES.EMPLOYEEID,
       employeename,
       F.H
       from COURSES JOIN EMPLOYEES on COURSES.COURSEINSTRUCTOR=EMPLOYEES.EMPLOYEEID
       ,(select count(tableid) h,GROUPS.COURSEID from groups GROUP BY GROUPs.COURSEID) f
       WHERE F.COURSEID=COURSES.COURSEID and COURSES.COURSEBLOCKED='0'and NVL(ENDDATE,sysdate)>=sysdate;


select groupID ,
       case(per)WHEN 1 THEN 'Weekly' else 'Monthly'end per ,
       coursename,
       ROOMS.ROOMFLOOR||'0'||ROOMS.ROMMSEQ room,
       employeeNAme,
      case APPOINTMENT.LECTUREDAY WHEN 1 THEN 'Sunday'
                                  WHEN 2 THEN 'Monday'
                                  WHEN 3 THEN 'Tuesday'
                                  WHEN 4 THEN 'Wednesday'
                                  WHEN 5 THEN 'Thursday'
                                  WHEN 6 THEN 'Friday'
                                  else 'Sturday' END day,
       APPOINTMENT.STARTTIME,
       APPOINTMENT.ENDTIME
       from groups JOIN courses on GROUPS.COURSEID=COURSES.COURSEID
       JOIN rooms on ROOMS.TABLEID=GROUPS.ROOMID JOIN
       employees on COURSES.COURSEINSTRUCTOR=EMPLOYEES.EMPLOYEEID JOIN
       APPOINTMENT on APPOINTMENT.GROUP_ID=GROUPS.TABLEID
       WHERE coursename ='Java';
  

select stdname, 
      stdphone,
      COURSES.COURSEID,
       coursename,
       groupid,
       COURSES.COURSEINSTRUCTOR,
       employeename
from students join registers on
registers.student_id=STUDENTS.STDID join GROUPS on
GROUPS.TABLEID=registers.groupsid join COURSES on
GROUPS.COURSEID = COURSES.COURSEID JOIN EMPLOYEES on  employees.employeeid=COURSES.COURSEINSTRUCTOR
WHERE coursename='Java'and groupid='1'
ORDER BY STUDENTS.STDNAME,EMPLOYEES.EMPLOYEENAME
;


select (MAXCAPCITY)   from rooms 
where tableid=(select ROOMS.TABLEID from rooms where tableid=5);


select groups.groupid,
       courses.coursename,
       courses.courseid,
       st_id ,
       stdname,
       to_char(SUBATTEND.REGTIME,'DD/MON/YYYY HH:MI AM'),
       ATTENDANCE.LECNUMBER,
        ATTENDANCE.MONTHS StartIN,
        (select to_char(max(ATTENDANCE.MONTHS),'DD-MM-YYYY') from ATTENDANCE WHERE ATTENDANCE.GROUPID=ATTENDANCE.GROUPID   )
from ATTENDANCE 
join SUBATTEND on SUBATTEND.PARENTID = ATTENDANCE.TABLEID
JOIN GROUPS on GROUPS.TABLEID = ATTENDANCE.GROUPID
JOIN STUDENTS on SUBATTEND.ST_ID = STUDENTS.STDID
JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID
WHERE COURSES.COURSENAME='Java' and 
      GROUPS.GROUPID='1' and 
      ATTENDANCE.LECNUMBER='1'
;


select groups.groupid,
       courses.coursename,
       courses.courseid,
       st_id ,
       stdname,
       to_char(SUBATTEND.REGTIME,'DD/MON/YYYY HH:MI AM'),
       ATTENDANCE.LECNUMBER,
        ATTENDANCE.MONTHS StartIN,
        (select to_char(max(ATTENDANCE.MONTHS),'DD-MM-YYYY') from ATTENDANCE WHERE ATTENDANCE.GROUPID=ATTENDANCE.GROUPID   )
from ATTENDANCE 
join SUBATTEND on SUBATTEND.PARENTID = ATTENDANCE.TABLEID
JOIN GROUPS on GROUPS.TABLEID = ATTENDANCE.GROUPID
JOIN STUDENTS on SUBATTEND.ST_ID = STUDENTS.STDID
JOIN COURSES on GROUPS.COURSEID = COURSES.COURSEID
WHERE COURSES.COURSENAME='Java' and 
      GROUPS.GROUPID='1' and 
      ATTENDANCE.LECNUMBER='1'
      and st_id;

select stdname,stdid from STUDENTS WHERE stdid in (
select student_id from REGISTERS WHERE GROUPSID=(select tableid from GROUPS WHERE GROUPS.GROUPID=1 and GROUPS.COURSEID=(select courseid from COURSES where coursename ='Java'))
MINUS
(SELECT st_id from SUBATTEND JOIN ATTENDANCE on SUBATTEND.PARENTID = ATTENDANCE.TABLEID WHERE ATTENDANCE.LECNUMBER=1));

select to_char(attendance.months,'dd/mm/yyyy') from attendance WHERE ROWNUM=1;

select to_char(attendance.months,'DD/MON/YYYY') from attendance where LECNUMBER=1 AND groupid=(select tableid from groups where courseid=(select courseid from courses where coursename='Java')AND tableid=ATTENDANCE.GROUPID);
 
select  ATTENDANCE.LECNUMBER from ATTENDANCE where groupid=(select tableid from groups where courseid=(select courseid from courses where coursename ='Java')  );

CREATE TABLE payroll(
  tableid NUMBER PRIMARY KEY,
  paydate DATE,
  courseid NUMBER REFERENCES courses(courseid),
  stdid NUMBER REFERENCES students(stdid),
  paid NUMBER,
  PCT NUMBER  REFERENCES comissions(tableid)
  );


select USER_CONSTRAINTS.CONSTRAINT_NAME,USER_CONSTRAINTS.TABLE_NAME,USER_CONS_COLUMNS.COLUMN_NAME,
USER_CONSTRAINTS.R_CONSTRAINT_NAME from USER_CONS_COLUMNS 
JOIN USER_CONSTRAINTS on USER_CONSTRAINTS.CONSTRAINT_NAME = USER_CONS_COLUMNS.CONSTRAINT_NAME
WHERE USER_CONSTRAINTS.CONSTRAINT_NAME='SYS_C007413' AND USER_CONSTRAINTS.CONSTRAINT_TYPE='R';

alter TABLE SUBATTEND drop CONSTRAINT SYS_C007413;
alter TABLE SUBATTEND ADD CONSTRAINT SYS_C007413_E 
FOREIGN KEY (PARENTID) references  attendance(tableID) on DELETE CASCADE  ;

select  DISTINCT(stdname) from registers 
 JOIN students on students.stdid=REGISTERS.STUDENT_ID 
 JOIN GROUPS on GROUPS.TABLEID=REGISTERS.GROUPSID
WHERE GROUPS.COURSEID=(select courseid from courses where coursename ='Java');

desc courses;

------------------------------------------------------
select nvl(courseprice, (select comvalue from comissions where tableid=(select max(tableid)from comissions))
 )
from COURSES where payment <>'3' AND coursename='Java';
-----------------------------------------------------
select courseid,
        coursename,
        NVL(courseprice,(case payment when '3'then
                          (select comvalue from comissions where tableid=(select max(tableid)from comissions) 
                           )when '4' then 0 end)
           ), 
        case(courseblocked) when '0' then 'Blocked'
                            else 'On List' END,
        case(coursestatus) when'0' then 'Open Public' 
                           when'1' then 'Private'
                           when'2' then 'Offer' end, 
        employeename,
        to_char(startdate,'DD-MON-YYYY'), 
        NVL(to_char(COURSES.ENDDATE,'DD-MON-YYYY'),'Opened'),
        case (payment) WHEN '0' THEN 'One Time' 
                       WHEN '1' THEN 'Per Session' 
                       WHEN '2' THEN 'Per Cycle' 
                       WHEN '3' THEN 'Free + Profit ' 
                       WHEN '4' THEN 'Full Free' END,
                       COALESCE (to_char(COURSES.CYCLE),'NO Cycle') 
from COURSES JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=COURSES.COURSEINSTRUCTOR;

select  GROUPS.GROUPID from registers join groups on GROUPS.TABLEID=REGISTERS.GROUPSID where student_id=(select stdid from students where stdname ='Soha ali') and GROUPS.COURSEID=(select courseid from courses where coursename='Java');
select GROUPS.GROUPID from registers join groups on GROUPS.TABLEID=REGISTERS.GROUPSID where student_id=(select stdid from students where stdname ='Student Name') and GROUPS.COURSEID=(select courseid from courses where coursename='Java');

select case (payment) WHEN '0' THEN 'One Time' 
                       WHEN '1' THEN 'Per Session' 
                       WHEN '2' THEN 'Per Cycle' 
                       WHEN '3' THEN 'Free + Profit ' 
                       WHEN '4' THEN 'Full Free' END,
      employeename,
      nvl(to_char(CYCLE),'No Cycle'),(select comvalue from comissions where tableid=(select max(tableid)from comissions)) 
from COURSES JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=COURSES.COURSEINSTRUCTOR
where coursename ='Java';

select LECNUMBER+1 from ATTENDANCE where CLOSESTATUS=1and months=(select max(months)from attendance) and groupid=(select tableid from GROUPS where GROUPS.GROUPID=1 and courseid =(select courseid from courses where coursename ='Java'));


select stdname,
       to_char(paydate,'DD/MON/YYYY'),
       coursename,
       paid,
       comvalue,
       (COURSES.COURSEPRICE*COMISSIONS.COMVALUE)/100
from PAYROLL 
JOIN STUDENTS on  STUDENTS.STDID = PAYROLL.STDID
JOIN COURSES on COURSES.COURSEID=PAYROLL.COURSEID 
JOIN COMISSIONS on PAYROLL.pct = COMISSIONS.TABLEID
where stdname='Soha ali' and COURSES.COURSENAME='Java'
;


select  to_char( nvl(courseprice, (
              select comvalue from comissions where tableid=(select max(tableid)from comissions)))
)
from COURSES where coursename='A2';


select p.tableid ,
       p.paydate,
       p.stdid,
       s.stdname,
       c.coursename,
       c.courseid,
       com.comvalue
from payroll p JOIN students s on S.STDID=P.STDID
 JOIN COMISSIONS com on COM.TABLEID=P.PCT
 FULL JOIN GROUPS g on G.TABLEID =P.COURSEID
FULL JOIN groups gg on GG.TABLEID=G.GROUPID
 JOIN courses c on C.COURSEID=P.COURSEID
 WHERE P.PAYDATE BETWEEN TO_DATE('9/11/2016', 'DD/MM/YYYY') and TO_DATE('9/12/2017', 'DD/MM/YYYY');
  
  
select p.tableid ,to_char(p.paydate,'DD/MON/YYYY'),p.stdid,s.stdname,c.coursename,c.courseid,com.comvalue from payroll p JOIN students s on S.STDID=P.STDID JOIN COMISSIONS com on COM.TABLEID=P.PCT FULL JOIN GROUPS g on G.TABLEID =P.COURSEID FULL JOIN groups gg on GG.TABLEID=G.GROUPID JOIN courses c on C.COURSEID=P.COURSEID WHERE P.PAYDATE BETWEEN to_date('1/12/2016','dd/mm/yyyy') and to_date('3/12/2016','dd/mm/yyyy')
;


create table exams(tableid number primary key,names VARCHAR2(50),courseid number REFERENCES courses(courseid) ON DELETE CASCADE,groupID NUMBER REFERENCES groups(tableid) ON DELETE CASCADE,mindegree number,maxdegree number,supervisor NUMBER ,examsdate DATE);
drop TABLE exams;

select EXAMS.tableid ,
      names,
      coursename,
      EXAMS.groupid,
      mindegree,
      maxdegree,
        EMPLOYEES.EMPLOYEENAME,
      examsdate
from exams JOIN COURSES on EXAMS.COURSEID=COURSES.COURSEID JOIN GROUPS on GROUPS.TABLEID = EXAMS.GROUPID
JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=EXAMS.SUPERVISOR  WHERE EXAMS.tableid=1111;

update  exams set  names =('mid'), courseid =(select courseid from courses where coursename='A0' ), groupid =(select tableid from groups where groupid=1 and courseid=(select courseid from courses where coursename='A0')), mindegree =(20), maxdegree =(200), supervisor =(select employeeid from employees where employeename ='Kemoo' ), examdate =(to_date('5-1-2016','DD-MM-YYYY') ) where tableid=3;


insert into exams values((SEQexams.nextval),
('mid'),
(select courseid from courses where coursename ='A0' ),
(select tableid from groups where groupid=1 and courseid =(select courseid from courses where coursename ='A0')),
(20),
(200),
(null),
(to_date('6-12-2016','DD-MM-YYYY') )
)
;

select EXAMS.tableid ,
      names,
      coursename,
      EXAMS.groupid,
      mindegree,
      maxdegree,
      supervisor,to_char(examsdate,'DD-Mon-YYYY')
from exams JOIN COURSES on EXAMS.COURSEID=COURSES.COURSEID JOIN GROUPS on GROUPS.TABLEID = EXAMS.GROUPID
WHERE EXAMS.tableid=3;

create table examdetail(tableid NUMBER PRIMARY key,exameparent NUMBER REFERENCES exams(tableid) ,stdid NUMBER REFERENCES students(stdid),paperdegree NUMBER);


select 
  E.EXAMSDATE,
  E.MINDEGREE,
  E.NAMES,
  D.PAPERDEGREE,
  S.STDNAME,
  coursename,
  gg.groupid
from 
  EXAMS e JOIN EXAMDETAIL d on E.TABLEID=D.EXAMEPARENT
  JOIN STUDENTS s on S.STDID=D.STDID
  JOIN courses c on C.COURSEID=E.COURSEID
  JOIN groups gg on GG.TABLEID=E.GROUPID;



 select tableid,ComValue,to_char(fromdate,'DD-MON-YYYY'),to_char(todate,'DD-MON-YYYY') ,factorbefore,factoafter,comCurrency,comtypes from comissions order by tableid;
 
select SEQCOMISSION.currval from dual;
select SEQCOMISSION.currval from dual;


select COURSEname,stdname,P.PAYDATE,J.COMVALUE,P.PAID,(c.courseprice*comvalue)/100
from payroll p JOIN COURSES c on C.COURSEID=P.COURSEID
JOIN comissions j on j.tableid=P.PCT
JOIN students f3 on F3.STDID=P.STDID WHERE P.PAYDATE BETWEEN TO_DATE('1-Jan-2015','DD-MON-YYYY') and last_day('1-Jan-2017');

SELECT last_day('1-Jan-2016') from dual;



select sum(c.courseprice*comvalue)/100 
from payroll p JOIN COURSES c on C.COURSEID=P.COURSEID
JOIN comissions j on j.tableid=P.PCT
JOIN students f3 on F3.STDID=P.STDID; 

 
select to_char(A.STARTTIME,'HH:MI AM') starts,to_char(A.ENDTIME,'HH:MI AM') ends
, CASE (A.LECTUREDAY) WHEN 1 then'Sunday' WHEN 2 then'Monday' WHEN 3 then'Tuesday' WHEN 4 then'Wednesday' WHEN 5 then'Thursday' WHEN 6 then'Friday' WHEN 7 then'Saturday'  END lecday
,g.groupID,c.coursename,employeename,R.ROOMFLOOR||'0'||R.ROMMSEQ from APPOINTMENT a 
JOIN GROUPS g on A.GROUP_ID=G.TABLEID
JOIN COURSES c on C.COURSEID=G.COURSEID
JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=C.COURSEINSTRUCTOR
JOIN ROOMS r on R.TABLEID=G.ROOMID
WHERE G.ROOMID=(select tableid from rooms where ROOMFLOOR||'0'||ROMMSEQ='102' AND ROOMS.BRANCHID=(SELECT centerid from CENTERBRANCH where CENTERBRANCH.CENTERNAME='sand') ) and A.LECTUREDAY=3;


select case (LECTUREDAY) WHEN 1 THEN 'Sunday'  WHEN 2 THEN 'Monday' WHEN 3 THEN 'Tuesday'  WHEN 4 THEN 'Wednesday' WHEN 5 THEN 'Thursday' WHEN 6 THEN 'Friday' WHEN 7 THEN 'Saturday' end ||' - '|| to_char(STARTTIME,'HH:MI AM')||' To '||to_char(ENDTIME,'HH:MI AM') from APPOINTMENT where GROUP_ID=(select tableid from groups g2 where G2.GROUPID=2 and G2.COURSEID=(select courseid from COURSES where coursename='A0') )
;

select case (LECTUREDAY) WHEN 1 THEN 'Sunday'  WHEN 2 THEN 'Monday' WHEN 3 THEN 'Tuesday'  WHEN 4 THEN 'Wednesday' WHEN 5 THEN 'Thursday' WHEN 6 THEN 'Friday' WHEN 7 THEN 'Saturday' end ||' - '|| to_char(STARTTIME,'HH:MI AM')||' To '||to_char(ENDTIME,'HH:MI AM') 
from APPOINTMENT where GROUP_ID=(select tableid from groups g2 where G2.GROUPID=Group Number and G2.COURSEID=(select courseid from COURSES where coursename='A0') );

begin 
insert into groups values (
      SEQgroup.nextval,
      (select ( count(*)+1) from groups where courseid =(select courseid from courses where coursename ='A0' )) ,
      (select courseid from courses where coursename ='A0'),
      (select TableID from rooms where roomfloor||'0'||rommseq='102'),
      1,
      (select nvl(enddate,sysdate) from courses where coursename = 'A0'  ));
      
      insert into appointment values (
      SEQappointment.nextval ,
      SEQgroup.CURRVAL ,
      2,
      to_timestamp('1-DEC-2016 1:0 AM' ,'DD-MON-YYYY hh:MI AM'),
      to_timestamp('1-DEC-2016 2:0 AM' ,'DD-MON-YYYY hh:MI AM') );
      
      insert into appointment values (
      SEQappointment.nextval , 
      SEQgroup.CURRVAL ,2,
      to_timestamp('1-DEC-2016 1:0 AM' ,'DD-MON-YYYY hh:MI AM'),
      to_timestamp('1-DEC-2016 2:0 AM' ,'DD-MON-YYYY hh:MI AM') );
      ROLLBACK;
      end;

select to_char(starttime,'HH:MI AM') , to_char(endtime,'HH:MI AM') from APPOINTMENT WHERE LECTUREDAY=3;



 BEGIN
 insert into APPOINTMENT
  (MAINID,GROUP_ID,LECTUREDAY,STARTTIME,ENDTIME)
  values
  (4747,5,3,
  to_timestamp('1-DEC-2016 06:20 PM' ,'DD-MON-YYYY hh:MI AM'),
  to_timestamp('1-DEC-2016 01:00 PM' ,'DD-MON-YYYY hh:MI AM'));
  ROLLBACK;
  
  insert into APPOINTMENT
  (MAINID,GROUP_ID,LECTUREDAY,STARTTIME,ENDTIME)
  values
  (4747,5,3,
  to_timestamp('1-DEC-2016 06:00 PM' ,'DD-MON-YYYY hh:MI AM'),
  to_timestamp('1-DEC-2016 09:00 Pm' ,'DD-MON-YYYY hh:MI AM'));
  ROLLBACK;
 end;
  
  
create OR REPLACE TRIGGER priv  BEFORE insert on users
  DECLARE
  iidd NUMBER ;
  BEGIN 
  --iidd:=:old.validations.USER_ID;
  insert into validations values(:old.USER_ID,'Students.Students','0','0','0','0','0');
  /*insert into validations values(:new.validations.USER_ID,'employees.employees','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID,'Departments.Department','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID,'Centers.Center','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Courses.Course','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Login_USER.AddUser','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Login_USER.EditeUser','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Attendances.Attendance','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Dashboard.ParentDash','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Exams.Exams','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Exams.ExamsDetail','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Branchs.Branch','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Groups.Group','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Registers.Regester','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'CenterComission.Comissions','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'Privilage','0','0','0','0','0');
  insert into validations values(:new.validations.USER_ID'payroll.StudentPayment','0','0','0','0','0');
*/end;
 
 select USERNAME,FORMID,ADDING,EDITE,REMOVE,VIEWDATA,SHOWFORM     from validations v join users u on v.USER_ID=u.USER_ID  where v.USER_ID=(select USER_ID from users where USERNAME='admin') and v.FORMID='Exams.Exams';
 
 select USERNAME,
        SUBSTR(FORMID,INSTR(FORMID,'.')+1,LENGTH(FORMID)),
        ADDING,
        EDITE,
        REMOVE,
        VIEWDATA,
        SHOWFORM
  from validations v join users u on v.USER_ID=u.USER_ID  
 where v.USER_ID=(select USER_ID from users where USERNAME='admin');
 
desc user_sequences ;


SELECT SUBATTEND.TABLEID, coursename||'-'||GROUPS.groupid,stdname,lecnumber,to_char(ATTENDANCE.MONTHS,'DD-MON-YYYY'),to_char(regtime,'HH:MI AM') from
 ATTENDANCE JOIN SUBATTEND on SUBATTEND.PARENTID = ATTENDANCE.TABLEID 
 join GROUPS on GROUPS.TABLEID = ATTENDANCE.GROUPID
 JOIN COURSES   
 on GROUPS.COURSEID = COURSES.COURSEID 
 JOIN STUDENTS on SUBATTEND.ST_ID = STUDENTS.STDID 
 WHERE  TO_DATE(ATTENDANCE.months)<=TO_DATE(sysdate,'DD/MON/YYYY')  AND
  ATTENDANCE.groupid= 
                  (select tableid from groups where groupid=1 and courseid=(
                                                      select COURSES.COURSEID from  COURSES WHERE COURSES.COURSENAME='A0'))
AND to_timestamp(SUBATTEND.REGTIME)<=to_timestamp('00:00:00.01','HH24:MI:SS.ff')
;


create or replace PROCEDURE attend (crsname varchar2,groupNO number ) is
--DECLARE
lecdate date;
BEGIN
select max(months) INTO lecdate from ATTENDANCE where CLOSESTATUS='1' and GROUPID=(select tableid from groups where GROUPS.GROUPID=groupNO and GROUPS.COURSEID=(select courseid from courses where coursename=crsname)) ;

IF(to_char(lecdate,'DD-MM-YYYY') <> to_char(sysdate,'DD-MM-YYYY') or lecdate is NULL) then 
INSERT into attendance values 
(
SEQattendance.nextval,
(select tableid from groups where GROUPS.GROUPID=groupNO and GROUPS.COURSEID=(select courseid from courses where coursename=crsname)) ,
(select nvl(max(lecnumber)+1,0) from ATTENDANCE where ATTENDANCE.GROUPID=(select tableid from groups where GROUPS.GROUPID=groupNO and GROUPS.COURSEID=(select courseid from courses where coursename=crsname))),
sysdate,
'1'
);
COMMIT;
end if;
end attend;


SELECT SUBATTEND.TABLEID, coursename||'-'||GROUPS.groupid,stdname,lecnumber,to_char(ATTENDANCE.MONTHS,'DD-MON-YYYY'),to_char(regtime,'HH:MI AM') from  ATTENDANCE JOIN SUBATTEND on SUBATTEND.PARENTID = ATTENDANCE.TABLEID  join GROUPS on GROUPS.TABLEID = ATTENDANCE.GROUPID  JOIN COURSES    on GROUPS.COURSEID = COURSES.COURSEID  JOIN STUDENTS on SUBATTEND.ST_ID = STUDENTS.STDID  WHERE  TO_DATE(ATTENDANCE.months)>=TO_DATE(sysdate,'DD/MON/YYYY')  AND  ATTENDANCE.groupid=                    (select tableid from groups where groupid=1 and courseid=(                                                       select COURSES.COURSEID from  COURSES WHERE COURSES.COURSENAME='A0')) AND to_timestamp(SUBATTEND.REGTIME)>=to_timestamp('00:00:00.01','HH24:MI:SS.ff');

insert into subattend values(
  (SEQsubattend.nextval),
  (select attendance.tableID from ATTENDANCE where MONTHS =TO_DATE(sysdate,'DD-MON-YYYY') AND GROUPID = (select TABLEID from GROUPS where courseid=(select courseid from courses where lower(coursename) ='a0') AND GROUPS.GROUPID=2)),
  (select stdid from students where lower(stdname)='kareem mostf'),
  (sysdate));

select * from ATTENDANCE ;

select attendance.tableID from ATTENDANCE 
where to_char(MONTHS,'DD-MON-YYYY') = to_char(sysdate,'DD-MON-YYYY') AND
     GROUPID = 20;


select count(*)+1 from ATTENDANCE
where CLOSESTATUS='0' and 
groupid=(select tableid from GROUPS where GROUPS.GROUPID=2 and courseid =(select courseid from courses where coursename ='A0'));

select nvl(LECNUMBER,0)+1 from ATTENDANCE 
where CLOSESTATUS=0 and 
TO_char(months)=(select to_char(max(months))from attendance where CLOSESTATUS=0) and groupid=(select tableid from GROUPS where GROUPS.GROUPID=1 and courseid =(select courseid from courses where coursename ='A0'));


select cb.centername ,to_char(A.STARTTIME,'HH:MI AM') starts,to_char(A.ENDTIME,'HH:MI AM') ends
, CASE (A.LECTUREDAY) WHEN 1 then'Sunday' WHEN 2 then'Monday' WHEN 3 then'Tuesday' WHEN 4 then'Wednesday' WHEN 5 then'Thursday' WHEN 6 then'Friday' WHEN 7 then'Saturday'  END lecday
,g.groupID,c.coursename,employeename,R.ROOMFLOOR||'0'||R.ROMMSEQ from APPOINTMENT a 
JOIN GROUPS g on A.GROUP_ID=G.TABLEID
JOIN COURSES c on C.COURSEID=G.COURSEID
JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=C.COURSEINSTRUCTOR
JOIN ROOMS r on R.TABLEID=G.ROOMID
join centerbranch cb on cb.centerid=r.branchid
WHERE G.ROOMID=(select tableid from rooms where ROOMFLOOR||'0'||ROMMSEQ= '102' AND ROOMS.BRANCHID=(SELECT centerid from CENTERBRANCH where CENTERBRANCH.CENTERNAME='sand10') ) and A.LECTUREDAY=3
;


CREATE or REPLACE TRIGGER update_automatic AFTER logon on schema 
begin
--Courses
UPDATE courses set coursestatus='1' where enddate<sysdate and coursestatus<>'1';
--attendace
update attendance set closestatus=0 where months <Sysdate and closestatus<>0;
COMMIT;
end;


begin 

delete from appointment where group_ID=20;

update groups set 
  courseid=(select courseid from courses where coursename ='A0'),
  roomID=(select TableID from rooms where roomfloor||'0'||rommseq='101' and rooms.branchid=1  ),
  per=1 
where groups.TableID=20;

insert into appointment values (
  SEQappointment.nextval ,
  (select tableid from groups where groupid=2  and courseid=(select courseid from courses where coursename='A0' )),
  6,
  to_timestamp('6:19 AM' ,'hh:MI AM'),
  to_timestamp('7:19 AM' ,'hh:MI AM') 
  );      
end;


select  cb.centername ,
        to_char(A.STARTTIME,'HH:MI AM') starts,
        to_char(A.ENDTIME,'HH:MI AM') ends, 
        CASE (A.LECTUREDAY) WHEN 1 then'Sunday' WHEN 2 then'Monday' WHEN 3 then'Tuesday' WHEN 4 then'Wednesday' WHEN 5 then'Thursday' WHEN 6 then'Friday' WHEN 7 then'Saturday'  END lecday,
        g.groupID,
        c.coursename,
        employeename
        
from APPOINTMENT a 
JOIN GROUPS g on A.GROUP_ID=G.TABLEID
JOIN COURSES c on C.COURSEID=G.COURSEID
JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=C.COURSEINSTRUCTOR
JOIN ROOMS r on R.TABLEID=G.ROOMID
join centerbranch cb on cb.centerid=r.branchid
WHERE G.ROOMID=(select tableid from rooms where ROOMFLOOR||'0'||ROMMSEQ='102' AND ROOMS.BRANCHID=(SELECT centerid from CENTERBRANCH where CENTERBRANCH.CENTERNAME='sand10') ) and A.LECTUREDAY=3;


DECLARE
t1 timestamp;
t2 timestamp;
output varchar(254):='';
lec varchar2(30);
BEGIN

select  A.STARTTIME ,
        A.ENDTIME, 
        CASE (A.LECTUREDAY) WHEN 1 then'Sunday' WHEN 2 then'Monday' WHEN 3 then'Tuesday' WHEN 4 then'Wednesday' WHEN 5 then'Thursday' WHEN 6 then'Friday' WHEN 7 then'Saturday'  END lecday,
        c.coursename||'/'||g.groupID  into t1,t2,lec
from APPOINTMENT a 
JOIN GROUPS g on A.GROUP_ID=G.TABLEID
JOIN COURSES c on C.COURSEID=G.COURSEID
JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=C.COURSEINSTRUCTOR
JOIN ROOMS r on R.TABLEID=G.ROOMID
join centerbranch cb on cb.centerid=r.branchid
WHERE G.ROOMID=(select tableid from rooms where ROOMFLOOR||'0'||ROMMSEQ='102' AND ROOMS.BRANCHID=(SELECT centerid from CENTERBRANCH where CENTERBRANCH.CENTERNAME='sand10') ) and A.LECTUREDAY=3;

for i in t1..t2 loop
output:=output||'_';
end loop;
end;


select d.paperdegree,
       D.STDID,
       E.EXAMSDATE,
       E.MINDEGREE,
       E.MAXDEGREE,
       stdname,
       ss.coursename,
       case  WHEN d.paperdegree>=E.MINDEGREE THEN 'Passed' ELSE 'Failed' END
from EXAMDETAIL d JOIN EXAMS e on E.TABLEID = D.EXAMEPARENT
JOIN STUDENTS s on S.STDID=D.STDID
JOIN courses ss on E.COURSEID=SS.COURSEID
WHERE ss.coursename='' and E.NAMES='';

select stdid,stdname,stdyear,stdphone,CASE(stdgender) WHEN '0' THEN 'Male' WHEN '1' THEN 'Female' ELSE 'Other' END,TO_CHAR(stdbirthday,'dd-Mon-YYYY') from students 
where stdname like '%Do%' and
stdphone like '%%' and
stdgender like'_'and 
email like '%%' and 
stdyear like '%%' ;


select EMPLOYEEID,
        employeename ,
        employeeemail,
        employeephone ,
        employeesalary||' EGP',
        departmentname,
        TO_char(sysdate,'YYYY')-TO_char(EMPLOYEEBIRTHDAY,'YYYY')||' Years Old',
        TO_char(sysdate,'YYYY')-TO_char(EMPLOYEEHIREDATE,'YYYY')||' Year(s)',
        case (gender) WHEN '1' THEN 'Male' WHEN '0' THEN 'Female' END
        from EMPLOYEES join departments on departments.DEPARTMENTID=EMPLOYEES.EMPLOYEEDEPARTMENT 
where lower(employeename)like'%as%' and 
employeephone like'%%' or departmentname like'%Instructor%' 
order by employeename ASC;

select p.tableid ,to_char(p.paydate,'DD/MON/YYYY'),s.stdyear,s.stdname,c.coursename,c.code,com.comvalue from payroll p JOIN students s on S.STDID=P.STDID JOIN COMISSIONS com on COM.TABLEID=P.PCT FULL JOIN GROUPS g on G.TABLEID =P.COURSEID FULL JOIN groups gg on GG.TABLEID=G.GROUPID JOIN courses c on C.COURSEID=P.COURSEID WHERE P.PAYDATE BETWEEN to_date('10/04/2010','dd/mm/yyyy') and to_date('10/04/2009','dd/mm/yyyy');


SELECT stdyear,stdname,stdphone,EMAIL,case(stdgender)WHEN'0'THEN'Male'ELSE 'Female' end f,
to_char(STDBIRTHDAY,'DD/Mon/YYYY'),
to_number(to_char(Sysdate,'YYYY')) -to_number(to_char(STDBIRTHDAY,'YYYY')) bi,stdimage
FROM STUDENTS
where to_number(to_char(Sysdate,'YYYY')) -to_number(to_char(STDBIRTHDAY,'YYYY')) between 10 and  100
ORDER by STDNAME,STDGENDER;

drop type t_nested_table;

create or replace type t_col as object (
  seq number,
  Coursename varchar2(90),
  insname varchar2(50),
  GroupNO varchar2(15),
  RoomNO varchar2(15),
  Per varchar2(40),
  dayName varchar2(15),
  StartTimes varchar2(25),
  endTimes varchar2(25)
);

create or replace type t_nested_table as table of t_col;

create or replace function groups_Appointment return t_nested_table as
  v_ret   t_nested_table;
  seq number;
  Coursename varchar2(90);
  GroupNO varchar2(15);
  RoomNO varchar2(15);
  Pers varchar2(40);
  dayName varchar2(15);
  StartTimes varchar2(25);
  endTimes varchar2(25);
  CURSOR GROUPS_Parent IS select GROUPS.TableID, coursename , to_char(groupID), roomfloor||'0'||rommseq,    case(per) when 0 then 'Every Week' else 'Every Month' end from COURSES JOIN   GROUPS ON GROUPS.COURSEID = COURSES.COURSEID JOIN ROOMS on ROOMS.TABLEID = GROUPS.ROOMID;
  CURSOR GROUPS_Child(Parent_ID number) is select DAYS(lectureday),to_char(starttime,'hh:mi am'), to_char(endtime,'hh:mi am') from APPOINTMENT  where Appointment.group_ID=Parent_ID;
begin

OPEN GROUPS_Parent;
v_ret  := t_nested_table(); 

<<l1>>
loop 
  FETCH GROUPS_Parent into seq,Coursename,GroupNo,RoomNo,pers;
  v_ret.extend;
  OPEN GROUPS_Child(seq);
EXIT when GROUPS_Parent%NOTFOUND;
  <<l2>>
  loop 
    fetch GROUPS_Child into dayName,StartTimes,endTimes;
  EXIT when GROUPS_Child%NOTFOUND;
    v_ret(v_ret.count) := t_col(seq, Coursename,GroupNo,RoomNo,pers,dayName,StartTimes,endTimes);
    seq:=-1;
    Coursename:=' ';
    GroupNo:=' ';
    RoomNo:=' ';
    v_ret.extend;
  end loop l2;
close GROUPS_Child;
end loop l1;
  return v_ret;
end groups_Appointment;


SELECT * FROM table (groups_Appointment);
SELECT seq,coursename,groupno,roomno,per,dayname,starttimes,endtimes FROM table (groups_Appointment);


delete from GROUPS where tableid=20;

select factorbefore from comissions where tableid=(select max(tableid) from comissions);

SELECT * FROM students;

SELECT stdyear,stdname,stdphone,EMAIL,case(stdgender)WHEN'0'THEN'Male'ELSE 'Female' end f,
to_char(STDBIRTHDAY,'DD/Mon/YYYY'),
to_number(to_char(Sysdate,'YYYY')) -to_number(to_char(STDBIRTHDAY,'YYYY')) bi,stdimage
FROM STUDENTS
where stdyear between '0' and '7' 
ORDER by STDNAME,STDGENDER;

select COURSES.code,
       coursename,
       EMPLOYEES.EMPLOYEEID,
       employeename
      ,F.H
from COURSES JOIN EMPLOYEES on COURSES.COURSEINSTRUCTOR=EMPLOYEES.EMPLOYEEID
,(select count(g5.tableid) h from groups g5 join courses c5 on g5.courseid=c5.courseid   ) f
 WHERE F.COURSEID=COURSES.COURSEID and COURSES.COURSEBLOCKED='0'and NVL(ENDDATE,sysdate)>=sysdate;

DECLARE
 opengroup varchar2(10);
begin
select count(tableid) into opengroup  from groups  where COURSEID=16  GROUP BY GROUPs.COURSEID;
end;


create or replace function courseWithInstructor return t1_nested_table as
  v1_ret   t1_nested_table;
  Coursecode varchar2(90);
  coursename varchar2(15);
  inscode varchar2(15);
  insname varchar2(40);
  opengroup varchar2(15);
  courseid_ VARCHAR2(20); 
  CURSOR course_ IS select courseid,COURSES.code,coursename,EMPLOYEES.EMPLOYEEID,employeename from COURSES JOIN EMPLOYEES on COURSES.COURSEINSTRUCTOR=EMPLOYEES.EMPLOYEEID where COURSES.COURSEBLOCKED='0'and NVL(ENDDATE,sysdate)>=sysdate;
begin
OPEN course_;
v1_ret  := t1_nested_table(); 
loop 
  FETCH course_ into courseid_,Coursecode,coursename,inscode,insname; 
EXIT when course_%NOTFOUND;
v1_ret.extend;
           begin
              select count(tableid) into opengroup  from groups  where COURSEID=courseid_  GROUP BY GROUPs.COURSEID;
              if SQL%ROwCount =1 then
              v1_ret(v1_ret.count) := t1_col(Coursecode, coursename,inscode,insname,opengroup);
              end if;
          EXCEPTION when NO_DATA_FOUND then 
              v1_ret(v1_ret.count) := t1_col(Coursecode, coursename,inscode,insname,'0');
          end;
end loop ;
  return v1_ret;
end courseWithInstructor;


select* from TABLE(courseWithInstructor);

select lecnumber from attendance 
where  groupid=(select tableid from groups where to_char(groupid)='Group Number...' and courseid=(select courseid from courses where coursename ='Course Name...'));


select cb.centername ,to_char(A.STARTTIME,'HH:MI AM') starts,to_char(A.ENDTIME,'HH:MI AM') ends
, Days (A.LECTUREDAY) lecday
,g.groupID,c.coursename,employeename,R.ROOMFLOOR||'0'||R.ROMMSEQ from APPOINTMENT a 
JOIN GROUPS g on A.GROUP_ID=G.TABLEID
JOIN COURSES c on C.COURSEID=G.COURSEID
JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=C.COURSEINSTRUCTOR
JOIN ROOMS r on R.TABLEID=G.ROOMID
join centerbranch cb on cb.centerid=r.branchid
WHERE G.ROOMID=(select tableid from rooms where ROOMFLOOR||'0'||ROMMSEQ= '102' AND ROOMS.BRANCHID=(SELECT centerid from CENTERBRANCH where CENTERBRANCH.CENTERNAME='sand10') ) and A.LECTUREDAY=3
order by g.groupID,starts,ends;


select 
ROWNUM,
code, 
coursename,
to_char(courseprice,'999,9')||' LE' ,
to_char(startdate,'DD/MM/YYYY'),
to_char(enddate,'DD/MM/YYYY'),
case(coursestatus) when '0'then 'Open Public'when '1' then 'Private'else 'Offer' end,
case (payment) 
WHEN '0' THEN 'One Shot' WHEN '1' THEN 'Per Session' WHEN '2' THEN 'Per Cycle' WHEN '3' THEN 'Free Profit' WHEN '4' THEN 'Full Free' END,
nvl(to_char(CYCLE),'NO')
from courses where COURSEBLOCKED='0' and NVL(ENDDATE,sysdate)>=sysdate




select courseid,
        coursename,
        NVL(courseprice,(case payment when '3'then
                          (select comvalue from comissions where tableid=(select max(tableid)from comissions) 
                           )when '4' then 0 end)
           )||' L.E', 
        case(courseblocked) when '1' then 'Blocked'
                            else 'On List' END,
        case(coursestatus) when'0' then 'Open Public' 
                           when'1' then 'Private'
                           when'2' then 'Offer' end, 
        employeename,
        to_char(startdate,'DD-MON-YYYY'), 
        NVL(to_char(COURSES.ENDDATE,'DD-MON-YYYY'),'Opened'),
        case (payment) WHEN '0' THEN 'One Time' 
                       WHEN '1' THEN 'Per Session' 
                       WHEN '2' THEN 'Per Cycle' 
                       WHEN '3' THEN 'Free + Profit '
                       WHEN '4' THEN 'Full Free' END,
                       COALESCE (to_char(COURSES.CYCLE),'NO Cycle') 
from COURSES JOIN EMPLOYEES on EMPLOYEES.EMPLOYEEID=COURSES.COURSEINSTRUCTOR
where lower(Coursename) like '%%';



select max(months)  from ATTENDANCE where CLOSESTATUS='1' and GROUPID=(select tableid from groups where GROUPS.GROUPID=1 and GROUPS.COURSEID=(select courseid from courses where coursename='A0')) ;

ALTER TABLE EMPLOYEES MODIFY (POS DEFAULT  '' );


create or replace trigger sequence_cycle after insert on attendance for each row
declare
paytype varchar2(1);
cycls number;
maxx number;
begin
select payment,cycle into paytype,cycls from courses where courseid=(select courseid from groups where tableid=:NEW.groupid);
if(paytype='2')then
  select max(attendance.cycle) into maxx from attendance where groupid=:new.groupid;
  if(maxx=cycls) then 
        update attendance set cycle=1 where tableid=:new.Tableid;
  else  update attendance set 
        ATTENDANCE.CYCLE=(select (max(cycle)+1) from attendance where groupid=:new.GROUPID) 
        where tableid=:new.Tableid;
  end if;
end if;
end ;


update attendance set 
        ATTENDANCE.CYCLE=(select max(cycle)+1 from attendance where groupid=23) 
        where tableid=5;


select max(att.cycle) from attendance att where groupid=23;


  select max(attendance.cycle) from attendance where groupid=23;


BEGIN
  attend('A2',1);
rollback; 
END;

select max(attendance.cycle)  from attendance where attendance.groupid=(select tableid from groups where GROUPS.GROUPID=1 and GROUPS.COURSEID=(select courseid from courses where coursename='A2')) ;

set serveroutput on
declare
cv number(2);
BEGIN
select attendance.cycle into cv from attendance where MONTHS=(select max(MONTHS)from ATTENDANCE where attendance.groupid=(select tableid from groups where GROUPS.GROUPID=1 and GROUPS.COURSEID=(select courseid from courses where coursename='A2'))) ;
    DBMS_OUTPUT.PUT_LINE(cv);
end;  

-------delte all rows---------
BEGIN
  FOR c IN (SELECT table_name, constraint_name FROM user_constraints WHERE constraint_type = 'R')
  LOOP
    EXECUTE IMMEDIATE ('alter table ' || c.table_name || ' disable constraint ' || c.constraint_name);
  END LOOP;
  FOR c IN (SELECT table_name FROM user_tables)
  LOOP
    EXECUTE IMMEDIATE ('truncate table ' || c.table_name);
  END LOOP;
  FOR c IN (SELECT table_name, constraint_name FROM user_constraints WHERE constraint_type = 'R')
  LOOP
    EXECUTE IMMEDIATE ('alter table ' || c.table_name || ' enable constraint ' || c.constraint_name);
  END LOOP;
END;

select count(*) from user_tables;

UPDATE validations set adding='1',edite='1',remove='1',viewdata='1',showform='1';

insert into groups values (SEQgroup.nextval,(select ( count(*)+1) from groups where courseid =(select courseid from courses where coursename ='JavaSE' )) , (select courseid from courses where coursename ='JavaSE'),(select TableID from rooms where roomfloor||'0'||rommseq='101' and BRANCHID=0),1,(select nvl(enddate,sysdate) from courses where coursename = 'JavaSE'  ));  

insert into appointment values (0 ,26 ,3,to_timestamp('1-DEC-2016 9:0 AM' ,'DD-MON-YYYY hh:MI AM'),to_timestamp('1-DEC-2016 11:0 AM' ,'DD-MON-YYYY hh:MI AM') );

insert into appointment values (SEQappointment.nextval , SEQgroup.CURRVAL ,3,to_timestamp('1-DEC-2016 9:0 AM' ,'DD-MON-YYYY hh:MI AM'),to_timestamp('1-DEC-2016 11:0 AM' ,'DD-MON-YYYY hh:MI AM') );

select* from v$session;

SELECT * FROM v$OPEN_CURSOR;
SELECT count(*) FROM v$OPEN_CURSOR where cursor_type='OPEN';


BEGIN
for n in (select SID ,SERIAL# from v$session where USERNAME ='CENTER')
loop
      begin
      execute immediate ('alter system kill session '''||n.SID||','||n.SERIAL#||''' immediate');
      Exception when others then null;
      end;
end loop;
end;

BEGIN for n in (select SID ,SERIAL# from v$session where USERNAME ='CENTER') loop begin  execute immediate ('alter system kill session '''||n.SID||','||n.SERIAL#||''' immediate');  Exception when others then null; end; end loop; end;

BEGIN for n in (select SID ,SERIAL# from v$session where USERNAME in('CENTER','CENTER2')) loop begin  execute immediate ('alter system kill session '''||n.SID||','||n.SERIAL#||''' immediate');  Exception when others then null; end; end loop; end;

select max(seq) from Attendance
























COMMIT;
ROLLBACK;