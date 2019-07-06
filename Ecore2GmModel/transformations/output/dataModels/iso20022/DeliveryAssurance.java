/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Enumeration Type DeliveryAssurance.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/


package iso20022;

import com.braintribe.model.generic.annotation.*;


public enum DeliveryAssurance {

	AT_LEAST_ONCE, // AT_LEAST_ONCE
	EXACTLY_ONCE, // EXACTLY_ONCE
	AT_MOST_ONCE; // AT_MOST_ONCE
}


