/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TaskOutput of the Data Model fhir.
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
{@link type}, 
{@link valueAddress}, 
{@link valueAge}, 
{@link valueAnnotation}, 
{@link valueAttachment}, 
{@link valueCodeableConcept}, 
{@link valueCoding}, 
{@link valueContactPoint}, 
{@link valueCount}, 
{@link valueDistance}, 
{@link valueDuration}, 
{@link valueHumanName}, 
{@link valueIdentifier}, 
{@link valueMoney}, 
{@link valuePeriod}, 
{@link valueQuantity}, 
{@link valueRange}, 
{@link valueRatio}, 
{@link valueReference}, 
{@link valueSampledData}, 
{@link valueSignature}, 
{@link valueTiming}, 
{@link valueContactDetail}, 
{@link valueContributor}, 
{@link valueDataRequirement}, 
{@link valueExpression}, 
{@link valueParameterDefinition}, 
{@link valueRelatedArtifact}, 
{@link valueTriggerDefinition}, 
{@link valueUsageContext}, 
{@link valueDosage}, 

* It provides of then following operations (getters and setters)
{@link getType},
{@link getValueAddress},
{@link getValueAge},
{@link getValueAnnotation},
{@link getValueAttachment},
{@link getValueCodeableConcept},
{@link getValueCoding},
{@link getValueContactPoint},
{@link getValueCount},
{@link getValueDistance},
{@link getValueDuration},
{@link getValueHumanName},
{@link getValueIdentifier},
{@link getValueMoney},
{@link getValuePeriod},
{@link getValueQuantity},
{@link getValueRange},
{@link getValueRatio},
{@link getValueReference},
{@link getValueSampledData},
{@link getValueSignature},
{@link getValueTiming},
{@link getValueContactDetail},
{@link getValueContributor},
{@link getValueDataRequirement},
{@link getValueExpression},
{@link getValueParameterDefinition},
{@link getValueRelatedArtifact},
{@link getValueTriggerDefinition},
{@link getValueUsageContext},
{@link getValueDosage},
{@link setType},
{@link setValueAddress},
{@link setValueAge},
{@link setValueAnnotation},
{@link setValueAttachment},
{@link setValueCodeableConcept},
{@link setValueCoding},
{@link setValueContactPoint},
{@link setValueCount},
{@link setValueDistance},
{@link setValueDuration},
{@link setValueHumanName},
{@link setValueIdentifier},
{@link setValueMoney},
{@link setValuePeriod},
{@link setValueQuantity},
{@link setValueRange},
{@link setValueRatio},
{@link setValueReference},
{@link setValueSampledData},
{@link setValueSignature},
{@link setValueTiming},
{@link setValueContactDetail},
{@link setValueContributor},
{@link setValueDataRequirement},
{@link setValueExpression},
{@link setValueParameterDefinition},
{@link setValueRelatedArtifact},
{@link setValueTriggerDefinition},
{@link setValueUsageContext},
{@link setValueDosage},
 */

@Description("A task to be performed.")

public interface TaskOutput extends GenericEntity, fhir.BackboneElement {

	EntityType<TaskOutput> T = EntityTypes.T(TaskOutput.class);

	/* Constants for each property name. */
	java.lang.String type = "type";
	java.lang.String valueAddress = "valueAddress";
	java.lang.String valueAge = "valueAge";
	java.lang.String valueAnnotation = "valueAnnotation";
	java.lang.String valueAttachment = "valueAttachment";
	java.lang.String valueCodeableConcept = "valueCodeableConcept";
	java.lang.String valueCoding = "valueCoding";
	java.lang.String valueContactPoint = "valueContactPoint";
	java.lang.String valueCount = "valueCount";
	java.lang.String valueDistance = "valueDistance";
	java.lang.String valueDuration = "valueDuration";
	java.lang.String valueHumanName = "valueHumanName";
	java.lang.String valueIdentifier = "valueIdentifier";
	java.lang.String valueMoney = "valueMoney";
	java.lang.String valuePeriod = "valuePeriod";
	java.lang.String valueQuantity = "valueQuantity";
	java.lang.String valueRange = "valueRange";
	java.lang.String valueRatio = "valueRatio";
	java.lang.String valueReference = "valueReference";
	java.lang.String valueSampledData = "valueSampledData";
	java.lang.String valueSignature = "valueSignature";
	java.lang.String valueTiming = "valueTiming";
	java.lang.String valueContactDetail = "valueContactDetail";
	java.lang.String valueContributor = "valueContributor";
	java.lang.String valueDataRequirement = "valueDataRequirement";
	java.lang.String valueExpression = "valueExpression";
	java.lang.String valueParameterDefinition = "valueParameterDefinition";
	java.lang.String valueRelatedArtifact = "valueRelatedArtifact";
	java.lang.String valueTriggerDefinition = "valueTriggerDefinition";
	java.lang.String valueUsageContext = "valueUsageContext";
	java.lang.String valueDosage = "valueDosage";

	@Description("The name of the Output parameter.")
	@Mandatory
	fhir.CodeableConcept getType();
	void setType(fhir.CodeableConcept type);
	@Description("")
	@Mandatory
	fhir.Address getValueAddress();
	void setValueAddress(fhir.Address valueAddress);
	@Description("")
	@Mandatory
	fhir.Age getValueAge();
	void setValueAge(fhir.Age valueAge);
	@Description("")
	@Mandatory
	fhir.Annotation getValueAnnotation();
	void setValueAnnotation(fhir.Annotation valueAnnotation);
	@Description("")
	@Mandatory
	fhir.Attachment getValueAttachment();
	void setValueAttachment(fhir.Attachment valueAttachment);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getValueCodeableConcept();
	void setValueCodeableConcept(fhir.CodeableConcept valueCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Coding getValueCoding();
	void setValueCoding(fhir.Coding valueCoding);
	@Description("")
	@Mandatory
	fhir.ContactPoint getValueContactPoint();
	void setValueContactPoint(fhir.ContactPoint valueContactPoint);
	@Description("")
	@Mandatory
	fhir.Count getValueCount();
	void setValueCount(fhir.Count valueCount);
	@Description("")
	@Mandatory
	fhir.Distance getValueDistance();
	void setValueDistance(fhir.Distance valueDistance);
	@Description("")
	@Mandatory
	fhir.Duration getValueDuration();
	void setValueDuration(fhir.Duration valueDuration);
	@Description("")
	@Mandatory
	fhir.HumanName getValueHumanName();
	void setValueHumanName(fhir.HumanName valueHumanName);
	@Description("")
	@Mandatory
	fhir.Identifier getValueIdentifier();
	void setValueIdentifier(fhir.Identifier valueIdentifier);
	@Description("")
	@Mandatory
	fhir.Money getValueMoney();
	void setValueMoney(fhir.Money valueMoney);
	@Description("")
	@Mandatory
	fhir.Period getValuePeriod();
	void setValuePeriod(fhir.Period valuePeriod);
	@Description("")
	@Mandatory
	fhir.Quantity getValueQuantity();
	void setValueQuantity(fhir.Quantity valueQuantity);
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
	com.braintribe.model.generic.GenericEntity getValueReference();
	void setValueReference(com.braintribe.model.generic.GenericEntity valueReference);
	@Description("")
	@Mandatory
	fhir.SampledData getValueSampledData();
	void setValueSampledData(fhir.SampledData valueSampledData);
	@Description("")
	@Mandatory
	fhir.Signature getValueSignature();
	void setValueSignature(fhir.Signature valueSignature);
	@Description("")
	@Mandatory
	fhir.Timing getValueTiming();
	void setValueTiming(fhir.Timing valueTiming);
	@Description("")
	@Mandatory
	fhir.ContactDetail getValueContactDetail();
	void setValueContactDetail(fhir.ContactDetail valueContactDetail);
	@Description("")
	@Mandatory
	fhir.Contributor getValueContributor();
	void setValueContributor(fhir.Contributor valueContributor);
	@Description("")
	@Mandatory
	fhir.DataRequirement getValueDataRequirement();
	void setValueDataRequirement(fhir.DataRequirement valueDataRequirement);
	@Description("")
	@Mandatory
	fhir.Expression getValueExpression();
	void setValueExpression(fhir.Expression valueExpression);
	@Description("")
	@Mandatory
	fhir.ParameterDefinition getValueParameterDefinition();
	void setValueParameterDefinition(fhir.ParameterDefinition valueParameterDefinition);
	@Description("")
	@Mandatory
	fhir.RelatedArtifact getValueRelatedArtifact();
	void setValueRelatedArtifact(fhir.RelatedArtifact valueRelatedArtifact);
	@Description("")
	@Mandatory
	fhir.TriggerDefinition getValueTriggerDefinition();
	void setValueTriggerDefinition(fhir.TriggerDefinition valueTriggerDefinition);
	@Description("")
	@Mandatory
	fhir.UsageContext getValueUsageContext();
	void setValueUsageContext(fhir.UsageContext valueUsageContext);
	@Description("")
	@Mandatory
	fhir.Dosage getValueDosage();
	void setValueDosage(fhir.Dosage valueDosage);
}
