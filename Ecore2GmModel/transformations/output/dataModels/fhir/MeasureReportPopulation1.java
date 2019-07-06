/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MeasureReportPopulation1 of the Data Model fhir.
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
{@link subjectResults}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getSubjectResults},
{@link setCode},
{@link setSubjectResults},
 */

@Description("The MeasureReport resource contains the results of the calculation of a measure; and optionally a reference to the resources involved in that calculation.")

public interface MeasureReportPopulation1 extends GenericEntity, fhir.BackboneElement {

	EntityType<MeasureReportPopulation1> T = EntityTypes.T(MeasureReportPopulation1.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String subjectResults = "subjectResults";

	@Description("The type of the population.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("This element refers to a List of subject level MeasureReport resources, one for each subject in this population in this stratum.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubjectResults();
	void setSubjectResults(com.braintribe.model.generic.GenericEntity subjectResults);
}
