# MyBatis DB연결 세팅

### 설정방법
- MyBatisConfig 파일 필요
- resources/mapper/*.xml 파일 필요
- Users 엔티티 필요
- UsersDao 인터페이스 생성 필요

### MariaDB 사용자 생성 및 권한 주기
```sql
CREATE USER 'green'@'%' IDENTIFIED BY 'green1234';
CREATE DATABASE greendb;
GRANT ALL PRIVILEGES ON greendb.* TO 'green'@'%';
```

### 테이블 생성
```sql
USE greendb;

create TABLE stardium(
    id int primary KEY AUTO_INCREMENT,
    name VARCHAR(100) UNIQUE,
    bulid DATE UNIQUE,
    createDate TIMESTAMP
);

create TABLE team(
    id int primary KEY AUTO_INCREMENT,
    stardiumId VARCHAR(100),
    teambulId DATE UNIQUE,
    name VARCHAR(100) UNIQUE,
    createDate TIMESTAMP
);

create TABLE player(
    id int primary KEY AUTO_INCREMENT,
    teamId INT,
    name VARCHAR(100) UNIQUE,
    POSITION VARCHAR(100), 
    createDate TIMESTAMP
);

create TABLE expulsion(
    id int primary KEY AUTO_INCREMENT,
    reason VARCHAR(100),
    playername VARCHAR(50),
    playerId INT,
    name VARCHAR(100) UNIQUE,
    createDate TIMESTAMP
);
```

### 더미데이터 추가
```sql
INSERT into stardium(name,bulid,createDate) VALUES('사직야구장','1985-10-14',now());
INSERT into stardium(name,bulid,createDate) VALUES('창원nc파크','2019-03-18',NOW());
INSERT into stardium(name,bulid,createDate) VALUES('잠실야구장','1982-07-15',now());

INSERT into team(stardiumId,teambulid,name,createDate) VALUES('1','1985-01-15','두산',NOW());
INSERT into team(stardiumId,teambulid,name,createDate) VALUES('2','2021-03-31','NC',now());
INSERT into team(stardiumId,teambulid,name,createDate) VALUES('3','1982-02-12','롯데',now());

INSERT into player(teamId,name,POSITION,createDate) VALUES('1','김민재','타자',now());
INSERT into player(teamId,name,POSITION,createDate) VALUES('1','채지선','투수',now());
INSERT into player(teamId,name,POSITION,createDate) VALUES('1','알칸타라','외야수',now());


INSERT into player(teamId,name,POSITION,createDate) VALUES('2','손민한','타자',now());
INSERT into player(teamId,name,POSITION,createDate) VALUES('2','루친스키','투수',now());
INSERT into player(teamId,name,POSITION,createDate) VALUES('2','박석민','내야수',now());


INSERT into player(teamId,name,POSITION,createDate) VALUES('3','오윤석','타자',now());
INSERT into player(teamId,name,POSITION,createDate) VALUES('3','박세웅','투수',now());
INSERT into player(teamId,name,POSITION,createDate) VALUES('3','오태근','내야수',NOW());
COMMIT;
```