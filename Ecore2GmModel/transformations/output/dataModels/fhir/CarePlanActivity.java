/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CarePlanActivity of the Data Model fhir.
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
{@link outcomeCodeableConcept}, 
{@link outcomeReference}, 
{@link progress}, 
{@link reference}, 
{@link detail}, 

* It provides of then following operations (getters and setters)
{@link getOutcomeCodeableConcept},
{@link getOutcomeReference},
{@link getProgress},
{@link getReference},
{@link getDetail},
{@link setOutcomeCodeableConcept},
{@link setOutcomeReference},
{@link setProgress},
{@link setReference},
{@link setDetail},
 */

@Description("Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.")

public interface CarePlanActivity extends GenericEntity, fhir.BackboneElement {

	EntityType<CarePlanActivity> T = EntityTypes.T(CarePlanActivity.class);

	/* Constants for each property name. */
	java.lang.String outcomeCodeableConcept = "outcomeCodeableConcept";
	java.lang.String outcomeReference = "outcomeReference";
	java.lang.String progress = "progress";
	java.lang.String reference = "reference";
	java.lang.String detail = "detail";

	@Description("Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not).")
	
	java.util.List<fhir.CodeableConcept> getOutcomeCodeableConcept();
	void setOutcomeCodeableConcept(java.util.List<fhir.CodeableConcept> outcomeCodeableConcept);

	@Description("Details of the outcome or action resulting from the activity.  The reference to an 'event' resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a ?request? resource).")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getOutcomeReference();
	void setOutcomeReference(java.util.List<com.braintribe.model.generic.GenericEntity> outcomeReference);

	@Description("Notes about the adherence/status/progress of the activity.")
	
	java.util.List<fhir.Annotation> getProgress();
	void setProgress(java.util.List<fhir.Annotation> progress);

	@Description("The details of the proposed activity represented in a specific resource.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getReference();
	void setReference(com.braintribe.model.generic.GenericEntity reference);
	@Description("A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc.")
	@Mandatory
	fhir.CarePlanDetail getDetail();
	void setDetail(fhir.CarePlanDetail detail);
}
