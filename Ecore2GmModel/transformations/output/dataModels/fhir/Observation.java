/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Observation of the Data Model fhir.
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
{@link partOf}, 
{@link category}, 
{@link code}, 
{@link subject}, 
{@link focus}, 
{@link encounter}, 
{@link effectivePeriod}, 
{@link effectiveTiming}, 
{@link performer}, 
{@link valueQuantity}, 
{@link valueCodeableConcept}, 
{@link valueRange}, 
{@link valueRatio}, 
{@link valueSampledData}, 
{@link valuePeriod}, 
{@link dataAbsentReason}, 
{@link interpretation}, 
{@link note}, 
{@link bodySite}, 
{@link method}, 
{@link specimen}, 
{@link device}, 
{@link referenceRange}, 
{@link hasMember}, 
{@link derivedFrom}, 
{@link component}, 

* It provides of then following operations (getters and setters)
{@link getIdentifier},
{@link getBasedOn},
{@link getPartOf},
{@link getCategory},
{@link getCode},
{@link getSubject},
{@link getFocus},
{@link getEncounter},
{@link getEffectivePeriod},
{@link getEffectiveTiming},
{@link getPerformer},
{@link getValueQuantity},
{@link getValueCodeableConcept},
{@link getValueRange},
{@link getValueRatio},
{@link getValueSampledData},
{@link getValuePeriod},
{@link getDataAbsentReason},
{@link getInterpretation},
{@link getNote},
{@link getBodySite},
{@link getMethod},
{@link getSpecimen},
{@link getDevice},
{@link getReferenceRange},
{@link getHasMember},
{@link getDerivedFrom},
{@link getComponent},
{@link setIdentifier},
{@link setBasedOn},
{@link setPartOf},
{@link setCategory},
{@link setCode},
{@link setSubject},
{@link setFocus},
{@link setEncounter},
{@link setEffectivePeriod},
{@link setEffectiveTiming},
{@link setPerformer},
{@link setValueQuantity},
{@link setValueCodeableConcept},
{@link setValueRange},
{@link setValueRatio},
{@link setValueSampledData},
{@link setValuePeriod},
{@link setDataAbsentReason},
{@link setInterpretation},
{@link setNote},
{@link setBodySite},
{@link setMethod},
{@link setSpecimen},
{@link setDevice},
{@link setReferenceRange},
{@link setHasMember},
{@link setDerivedFrom},
{@link setComponent},
 */

@Description("Measurements and simple assertions made about a patient, device or other subject.If the element is present, it must have either a @value, an @id, or extensions")

public interface Observation extends GenericEntity, fhir.FhirDomainResource {

	EntityType<Observation> T = EntityTypes.T(Observation.class);

	/* Constants for each property name. */
	java.lang.String identifier = "identifier";
	java.lang.String basedOn = "basedOn";
	java.lang.String partOf = "partOf";
	java.lang.String category = "category";
	java.lang.String code = "code";
	java.lang.String subject = "subject";
	java.lang.String focus = "focus";
	java.lang.String encounter = "encounter";
	java.lang.String effectivePeriod = "effectivePeriod";
	java.lang.String effectiveTiming = "effectiveTiming";
	java.lang.String performer = "performer";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueCodeableConcept = "valueCodeableConcept";
	java.lang.String valueRange = "valueRange";
	java.lang.String valueRatio = "valueRatio";
	java.lang.String valueSampledData = "valueSampledData";
	java.lang.String valuePeriod = "valuePeriod";
	java.lang.String dataAbsentReason = "dataAbsentReason";
	java.lang.String interpretation = "interpretation";
	java.lang.String note = "note";
	java.lang.String bodySite = "bodySite";
	java.lang.String method = "method";
	java.lang.String specimen = "specimen";
	java.lang.String device = "device";
	java.lang.String referenceRange = "referenceRange";
	java.lang.String hasMember = "hasMember";
	java.lang.String derivedFrom = "derivedFrom";
	java.lang.String component = "component";

	@Description("A unique identifier assigned to this observation.")
	
	java.util.List<fhir.Identifier> getIdentifier();
	void setIdentifier(java.util.List<fhir.Identifier> identifier);

	@Description("A plan, proposal or order that is fulfilled in whole or in part by this event.  For example, a MedicationRequest may require a patient to have laboratory test performed before  it is dispensed.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getBasedOn();
	void setBasedOn(java.util.List<com.braintribe.model.generic.GenericEntity> basedOn);

	@Description("A larger event of which this particular Observation is a component or step.  For example,  an observation as part of a procedure.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPartOf();
	void setPartOf(java.util.List<com.braintribe.model.generic.GenericEntity> partOf);

	@Description("A code that classifies the general type of observation being made.")
	
	java.util.List<fhir.CodeableConcept> getCategory();
	void setCategory(java.util.List<fhir.CodeableConcept> category);

	@Description("Describes what was observed. Sometimes this is called the observation 'name'.")
	@Mandatory
	fhir.CodeableConcept getCode();
	void setCode(fhir.CodeableConcept code);
	@Description("The patient, or group of patients, location, or device this observation is about and into whose record the observation is placed. If the actual focus of the observation is different from the subject (or a sample of, part, or region of the subject), the `focus` element or the `code` itself specifies the actual focus of the observation.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSubject();
	void setSubject(com.braintribe.model.generic.GenericEntity subject);
	@Description("The actual focus of an observation when it is not the patient of record representing something or someone associated with the patient such as a spouse, parent, fetus, or donor. For example, fetus observations in a mother's record.  The focus of an observation could also be an existing condition,  an intervention, the subject's diet,  another observation of the subject,  or a body structure such as tumor or implanted device.   An example use case would be using the Observation resource to capture whether the mother is trained to change her child's tracheostomy tube. In this example, the child is the patient of record and the mother is the focus.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getFocus();
	void setFocus(java.util.List<com.braintribe.model.generic.GenericEntity> focus);

	@Description("The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getEncounter();
	void setEncounter(com.braintribe.model.generic.GenericEntity encounter);
	@Description("")
	@Mandatory
	fhir.Period getEffectivePeriod();
	void setEffectivePeriod(fhir.Period effectivePeriod);
	@Description("")
	@Mandatory
	fhir.Timing getEffectiveTiming();
	void setEffectiveTiming(fhir.Timing effectiveTiming);
	@Description("Who was responsible for asserting the observed value as 'true'.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getPerformer();
	void setPerformer(java.util.List<com.braintribe.model.generic.GenericEntity> performer);

	@Description("")
	@Mandatory
	fhir.Quantity getValueQuantity();
	void setValueQuantity(fhir.Quantity valueQuantity);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getValueCodeableConcept();
	void setValueCodeableConcept(fhir.CodeableConcept valueCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Range getValueRange();
	void setValueRange(fhir.Range valueRange);
	@Description("")
	@Mandatory
	fhir.Ratio getValueRatio();
	void setValueRatio(fhir.Ratio valueRatio);
	@Description("")
	@Mandatory
	fhir.SampledData getValueSampledData();
	void setValueSampledData(fhir.SampledData valueSampledData);
	@Description("")
	@Mandatory
	fhir.Period getValuePeriod();
	void setValuePeriod(fhir.Period valuePeriod);
	@Description("Provides a reason why the expected value in the element Observation.value[x] is missing.")
	@Mandatory
	fhir.CodeableConcept getDataAbsentReason();
	void setDataAbsentReason(fhir.CodeableConcept dataAbsentReason);
	@Description("A categorical assessment of an observation value.  For example, high, low, normal.")
	
	java.util.List<fhir.CodeableConcept> getInterpretation();
	void setInterpretation(java.util.List<fhir.CodeableConcept> interpretation);

	@Description("Comments about the observation or the results.")
	
	java.util.List<fhir.Annotation> getNote();
	void setNote(java.util.List<fhir.Annotation> note);

	@Description("Indicates the site on the subject's body where the observation was made (i.e. the target site).")
	@Mandatory
	fhir.CodeableConcept getBodySite();
	void setBodySite(fhir.CodeableConcept bodySite);
	@Description("Indicates the mechanism used to perform the observation.")
	@Mandatory
	fhir.CodeableConcept getMethod();
	void setMethod(fhir.CodeableConcept method);
	@Description("The specimen that was used when this observation was made.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getSpecimen();
	void setSpecimen(com.braintribe.model.generic.GenericEntity specimen);
	@Description("The device used to generate the observation data.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDevice();
	void setDevice(com.braintribe.model.generic.GenericEntity device);
	@Description("Guidance on how to interpret the value by comparison to a normal or recommended range.  Multiple reference ranges are interpreted as an 'OR'.   In other words, to represent two distinct target populations, two `referenceRange` elements would be used.")
	
	java.util.List<fhir.ObservationReferenceRange> getReferenceRange();
	void setReferenceRange(java.util.List<fhir.ObservationReferenceRange> referenceRange);

	@Description("This observation is a group observation (e.g. a battery, a panel of tests, a set of vital sign measurements) that includes the target as a member of the group.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getHasMember();
	void setHasMember(java.util.List<com.braintribe.model.generic.GenericEntity> hasMember);

	@Description("The target resource that represents a measurement from which this observation value is derived. For example, a calculated anion gap or a fetal measurement based on an ultrasound image.")
	
	java.util.List<com.braintribe.model.generic.GenericEntity> getDerivedFrom();
	void setDerivedFrom(java.util.List<com.braintribe.model.generic.GenericEntity> derivedFrom);

	@Description("Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.")
	
	java.util.List<fhir.ObservationComponent> getComponent();
	void setComponent(java.util.List<fhir.ObservationComponent> component);

}
