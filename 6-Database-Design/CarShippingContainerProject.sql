-- Car Shipping Container DataBase

-- Deliverable 5: DataBase
-- ====================
-- IYAD ALOUDAT
-- MOHAMMAD ALTAMIMI
-- SIROOS RAHIMI TAGHANAKI
-- DORIS CHAN YEW TONG-SUEN FA

/* ============ Car Shipping Container DataBase Setup ============ */
CREATE DATABASE CarShipping ;
GO
use CarShipping
GO

/* ======================= TABLES ======================== */
CREATE TABLE Client (
    clientID        Numeric(10,0)   NOT NULL IDENTITY(1000000000,1)  PRIMARY KEY,
    clientName      VARCHAR(50)     NOT NULL,
    companyName     VARCHAR(50)     NOT NULL,
    tel             Numeric(10,0)   NOT NULL,
    email           VARCHAR(50)     NOT NULL,
    exportNumber    Numeric(10,0)   NOT NULL
);
GO


CREATE TABLE LoadingReport (
    bookingNumber       Numeric(10,0)   NOT NULL  PRIMARY KEY,
    clientID            Numeric(10,0)   NOT NULL,
    bookingDate         DATE            NOT NULL,
    originCountry       VARCHAR(50)     NOT NULL,
    shippingLine        VARCHAR(50)     NOT NULL,
    terminal            VARCHAR(50)     NOT NULL,  
    destinationCountry  VARCHAR(50)     NOT NULL, 
    containerNumber     VARCHAR(50)     NOT NULL, 
    sealNumber          VARCHAR(50)     NOT NULL, 
    containerSize       INT             NOT NULL, 
    containerWeight     INT             NOT NULL,     
    shipNumber          VARCHAR(50)     NOT NULL, 
    vesselName          VARCHAR(50)     NOT NULL, 
    loadingDate         DATE            NOT NULL, 
    numberOfCars        INT             NOT NULL
);
GO

CREATE TABLE CarInfo (
    vinNumber       VARCHAR(50)     NOT NULL  PRIMARY KEY,
    bookingNumber   Numeric(10,0)   NOT NULL,
    carModel        VARCHAR(50)     NOT NULL,
    carColor        VARCHAR(50)     NOT NULL,
    carYear         INT             NOT NULL, 
    carWeight       INT             NOT NULL,     
    carPrice       DECIMAL(10, 2)  NOT NULL

);
GO


/* ======================= FOREIGN KEY : FK ======================== */

ALTER TABLE LoadingReport 
ADD CONSTRAINT FK_clientID_LoadingReport
FOREIGN KEY(clientID)
REFERENCES Client(clientID);
GO


ALTER TABLE CarInfo 
ADD CONSTRAINT FK_bookingNumber_CarInfo
FOREIGN KEY(bookingNumber)
REFERENCES LoadingReport(bookingNumber);
GO


/* ======================= Data Records ======================== */




