/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasureReportComponent of the Data Model fhir.
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
{@link value}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getValue},
{@link setCode},
{@link setValue},
 */

@Description("The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.")

public interface MeasureReportComponent extends GenericEntity, fhir.BackboneElement {

	EntityType<MeasureReportComponent> T = EntityTypes.T(MeasureReportComponent.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String value = "value";

	@Description("The code for the stratum component value.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The stratum component value.")
	@Mandatory
	fhir.CodeableConcept getValue();
	void setValue(fhir.CodeableConcept value);
}
