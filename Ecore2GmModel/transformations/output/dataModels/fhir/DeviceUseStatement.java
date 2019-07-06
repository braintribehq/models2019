/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type DeviceUseStatement of the Data Model fhir.
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
{@link identifier}, 
{@link basedOn}, 
{@link subject}, 
{@link derivedFrom}, 
{@link timingTiming}, 
{@link timingPeriod}, 
{@link source}, 
{@link device}, 
{@link reasonCode}, 
{@link reasonReference}, 
{@link bodySite}, 
{@link note}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getSubject},
{@link getDerivedFrom},
{@link getTimingTiming},
{@link getTimingPeriod},
{@link getSource},
{@link getDevice},
{@link getReasonCode},
{@link getReasonReference},
{@link getBodySite},
{@link getNote},
{@link setIdentifier},
{@link setBasedOn},
{@link setSubject},
{@link setDerivedFrom},
{@link setTimingTiming},
{@link setTimingPeriod},
{@link setSource},
{@link setDevice},
{@link setReasonCode},
{@link setReasonReference},
{@link setBodySite},
{@link setNote},
 */

@Description("A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.If the element is present, it must have either a @value, an @id, or extensions")

public interface DeviceUseStatement extends GenericEntity, fhir.FhirDomainResource {

	EntityType<DeviceUseStatement> T = EntityTypes.T(DeviceUseStatement.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String subject = "subject";
	java.lang.String derivedFrom = "derivedFrom";
	java.lang.String timingTiming = "timingTiming";
	java.lang.String timingPeriod = "timingPeriod";
	java.lang.String source = "source";
	java.lang.String device = "device";
	java.lang.String reasonCode = "reasonCode";
	java.lang.String reasonReference = "reasonReference";
	java.lang.String bodySite = "bodySite";
	java.lang.String note = "note";

	@Description("An external identifier for this statement such as an IRI.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A plan, proposal or order that is fulfilled in whole or in part by this DeviceUseStatement.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("The patient who used the device.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("Allows linking the DeviceUseStatement to the underlying Request, or to other information that supports or is used to derive the DeviceUseStatement.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDerivedFrom();
	void setDerivedFrom(java.util.List<com.braintribe.model.generic.GenericEntity> derivedFrom);

	@Description("")
	@Mandatory
	fhir.Timing getTimingTiming();
	void setTimingTiming(fhir.Timing timingTiming);
	@Description("")
	@Mandatory
	fhir.Period getTimingPeriod();
	void setTimingPeriod(fhir.Period timingPeriod);
	@Description("Who reported the device was being used by the patient.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSource();
	void setSource(com.braintribe.model.generic.GenericEntity source);
	@Description("The details of the device used.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDevice();
	void setDevice(com.braintribe.model.generic.GenericEntity device);
	@Description("Reason or justification for the use of the device.")
	
	java.util.List<fhir.CodeableConcept> getReasonCode();
	void setReasonCode(java.util.List<fhir.CodeableConcept> reasonCode);

	@Description("Indicates another resource whose existence justifies this DeviceUseStatement.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getReasonReference();
	void setReasonReference(java.util.List<com.braintribe.model.generic.GenericEntity> reasonReference);

	@Description("Indicates the anotomic location on the subject's body where the device was used ( i.e. the target).")
	@Mandatory
	fhir.CodeableConcept getBodySite();
	void setBodySite(fhir.CodeableConcept bodySite);
	@Description("Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

}
