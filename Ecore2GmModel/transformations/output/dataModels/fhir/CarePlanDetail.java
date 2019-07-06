/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type CarePlanDetail of the Data Model fhir.
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
{@link reasonCode}, 
{@link reasonReference}, 
{@link goal}, 
{@link statusReason}, 
{@link scheduledTiming}, 
{@link scheduledPeriod}, 
{@link location}, 
{@link performer}, 
{@link productCodeableConcept}, 
{@link productReference}, 
{@link dailyAmount}, 
{@link quantity}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getReasonCode},
{@link getReasonReference},
{@link getGoal},
{@link getStatusReason},
{@link getScheduledTiming},
{@link getScheduledPeriod},
{@link getLocation},
{@link getPerformer},
{@link getProductCodeableConcept},
{@link getProductReference},
{@link getDailyAmount},
{@link getQuantity},
{@link setCode},
{@link setReasonCode},
{@link setReasonReference},
{@link setGoal},
{@link setStatusReason},
{@link setScheduledTiming},
{@link setScheduledPeriod},
{@link setLocation},
{@link setPerformer},
{@link setProductCodeableConcept},
{@link setProductReference},
{@link setDailyAmount},
{@link setQuantity},
 */

@Description("Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.")

public interface CarePlanDetail extends GenericEntity, fhir.BackboneElement {

	EntityType<CarePlanDetail> T = EntityTypes.T(CarePlanDetail.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String goal = "goal";
	java.lang.String statusReason = "statusReason";
	java.lang.String scheduledTiming = "scheduledTiming";
	java.lang.String scheduledPeriod = "scheduledPeriod";
	java.lang.String location = "location";
	java.lang.String performer = "performer";
	java.lang.String productCodeableConcept = "productCodeableConcept";
	java.lang.String productReference = "productReference";
	java.lang.String dailyAmount = "dailyAmount";
	java.lang.String quantity = "quantity";

	@Description("Detailed description of the type of planned activity; e.g. what lab test, what procedure, what kind of encounter.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("Provides the rationale that drove the inclusion of this particular activity as part of the plan or the reason why the activity was prohibited.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates another resource, such as the health condition(s), whose existence justifies this request and drove the inclusion of this particular activity as part of the plan.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Internal reference that identifies the goals that this activity is intended to contribute towards meeting.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getGoal();
	void setGoal(java.util.List<com.braintribe.model.generic.GenericEntity> goal);

	@Description("Provides reason why the activity isn't yet started, is on hold, was cancelled, etc.")
	@Mandatory
	fhir.CodeableConcept getStatusReason();
	void setStatusReason(fhir.CodeableConcept statusReason);
	@Description("")
	@Mandatory
	fhir.Timing getScheduledTiming();
	void setScheduledTiming(fhir.Timing scheduledTiming);
	@Description("")
	@Mandatory
	fhir.Period getScheduledPeriod();
	void setScheduledPeriod(fhir.Period scheduledPeriod);
	@Description("Identifies the facility where the activity will occur; e.g. home, hospital, specific clinic, etc.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getLocation();
	void setLocation(com.braintribe.model.generic.GenericEntity location);
	@Description("Identifies who's expected to be involved in the activity.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPerformer();
	void setPerformer(java.util.List<com.braintribe.model.generic.GenericEntity> performer);

	@Description("")
	@Mandatory
	fhir.CodeableConcept getProductCodeableConcept();
	void setProductCodeableConcept(fhir.CodeableConcept productCodeableConcept);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getProductReference();
	void setProductReference(com.braintribe.model.generic.GenericEntity productReference);
	@Description("Identifies the quantity expected to be consumed in a given day.")
	@Mandatory
	fhir.Quantity getDailyAmount();
	void setDailyAmount(fhir.Quantity dailyAmount);
	@Description("Identifies the quantity expected to be supplied, administered or consumed by the subject.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
}
