/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Enumeration Type EventTiming.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/


package fhir;

import com.braintribe.model.generic.annotation.*;


public enum EventTiming {

	MORN, // MORN
	MORNEARLY, // MORN.early
	MORNLATE, // MORN.late
	NOON, // NOON
	AFT, // AFT
	AFTEARLY, // AFT.early
	AFTLATE, // AFT.late
	EVE, // EVE
	EVEEARLY, // EVE.early
	EVELATE, // EVE.late
	NIGHT, // NIGHT
	PHS, // PHS
	HS, // HS
	WAKE, // WAKE
	C, // C
	CM, // CM
	CD, // CD
	CV, // CV
	AC, // AC
	ACM, // ACM
	ACD, // ACD
	ACV, // ACV
	PC, // PC
	PCM, // PCM
	PCD, // PCD
	PCV; // PCV
}


