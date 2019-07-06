/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasureReportStratifier of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link code}, 
{@link stratum}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getStratum},
{@link setCode},
{@link setStratum},
 */

@Description("The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.")

public interface MeasureReportStratifier extends GenericEntity, fhir.BackboneElement {

	EntityType<MeasureReportStratifier> T = EntityTypes.T(MeasureReportStratifier.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String stratum = "stratum";

	@Description("The meaning of this stratifier, as defined in the measure definition.")
	
	java.util.List<fhir.CodeableConcept> getCode();
	void setCode(java.util.List<fhir.CodeableConcept> code);

	@Description("This element contains the results for a single stratum within the stratifier. For example, when stratifying on administrative gender, there will be four strata, one for each possible gender value.")
	
	java.util.List<fhir.MeasureReportStratum> getStratum();
	void setStratum(java.util.List<fhir.MeasureReportStratum> stratum);

}
