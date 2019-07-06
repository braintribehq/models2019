/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PlanDefinitionTarget of the Data Model fhir.
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
{@link due}, 

* It provides of then following operations (getters and setters)
{@link getMeasure},
{@link getDetailQuantity},
{@link getDetailRange},
{@link getDetailCodeableConcept},
{@link getDue},
{@link setMeasure},
{@link setDetailQuantity},
{@link setDetailRange},
{@link setDetailCodeableConcept},
{@link setDue},
 */

@Description("This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.")

public interface PlanDefinitionTarget extends GenericEntity, fhir.BackboneElement {

	EntityType<PlanDefinitionTarget> T = EntityTypes.T(PlanDefinitionTarget.class);

	/* Constants for each property name. */
	java.lang.String measure = "measure";
	java.lang.String detailQuantity = "detailQuantity";
	java.lang.String detailRange = "detailRange";
	java.lang.String detailCodeableConcept = "detailCodeableConcept";
	java.lang.String due = "due";

	@Description("The parameter whose value is to be tracked, e.g. body weight, blood pressure, or hemoglobin A1c level.")
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
	@Description("Indicates the timeframe after the start of the goal in which the goal should be met.")
	@Mandatory
	fhir.Duration getDue();
	void setDue(fhir.Duration due);
}
