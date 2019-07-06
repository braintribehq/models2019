/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Enumeration Type ResearchSubjectStatus.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/


package fhir;

import com.braintribe.model.generic.annotation.*;


public enum ResearchSubjectStatus {

	CANDIDATE, // candidate
	ELIGIBLE, // eligible
	FOLLOWUP, // follow-up
	INELIGIBLE, // ineligible
	NOTREGISTERED, // not-registered
	OFFSTUDY, // off-study
	ONSTUDY, // on-study
	ONSTUDYINTERVENTION, // on-study-intervention
	ONSTUDYOBSERVATION, // on-study-observation
	PENDINGONSTUDY, // pending-on-study
	POTENTIALCANDIDATE, // potential-candidate
	SCREENING, // screening
	WITHDRAWN; // withdrawn
}


