/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ClinicalImpressionInvestigation of the Data Model fhir.
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
{@link item}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getItem},
{@link setCode},
{@link setItem},
 */

@Description("A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called 'ClinicalImpression' rather than 'ClinicalAssessment' to avoid confusion with the recording of assessment tools such as Apgar score.")

public interface ClinicalImpressionInvestigation extends GenericEntity, fhir.BackboneElement {

	EntityType<ClinicalImpressionInvestigation> T = EntityTypes.T(ClinicalImpressionInvestigation.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String item = "item";

	@Description("A name/code for the group ('set') of investigations. Typically, this will be something like 'signs', 'symptoms', 'clinical', 'diagnostic', but the list is not constrained, and others such groups such as (exposure|family|travel|nutritional) history may be used.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("A record of a specific investigation that was undertaken.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getItem();
	void setItem(java.util.List<com.braintribe.model.generic.GenericEntity> item);

}
