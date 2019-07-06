/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type GoalTarget of the Data Model fhir.
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
{@link measure}, 
{@link detailQuantity}, 
{@link detailRange}, 
{@link detailCodeableConcept}, 
{@link detailRatio}, 
{@link dueDuration}, 

* It provides of then following operations (getters and setters)
{@link getMeasure},
{@link getDetailQuantity},
{@link getDetailRange},
{@link getDetailCodeableConcept},
{@link getDetailRatio},
{@link getDueDuration},
{@link setMeasure},
{@link setDetailQuantity},
{@link setDetailRange},
{@link setDetailCodeableConcept},
{@link setDetailRatio},
{@link setDueDuration},
 */

@Description("Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.")

public interface GoalTarget extends GenericEntity, fhir.BackboneElement {

	EntityType<GoalTarget> T = EntityTypes.T(GoalTarget.class);

	/* Constants for each property name. */
	java.lang.String measure = "measure";
	java.lang.String detailQuantity = "detailQuantity";
	java.lang.String detailRange = "detailRange";
	java.lang.String detailCodeableConcept = "detailCodeableConcept";
	java.lang.String detailRatio = "detailRatio";
	java.lang.String dueDuration = "dueDuration";

	@Description("The parameter whose value is being tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.")
	@Mandatory
	fhir.CodeableConcept getMeasure();
	void setMeasure(fhir.CodeableConcept measure);
	@Description("")
	@Mandatory
	fhir.Quantity getDetailQuantity();
	void setDetailQuantity(fhir.Quantity detailQuantity);
	@Description("")
	@Mandatory
	fhir.Range getDetailRange();
	void setDetailRange(fhir.Range detailRange);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getDetailCodeableConcept();
	void setDetailCodeableConcept(fhir.CodeableConcept detailCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Ratio getDetailRatio();
	void setDetailRatio(fhir.Ratio detailRatio);
	@Description("")
	@Mandatory
	fhir.Duration getDueDuration();
	void setDueDuration(fhir.Duration dueDuration);
}
