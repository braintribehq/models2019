/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Enumeration Type MessageValidationLevel.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/


package iso20022;

import com.braintribe.model.generic.annotation.*;


public enum MessageValidationLevel {

	NO_VALIDATION, // NO_VALIDATION
	SYNTAX_VALID, // SYNTAX_VALID
	SCHEMA_VALID, // SCHEMA_VALID
	MESSAGE_VALID, // MESSAGE_VALID
	RULE_VALID, // RULE_VALID
	MARKET_PRACTICE_VALID, // MARKET_PRACTICE_VALID
	BUSINESS_PROCESS_VALID, // BUSINESS_PROCESS_VALID
	COMPLETELY_VALID; // COMPLETELY_VALID
}


