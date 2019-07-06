/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type SpecimenCollection of the Data Model fhir.
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
{@link collector}, 
{@link collectedPeriod}, 
{@link duration}, 
{@link quantity}, 
{@link method}, 
{@link bodySite}, 
{@link fastingStatusCodeableConcept}, 
{@link fastingStatusDuration}, 

* It provides of then following operations (getters and setters)
{@link getCollector},
{@link getCollectedPeriod},
{@link getDuration},
{@link getQuantity},
{@link getMethod},
{@link getBodySite},
{@link getFastingStatusCodeableConcept},
{@link getFastingStatusDuration},
{@link setCollector},
{@link setCollectedPeriod},
{@link setDuration},
{@link setQuantity},
{@link setMethod},
{@link setBodySite},
{@link setFastingStatusCodeableConcept},
{@link setFastingStatusDuration},
 */

@Description("A sample to be used for analysis.")

public interface SpecimenCollection extends GenericEntity, fhir.BackboneElement {

	EntityType<SpecimenCollection> T = EntityTypes.T(SpecimenCollection.class);

	/* Constants for each property name. */
	java.lang.String collector = "collector";
	java.lang.String collectedPeriod = "collectedPeriod";
	java.lang.String duration = "duration";
	java.lang.String quantity = "quantity";
	java.lang.String method = "method";
	java.lang.String bodySite = "bodySite";
	java.lang.String fastingStatusCodeableConcept = "fastingStatusCodeableConcept";
	java.lang.String fastingStatusDuration = "fastingStatusDuration";

	@Description("Person who collected the specimen.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getCollector();
	void setCollector(com.braintribe.model.generic.GenericEntity collector);
	@Description("")
	@Mandatory
	fhir.Period getCollectedPeriod();
	void setCollectedPeriod(fhir.Period collectedPeriod);
	@Description("The span of time over which the collection of a specimen occurred.")
	@Mandatory
	fhir.Duration getDuration();
	void setDuration(fhir.Duration duration);
	@Description("The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.")
	@Mandatory
	fhir.Quantity getQuantity();
	void setQuantity(fhir.Quantity quantity);
	@Description("A coded value specifying the technique that is used to perform the procedure.")
	@Mandatory
	fhir.CodeableConcept getMethod();
	void setMethod(fhir.CodeableConcept method);
	@Description("Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.")
	@Mandatory
	fhir.CodeableConcept getBodySite();
	void setBodySite(fhir.CodeableConcept bodySite);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getFastingStatusCodeableConcept();
	void setFastingStatusCodeableConcept(fhir.CodeableConcept fastingStatusCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Duration getFastingStatusDuration();
	void setFastingStatusDuration(fhir.Duration fastingStatusDuration);
}
