/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ConditionEvidence of the Data Model fhir.
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
{@link detail}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getDetail},
{@link setCode},
{@link setDetail},
 */

@Description("A clinical condition, problem, diagnosis, or other event, situation, issue, or clinical concept that has risen to a level of concern.")

public interface ConditionEvidence extends GenericEntity, fhir.BackboneElement {

	EntityType<ConditionEvidence> T = EntityTypes.T(ConditionEvidence.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String detail = "detail";

	@Description("A manifestation or symptom that led to the recording of this condition.")
	
	java.util.List<fhir.CodeableConcept> getCode();
	void setCode(java.util.List<fhir.CodeableConcept> code);

	@Description("Links to other relevant information, including pathology reports.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDetail();
	void setDetail(java.util.List<com.braintribe.model.generic.GenericEntity> detail);

}
