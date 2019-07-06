/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type StructureMapSource of the Data Model fhir.
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
{@link defaultValueAddress}, 
{@link defaultValueAge}, 
{@link defaultValueAnnotation}, 
{@link defaultValueAttachment}, 
{@link defaultValueCodeableConcept}, 
{@link defaultValueCoding}, 
{@link defaultValueContactPoint}, 
{@link defaultValueCount}, 
{@link defaultValueDistance}, 
{@link defaultValueDuration}, 
{@link defaultValueHumanName}, 
{@link defaultValueIdentifier}, 
{@link defaultValueMoney}, 
{@link defaultValuePeriod}, 
{@link defaultValueQuantity}, 
{@link defaultValueRange}, 
{@link defaultValueRatio}, 
{@link defaultValueReference}, 
{@link defaultValueSampledData}, 
{@link defaultValueSignature}, 
{@link defaultValueTiming}, 
{@link defaultValueContactDetail}, 
{@link defaultValueContributor}, 
{@link defaultValueDataRequirement}, 
{@link defaultValueExpression}, 
{@link defaultValueParameterDefinition}, 
{@link defaultValueRelatedArtifact}, 
{@link defaultValueTriggerDefinition}, 
{@link defaultValueUsageContext}, 
{@link defaultValueDosage}, 

* It provides of then following operations (getters and setters)
{@link getDefaultValueAddress},
{@link getDefaultValueAge},
{@link getDefaultValueAnnotation},
{@link getDefaultValueAttachment},
{@link getDefaultValueCodeableConcept},
{@link getDefaultValueCoding},
{@link getDefaultValueContactPoint},
{@link getDefaultValueCount},
{@link getDefaultValueDistance},
{@link getDefaultValueDuration},
{@link getDefaultValueHumanName},
{@link getDefaultValueIdentifier},
{@link getDefaultValueMoney},
{@link getDefaultValuePeriod},
{@link getDefaultValueQuantity},
{@link getDefaultValueRange},
{@link getDefaultValueRatio},
{@link getDefaultValueReference},
{@link getDefaultValueSampledData},
{@link getDefaultValueSignature},
{@link getDefaultValueTiming},
{@link getDefaultValueContactDetail},
{@link getDefaultValueContributor},
{@link getDefaultValueDataRequirement},
{@link getDefaultValueExpression},
{@link getDefaultValueParameterDefinition},
{@link getDefaultValueRelatedArtifact},
{@link getDefaultValueTriggerDefinition},
{@link getDefaultValueUsageContext},
{@link getDefaultValueDosage},
{@link setDefaultValueAddress},
{@link setDefaultValueAge},
{@link setDefaultValueAnnotation},
{@link setDefaultValueAttachment},
{@link setDefaultValueCodeableConcept},
{@link setDefaultValueCoding},
{@link setDefaultValueContactPoint},
{@link setDefaultValueCount},
{@link setDefaultValueDistance},
{@link setDefaultValueDuration},
{@link setDefaultValueHumanName},
{@link setDefaultValueIdentifier},
{@link setDefaultValueMoney},
{@link setDefaultValuePeriod},
{@link setDefaultValueQuantity},
{@link setDefaultValueRange},
{@link setDefaultValueRatio},
{@link setDefaultValueReference},
{@link setDefaultValueSampledData},
{@link setDefaultValueSignature},
{@link setDefaultValueTiming},
{@link setDefaultValueContactDetail},
{@link setDefaultValueContributor},
{@link setDefaultValueDataRequirement},
{@link setDefaultValueExpression},
{@link setDefaultValueParameterDefinition},
{@link setDefaultValueRelatedArtifact},
{@link setDefaultValueTriggerDefinition},
{@link setDefaultValueUsageContext},
{@link setDefaultValueDosage},
 */

@Description("A Map of relationships between 2 structures that can be used to transform data.")

public interface StructureMapSource extends GenericEntity, fhir.BackboneElement {

	EntityType<StructureMapSource> T = EntityTypes.T(StructureMapSource.class);

	/* Constants for each property name. */
	java.lang.String defaultValueAddress = "defaultValueAddress";
	java.lang.String defaultValueAge = "defaultValueAge";
	java.lang.String defaultValueAnnotation = "defaultValueAnnotation";
	java.lang.String defaultValueAttachment = "defaultValueAttachment";
	java.lang.String defaultValueCodeableConcept = "defaultValueCodeableConcept";
	java.lang.String defaultValueCoding = "defaultValueCoding";
	java.lang.String defaultValueContactPoint = "defaultValueContactPoint";
	java.lang.String defaultValueCount = "defaultValueCount";
	java.lang.String defaultValueDistance = "defaultValueDistance";
	java.lang.String defaultValueDuration = "defaultValueDuration";
	java.lang.String defaultValueHumanName = "defaultValueHumanName";
	java.lang.String defaultValueIdentifier = "defaultValueIdentifier";
	java.lang.String defaultValueMoney = "defaultValueMoney";
	java.lang.String defaultValuePeriod = "defaultValuePeriod";
	java.lang.String defaultValueQuantity = "defaultValueQuantity";
	java.lang.String defaultValueRange = "defaultValueRange";
	java.lang.String defaultValueRatio = "defaultValueRatio";
	java.lang.String defaultValueReference = "defaultValueReference";
	java.lang.String defaultValueSampledData = "defaultValueSampledData";
	java.lang.String defaultValueSignature = "defaultValueSignature";
	java.lang.String defaultValueTiming = "defaultValueTiming";
	java.lang.String defaultValueContactDetail = "defaultValueContactDetail";
	java.lang.String defaultValueContributor = "defaultValueContributor";
	java.lang.String defaultValueDataRequirement = "defaultValueDataRequirement";
	java.lang.String defaultValueExpression = "defaultValueExpression";
	java.lang.String defaultValueParameterDefinition = "defaultValueParameterDefinition";
	java.lang.String defaultValueRelatedArtifact = "defaultValueRelatedArtifact";
	java.lang.String defaultValueTriggerDefinition = "defaultValueTriggerDefinition";
	java.lang.String defaultValueUsageContext = "defaultValueUsageContext";
	java.lang.String defaultValueDosage = "defaultValueDosage";

	@Description("")
	@Mandatory
	fhir.Address getDefaultValueAddress();
	void setDefaultValueAddress(fhir.Address defaultValueAddress);
	@Description("")
	@Mandatory
	fhir.Age getDefaultValueAge();
	void setDefaultValueAge(fhir.Age defaultValueAge);
	@Description("")
	@Mandatory
	fhir.Annotation getDefaultValueAnnotation();
	void setDefaultValueAnnotation(fhir.Annotation defaultValueAnnotation);
	@Description("")
	@Mandatory
	fhir.Attachment getDefaultValueAttachment();
	void setDefaultValueAttachment(fhir.Attachment defaultValueAttachment);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getDefaultValueCodeableConcept();
	void setDefaultValueCodeableConcept(fhir.CodeableConcept defaultValueCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Coding getDefaultValueCoding();
	void setDefaultValueCoding(fhir.Coding defaultValueCoding);
	@Description("")
	@Mandatory
	fhir.ContactPoint getDefaultValueContactPoint();
	void setDefaultValueContactPoint(fhir.ContactPoint defaultValueContactPoint);
	@Description("")
	@Mandatory
	fhir.Count getDefaultValueCount();
	void setDefaultValueCount(fhir.Count defaultValueCount);
	@Description("")
	@Mandatory
	fhir.Distance getDefaultValueDistance();
	void setDefaultValueDistance(fhir.Distance defaultValueDistance);
	@Description("")
	@Mandatory
	fhir.Duration getDefaultValueDuration();
	void setDefaultValueDuration(fhir.Duration defaultValueDuration);
	@Description("")
	@Mandatory
	fhir.HumanName getDefaultValueHumanName();
	void setDefaultValueHumanName(fhir.HumanName defaultValueHumanName);
	@Description("")
	@Mandatory
	fhir.Identifier getDefaultValueIdentifier();
	void setDefaultValueIdentifier(fhir.Identifier defaultValueIdentifier);
	@Description("")
	@Mandatory
	fhir.Money getDefaultValueMoney();
	void setDefaultValueMoney(fhir.Money defaultValueMoney);
	@Description("")
	@Mandatory
	fhir.Period getDefaultValuePeriod();
	void setDefaultValuePeriod(fhir.Period defaultValuePeriod);
	@Description("")
	@Mandatory
	fhir.Quantity getDefaultValueQuantity();
	void setDefaultValueQuantity(fhir.Quantity defaultValueQuantity);
	@Description("")
	@Mandatory
	fhir.Range getDefaultValueRange();
	void setDefaultValueRange(fhir.Range defaultValueRange);
	@Description("")
	@Mandatory
	fhir.Ratio getDefaultValueRatio();
	void setDefaultValueRatio(fhir.Ratio defaultValueRatio);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getDefaultValueReference();
	void setDefaultValueReference(com.braintribe.model.generic.GenericEntity defaultValueReference);
	@Description("")
	@Mandatory
	fhir.SampledData getDefaultValueSampledData();
	void setDefaultValueSampledData(fhir.SampledData defaultValueSampledData);
	@Description("")
	@Mandatory
	fhir.Signature getDefaultValueSignature();
	void setDefaultValueSignature(fhir.Signature defaultValueSignature);
	@Description("")
	@Mandatory
	fhir.Timing getDefaultValueTiming();
	void setDefaultValueTiming(fhir.Timing defaultValueTiming);
	@Description("")
	@Mandatory
	fhir.ContactDetail getDefaultValueContactDetail();
	void setDefaultValueContactDetail(fhir.ContactDetail defaultValueContactDetail);
	@Description("")
	@Mandatory
	fhir.Contributor getDefaultValueContributor();
	void setDefaultValueContributor(fhir.Contributor defaultValueContributor);
	@Description("")
	@Mandatory
	fhir.DataRequirement getDefaultValueDataRequirement();
	void setDefaultValueDataRequirement(fhir.DataRequirement defaultValueDataRequirement);
	@Description("")
	@Mandatory
	fhir.Expression getDefaultValueExpression();
	void setDefaultValueExpression(fhir.Expression defaultValueExpression);
	@Description("")
	@Mandatory
	fhir.ParameterDefinition getDefaultValueParameterDefinition();
	void setDefaultValueParameterDefinition(fhir.ParameterDefinition defaultValueParameterDefinition);
	@Description("")
	@Mandatory
	fhir.RelatedArtifact getDefaultValueRelatedArtifact();
	void setDefaultValueRelatedArtifact(fhir.RelatedArtifact defaultValueRelatedArtifact);
	@Description("")
	@Mandatory
	fhir.TriggerDefinition getDefaultValueTriggerDefinition();
	void setDefaultValueTriggerDefinition(fhir.TriggerDefinition defaultValueTriggerDefinition);
	@Description("")
	@Mandatory
	fhir.UsageContext getDefaultValueUsageContext();
	void setDefaultValueUsageContext(fhir.UsageContext defaultValueUsageContext);
	@Description("")
	@Mandatory
	fhir.Dosage getDefaultValueDosage();
	void setDefaultValueDosage(fhir.Dosage defaultValueDosage);
}
