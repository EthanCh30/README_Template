DROP TABLE IF EXISTS Vehicle;
DROP TABLE IF EXISTS Fleet;
DROP TABLE IF EXISTS VehicleType;
DROP TABLE IF EXISTS Depot;

-- Creation of Depot table
CREATE TABLE Depot (
    depotID INTEGER PRIMARY KEY,
    address VARCHAR(255),
    phone VARCHAR(255)
);

-- Creation of VehicleType table
CREATE TABLE VehicleType (
    typeID VARCHAR(255) PRIMARY KEY,
    make VARCHAR(255),
    model VARCHAR(255),
    doors INTEGER,
    body VARCHAR(255),
    trim VARCHAR(255)
);

-- Creation of Fleet table
CREATE TABLE Fleet (
    fleetNum INTEGER PRIMARY KEY,
    typeID VARCHAR(255),
    FOREIGN KEY (typeID) REFERENCES VehicleType(typeID)
);

-- Creation of Vehicle table
CREATE TABLE Vehicle (
    regNum VARCHAR(255) PRIMARY KEY,
    depotID INTEGER,
    fleetNum INTEGER,
    colour VARCHAR(255),
    FOREIGN KEY (depotID) REFERENCES Depot(depotID),
    FOREIGN KEY (fleetNum) REFERENCES Fleet(fleetNum)
);

-- Inserting data into Depot table
INSERT INTO Depot (depotID, address, phone) VALUES (20, 'IST Flinders 5000', '1400111111');
INSERT INTO Depot (depotID, address, phone) VALUES (30, 'Tonsley Flinders 5500', '555111444');

-- Inserting data into VehicleType table
INSERT INTO VehicleType (typeID, make, model, doors, body, trim) VALUES ('AQ51', 'Audi', 'Q5', 4, 'SUV', 'Standard');
INSERT INTO VehicleType (typeID, make, model, doors, body, trim) VALUES ('DEF003', 'Audi', 'Q3', 4, 'Small SUV', 'Sports');
INSERT INTO VehicleType (typeID, make, model, doors, body, trim) VALUES ('MCX2', 'Mazda', 'CX30', 4, 'SUV', 'Luxury');
INSERT INTO VehicleType (typeID, make, model, doors, body, trim) VALUES ('HAC3', 'Honda', 'Accord', 4, 'Sedan', 'Standard');

-- Inserting data into Fleet table
INSERT INTO Fleet (fleetNum, typeID) VALUES (100, 'AQ51');
INSERT INTO Fleet (fleetNum, typeID) VALUES (200, 'MCX2');
INSERT INTO Fleet (fleetNum, typeID) VALUES (300, 'HAC3');


-- Inserting data into Vehicle table 
INSERT INTO Vehicle (regNum, depotID, fleetNum, colour) VALUES ('ABC001', 20, 100, 'Blue'); 
INSERT INTO Vehicle (regNum, depotID, fleetNum, colour) VALUES ('DEF003', 30, 100, 'Red'); 
INSERT INTO Vehicle (regNum, depotID, fleetNum, colour) VALUES ('XYZ200', 20, 200, 'Gold'); 
INSERT INTO Vehicle (regNum, depotID, fleetNum, colour) VALUES ('WXY350', 30, 300, 'Silver');

 -- Simple queries to ensure the database works correctly 
SELECT * FROM Vehicle;
SELECT * FROM Depot; 
 -- Join Fleet and VehicleType to see fleet details 
 SELECT Fleet.fleetNum, VehicleType.make, VehicleType.model FROM Fleet JOIN VehicleType ON Fleet.typeID = VehicleType.typeID;