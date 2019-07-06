/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ElementDefinition of the Data Model fhir.
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
{@link slicing}, 
{@link base}, 
{@link type}, 
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
{@link fixedAddress}, 
{@link fixedAge}, 
{@link fixedAnnotation}, 
{@link fixedAttachment}, 
{@link fixedCodeableConcept}, 
{@link fixedCoding}, 
{@link fixedContactPoint}, 
{@link fixedCount}, 
{@link fixedDistance}, 
{@link fixedDuration}, 
{@link fixedHumanName}, 
{@link fixedIdentifier}, 
{@link fixedMoney}, 
{@link fixedPeriod}, 
{@link fixedQuantity}, 
{@link fixedRange}, 
{@link fixedRatio}, 
{@link fixedReference}, 
{@link fixedSampledData}, 
{@link fixedSignature}, 
{@link fixedTiming}, 
{@link fixedContactDetail}, 
{@link fixedContributor}, 
{@link fixedDataRequirement}, 
{@link fixedExpression}, 
{@link fixedParameterDefinition}, 
{@link fixedRelatedArtifact}, 
{@link fixedTriggerDefinition}, 
{@link fixedUsageContext}, 
{@link fixedDosage}, 
{@link patternAddress}, 
{@link patternAge}, 
{@link patternAnnotation}, 
{@link patternAttachment}, 
{@link patternCodeableConcept}, 
{@link patternCoding}, 
{@link patternContactPoint}, 
{@link patternCount}, 
{@link patternDistance}, 
{@link patternDuration}, 
{@link patternHumanName}, 
{@link patternIdentifier}, 
{@link patternMoney}, 
{@link patternPeriod}, 
{@link patternQuantity}, 
{@link patternRange}, 
{@link patternRatio}, 
{@link patternReference}, 
{@link patternSampledData}, 
{@link patternSignature}, 
{@link patternTiming}, 
{@link patternContactDetail}, 
{@link patternContributor}, 
{@link patternDataRequirement}, 
{@link patternExpression}, 
{@link patternParameterDefinition}, 
{@link patternRelatedArtifact}, 
{@link patternTriggerDefinition}, 
{@link patternUsageContext}, 
{@link patternDosage}, 
{@link example}, 
{@link minValueQuantity}, 
{@link maxValueQuantity}, 
{@link constraint}, 
{@link binding}, 
{@link mapping}, 

* It provides of then following operations (getters and setters)
{@link getCode},
{@link getSlicing},
{@link getBase},
{@link getType},
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
{@link getFixedAddress},
{@link getFixedAge},
{@link getFixedAnnotation},
{@link getFixedAttachment},
{@link getFixedCodeableConcept},
{@link getFixedCoding},
{@link getFixedContactPoint},
{@link getFixedCount},
{@link getFixedDistance},
{@link getFixedDuration},
{@link getFixedHumanName},
{@link getFixedIdentifier},
{@link getFixedMoney},
{@link getFixedPeriod},
{@link getFixedQuantity},
{@link getFixedRange},
{@link getFixedRatio},
{@link getFixedReference},
{@link getFixedSampledData},
{@link getFixedSignature},
{@link getFixedTiming},
{@link getFixedContactDetail},
{@link getFixedContributor},
{@link getFixedDataRequirement},
{@link getFixedExpression},
{@link getFixedParameterDefinition},
{@link getFixedRelatedArtifact},
{@link getFixedTriggerDefinition},
{@link getFixedUsageContext},
{@link getFixedDosage},
{@link getPatternAddress},
{@link getPatternAge},
{@link getPatternAnnotation},
{@link getPatternAttachment},
{@link getPatternCodeableConcept},
{@link getPatternCoding},
{@link getPatternContactPoint},
{@link getPatternCount},
{@link getPatternDistance},
{@link getPatternDuration},
{@link getPatternHumanName},
{@link getPatternIdentifier},
{@link getPatternMoney},
{@link getPatternPeriod},
{@link getPatternQuantity},
{@link getPatternRange},
{@link getPatternRatio},
{@link getPatternReference},
{@link getPatternSampledData},
{@link getPatternSignature},
{@link getPatternTiming},
{@link getPatternContactDetail},
{@link getPatternContributor},
{@link getPatternDataRequirement},
{@link getPatternExpression},
{@link getPatternParameterDefinition},
{@link getPatternRelatedArtifact},
{@link getPatternTriggerDefinition},
{@link getPatternUsageContext},
{@link getPatternDosage},
{@link getExample},
{@link getMinValueQuantity},
{@link getMaxValueQuantity},
{@link getConstraint},
{@link getBinding},
{@link getMapping},
{@link setCode},
{@link setSlicing},
{@link setBase},
{@link setType},
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
{@link setFixedAddress},
{@link setFixedAge},
{@link setFixedAnnotation},
{@link setFixedAttachment},
{@link setFixedCodeableConcept},
{@link setFixedCoding},
{@link setFixedContactPoint},
{@link setFixedCount},
{@link setFixedDistance},
{@link setFixedDuration},
{@link setFixedHumanName},
{@link setFixedIdentifier},
{@link setFixedMoney},
{@link setFixedPeriod},
{@link setFixedQuantity},
{@link setFixedRange},
{@link setFixedRatio},
{@link setFixedReference},
{@link setFixedSampledData},
{@link setFixedSignature},
{@link setFixedTiming},
{@link setFixedContactDetail},
{@link setFixedContributor},
{@link setFixedDataRequirement},
{@link setFixedExpression},
{@link setFixedParameterDefinition},
{@link setFixedRelatedArtifact},
{@link setFixedTriggerDefinition},
{@link setFixedUsageContext},
{@link setFixedDosage},
{@link setPatternAddress},
{@link setPatternAge},
{@link setPatternAnnotation},
{@link setPatternAttachment},
{@link setPatternCodeableConcept},
{@link setPatternCoding},
{@link setPatternContactPoint},
{@link setPatternCount},
{@link setPatternDistance},
{@link setPatternDuration},
{@link setPatternHumanName},
{@link setPatternIdentifier},
{@link setPatternMoney},
{@link setPatternPeriod},
{@link setPatternQuantity},
{@link setPatternRange},
{@link setPatternRatio},
{@link setPatternReference},
{@link setPatternSampledData},
{@link setPatternSignature},
{@link setPatternTiming},
{@link setPatternContactDetail},
{@link setPatternContributor},
{@link setPatternDataRequirement},
{@link setPatternExpression},
{@link setPatternParameterDefinition},
{@link setPatternRelatedArtifact},
{@link setPatternTriggerDefinition},
{@link setPatternUsageContext},
{@link setPatternDosage},
{@link setExample},
{@link setMinValueQuantity},
{@link setMaxValueQuantity},
{@link setConstraint},
{@link setBinding},
{@link setMapping},
 */

@Description("Captures constraints on each element within the resource, profile, or extension.If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions")

public interface ElementDefinition extends GenericEntity, fhir.BackboneElement {

	EntityType<ElementDefinition> T = EntityTypes.T(ElementDefinition.class);

	/* Constants for each property name. */
	java.lang.String code = "code";
	java.lang.String slicing = "slicing";
	java.lang.String base = "base";
	java.lang.String type = "type";
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
	java.lang.String fixedAddress = "fixedAddress";
	java.lang.String fixedAge = "fixedAge";
	java.lang.String fixedAnnotation = "fixedAnnotation";
	java.lang.String fixedAttachment = "fixedAttachment";
	java.lang.String fixedCodeableConcept = "fixedCodeableConcept";
	java.lang.String fixedCoding = "fixedCoding";
	java.lang.String fixedContactPoint = "fixedContactPoint";
	java.lang.String fixedCount = "fixedCount";
	java.lang.String fixedDistance = "fixedDistance";
	java.lang.String fixedDuration = "fixedDuration";
	java.lang.String fixedHumanName = "fixedHumanName";
	java.lang.String fixedIdentifier = "fixedIdentifier";
	java.lang.String fixedMoney = "fixedMoney";
	java.lang.String fixedPeriod = "fixedPeriod";
	java.lang.String fixedQuantity = "fixedQuantity";
	java.lang.String fixedRange = "fixedRange";
	java.lang.String fixedRatio = "fixedRatio";
	java.lang.String fixedReference = "fixedReference";
	java.lang.String fixedSampledData = "fixedSampledData";
	java.lang.String fixedSignature = "fixedSignature";
	java.lang.String fixedTiming = "fixedTiming";
	java.lang.String fixedContactDetail = "fixedContactDetail";
	java.lang.String fixedContributor = "fixedContributor";
	java.lang.String fixedDataRequirement = "fixedDataRequirement";
	java.lang.String fixedExpression = "fixedExpression";
	java.lang.String fixedParameterDefinition = "fixedParameterDefinition";
	java.lang.String fixedRelatedArtifact = "fixedRelatedArtifact";
	java.lang.String fixedTriggerDefinition = "fixedTriggerDefinition";
	java.lang.String fixedUsageContext = "fixedUsageContext";
	java.lang.String fixedDosage = "fixedDosage";
	java.lang.String patternAddress = "patternAddress";
	java.lang.String patternAge = "patternAge";
	java.lang.String patternAnnotation = "patternAnnotation";
	java.lang.String patternAttachment = "patternAttachment";
	java.lang.String patternCodeableConcept = "patternCodeableConcept";
	java.lang.String patternCoding = "patternCoding";
	java.lang.String patternContactPoint = "patternContactPoint";
	java.lang.String patternCount = "patternCount";
	java.lang.String patternDistance = "patternDistance";
	java.lang.String patternDuration = "patternDuration";
	java.lang.String patternHumanName = "patternHumanName";
	java.lang.String patternIdentifier = "patternIdentifier";
	java.lang.String patternMoney = "patternMoney";
	java.lang.String patternPeriod = "patternPeriod";
	java.lang.String patternQuantity = "patternQuantity";
	java.lang.String patternRange = "patternRange";
	java.lang.String patternRatio = "patternRatio";
	java.lang.String patternReference = "patternReference";
	java.lang.String patternSampledData = "patternSampledData";
	java.lang.String patternSignature = "patternSignature";
	java.lang.String patternTiming = "patternTiming";
	java.lang.String patternContactDetail = "patternContactDetail";
	java.lang.String patternContributor = "patternContributor";
	java.lang.String patternDataRequirement = "patternDataRequirement";
	java.lang.String patternExpression = "patternExpression";
	java.lang.String patternParameterDefinition = "patternParameterDefinition";
	java.lang.String patternRelatedArtifact = "patternRelatedArtifact";
	java.lang.String patternTriggerDefinition = "patternTriggerDefinition";
	java.lang.String patternUsageContext = "patternUsageContext";
	java.lang.String patternDosage = "patternDosage";
	java.lang.String example = "example";
	java.lang.String minValueQuantity = "minValueQuantity";
	java.lang.String maxValueQuantity = "maxValueQuantity";
	java.lang.String constraint = "constraint";
	java.lang.String binding = "binding";
	java.lang.String mapping = "mapping";

	@Description("A code that has the same meaning as the element in a particular terminology.")
	
	java.util.List<fhir.Coding> getCode();
	void setCode(java.util.List<fhir.Coding> code);

	@Description("Indicates that the element is sliced into a set of alternative definitions (i.e. in a structure definition, there are multiple different constraints on a single element in the base resource). Slicing can be used in any resource that has cardinality ..* on the base resource, or any resource with a choice of types. The set of slices is any elements that come after this in the element sequence that have the same path, until a shorter path occurs (the shorter path terminates the set).")
	@Mandatory
	fhir.ElementDefinitionSlicing getSlicing();
	void setSlicing(fhir.ElementDefinitionSlicing slicing);
	@Description("Information about the base definition of the element, provided to make it unnecessary for tools to trace the deviation of the element through the derived and related profiles. When the element definition is not the original definition of an element - i.g. either in a constraint on another type, or for elements from a super type in a snap shot - then the information in provided in the element definition may be different to the base definition. On the original definition of the element, it will be same.")
	@Mandatory
	fhir.ElementDefinitionBase getBase();
	void setBase(fhir.ElementDefinitionBase base);
	@Description("The data type or resource that the value of this element is permitted to be.")
	
	java.util.List<fhir.ElementDefinitionType> getType();
	void setType(java.util.List<fhir.ElementDefinitionType> type);

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
	@Description("")
	@Mandatory
	fhir.Address getFixedAddress();
	void setFixedAddress(fhir.Address fixedAddress);
	@Description("")
	@Mandatory
	fhir.Age getFixedAge();
	void setFixedAge(fhir.Age fixedAge);
	@Description("")
	@Mandatory
	fhir.Annotation getFixedAnnotation();
	void setFixedAnnotation(fhir.Annotation fixedAnnotation);
	@Description("")
	@Mandatory
	fhir.Attachment getFixedAttachment();
	void setFixedAttachment(fhir.Attachment fixedAttachment);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getFixedCodeableConcept();
	void setFixedCodeableConcept(fhir.CodeableConcept fixedCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Coding getFixedCoding();
	void setFixedCoding(fhir.Coding fixedCoding);
	@Description("")
	@Mandatory
	fhir.ContactPoint getFixedContactPoint();
	void setFixedContactPoint(fhir.ContactPoint fixedContactPoint);
	@Description("")
	@Mandatory
	fhir.Count getFixedCount();
	void setFixedCount(fhir.Count fixedCount);
	@Description("")
	@Mandatory
	fhir.Distance getFixedDistance();
	void setFixedDistance(fhir.Distance fixedDistance);
	@Description("")
	@Mandatory
	fhir.Duration getFixedDuration();
	void setFixedDuration(fhir.Duration fixedDuration);
	@Description("")
	@Mandatory
	fhir.HumanName getFixedHumanName();
	void setFixedHumanName(fhir.HumanName fixedHumanName);
	@Description("")
	@Mandatory
	fhir.Identifier getFixedIdentifier();
	void setFixedIdentifier(fhir.Identifier fixedIdentifier);
	@Description("")
	@Mandatory
	fhir.Money getFixedMoney();
	void setFixedMoney(fhir.Money fixedMoney);
	@Description("")
	@Mandatory
	fhir.Period getFixedPeriod();
	void setFixedPeriod(fhir.Period fixedPeriod);
	@Description("")
	@Mandatory
	fhir.Quantity getFixedQuantity();
	void setFixedQuantity(fhir.Quantity fixedQuantity);
	@Description("")
	@Mandatory
	fhir.Range getFixedRange();
	void setFixedRange(fhir.Range fixedRange);
	@Description("")
	@Mandatory
	fhir.Ratio getFixedRatio();
	void setFixedRatio(fhir.Ratio fixedRatio);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getFixedReference();
	void setFixedReference(com.braintribe.model.generic.GenericEntity fixedReference);
	@Description("")
	@Mandatory
	fhir.SampledData getFixedSampledData();
	void setFixedSampledData(fhir.SampledData fixedSampledData);
	@Description("")
	@Mandatory
	fhir.Signature getFixedSignature();
	void setFixedSignature(fhir.Signature fixedSignature);
	@Description("")
	@Mandatory
	fhir.Timing getFixedTiming();
	void setFixedTiming(fhir.Timing fixedTiming);
	@Description("")
	@Mandatory
	fhir.ContactDetail getFixedContactDetail();
	void setFixedContactDetail(fhir.ContactDetail fixedContactDetail);
	@Description("")
	@Mandatory
	fhir.Contributor getFixedContributor();
	void setFixedContributor(fhir.Contributor fixedContributor);
	@Description("")
	@Mandatory
	fhir.DataRequirement getFixedDataRequirement();
	void setFixedDataRequirement(fhir.DataRequirement fixedDataRequirement);
	@Description("")
	@Mandatory
	fhir.Expression getFixedExpression();
	void setFixedExpression(fhir.Expression fixedExpression);
	@Description("")
	@Mandatory
	fhir.ParameterDefinition getFixedParameterDefinition();
	void setFixedParameterDefinition(fhir.ParameterDefinition fixedParameterDefinition);
	@Description("")
	@Mandatory
	fhir.RelatedArtifact getFixedRelatedArtifact();
	void setFixedRelatedArtifact(fhir.RelatedArtifact fixedRelatedArtifact);
	@Description("")
	@Mandatory
	fhir.TriggerDefinition getFixedTriggerDefinition();
	void setFixedTriggerDefinition(fhir.TriggerDefinition fixedTriggerDefinition);
	@Description("")
	@Mandatory
	fhir.UsageContext getFixedUsageContext();
	void setFixedUsageContext(fhir.UsageContext fixedUsageContext);
	@Description("")
	@Mandatory
	fhir.Dosage getFixedDosage();
	void setFixedDosage(fhir.Dosage fixedDosage);
	@Description("")
	@Mandatory
	fhir.Address getPatternAddress();
	void setPatternAddress(fhir.Address patternAddress);
	@Description("")
	@Mandatory
	fhir.Age getPatternAge();
	void setPatternAge(fhir.Age patternAge);
	@Description("")
	@Mandatory
	fhir.Annotation getPatternAnnotation();
	void setPatternAnnotation(fhir.Annotation patternAnnotation);
	@Description("")
	@Mandatory
	fhir.Attachment getPatternAttachment();
	void setPatternAttachment(fhir.Attachment patternAttachment);
	@Description("")
	@Mandatory
	fhir.CodeableConcept getPatternCodeableConcept();
	void setPatternCodeableConcept(fhir.CodeableConcept patternCodeableConcept);
	@Description("")
	@Mandatory
	fhir.Coding getPatternCoding();
	void setPatternCoding(fhir.Coding patternCoding);
	@Description("")
	@Mandatory
	fhir.ContactPoint getPatternContactPoint();
	void setPatternContactPoint(fhir.ContactPoint patternContactPoint);
	@Description("")
	@Mandatory
	fhir.Count getPatternCount();
	void setPatternCount(fhir.Count patternCount);
	@Description("")
	@Mandatory
	fhir.Distance getPatternDistance();
	void setPatternDistance(fhir.Distance patternDistance);
	@Description("")
	@Mandatory
	fhir.Duration getPatternDuration();
	void setPatternDuration(fhir.Duration patternDuration);
	@Description("")
	@Mandatory
	fhir.HumanName getPatternHumanName();
	void setPatternHumanName(fhir.HumanName patternHumanName);
	@Description("")
	@Mandatory
	fhir.Identifier getPatternIdentifier();
	void setPatternIdentifier(fhir.Identifier patternIdentifier);
	@Description("")
	@Mandatory
	fhir.Money getPatternMoney();
	void setPatternMoney(fhir.Money patternMoney);
	@Description("")
	@Mandatory
	fhir.Period getPatternPeriod();
	void setPatternPeriod(fhir.Period patternPeriod);
	@Description("")
	@Mandatory
	fhir.Quantity getPatternQuantity();
	void setPatternQuantity(fhir.Quantity patternQuantity);
	@Description("")
	@Mandatory
	fhir.Range getPatternRange();
	void setPatternRange(fhir.Range patternRange);
	@Description("")
	@Mandatory
	fhir.Ratio getPatternRatio();
	void setPatternRatio(fhir.Ratio patternRatio);
	@Description("")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getPatternReference();
	void setPatternReference(com.braintribe.model.generic.GenericEntity patternReference);
	@Description("")
	@Mandatory
	fhir.SampledData getPatternSampledData();
	void setPatternSampledData(fhir.SampledData patternSampledData);
	@Description("")
	@Mandatory
	fhir.Signature getPatternSignature();
	void setPatternSignature(fhir.Signature patternSignature);
	@Description("")
	@Mandatory
	fhir.Timing getPatternTiming();
	void setPatternTiming(fhir.Timing patternTiming);
	@Description("")
	@Mandatory
	fhir.ContactDetail getPatternContactDetail();
	void setPatternContactDetail(fhir.ContactDetail patternContactDetail);
	@Description("")
	@Mandatory
	fhir.Contributor getPatternContributor();
	void setPatternContributor(fhir.Contributor patternContributor);
	@Description("")
	@Mandatory
	fhir.DataRequirement getPatternDataRequirement();
	void setPatternDataRequirement(fhir.DataRequirement patternDataRequirement);
	@Description("")
	@Mandatory
	fhir.Expression getPatternExpression();
	void setPatternExpression(fhir.Expression patternExpression);
	@Description("")
	@Mandatory
	fhir.ParameterDefinition getPatternParameterDefinition();
	void setPatternParameterDefinition(fhir.ParameterDefinition patternParameterDefinition);
	@Description("")
	@Mandatory
	fhir.RelatedArtifact getPatternRelatedArtifact();
	void setPatternRelatedArtifact(fhir.RelatedArtifact patternRelatedArtifact);
	@Description("")
	@Mandatory
	fhir.TriggerDefinition getPatternTriggerDefinition();
	void setPatternTriggerDefinition(fhir.TriggerDefinition patternTriggerDefinition);
	@Description("")
	@Mandatory
	fhir.UsageContext getPatternUsageContext();
	void setPatternUsageContext(fhir.UsageContext patternUsageContext);
	@Description("")
	@Mandatory
	fhir.Dosage getPatternDosage();
	void setPatternDosage(fhir.Dosage patternDosage);
	@Description("A sample value for this element demonstrating the type of information that would typically be found in the element.")
	
	java.util.List<fhir.ElementDefinitionExample> getExample();
	void setExample(java.util.List<fhir.ElementDefinitionExample> example);

	@Description("")
	@Mandatory
	fhir.Quantity getMinValueQuantity();
	void setMinValueQuantity(fhir.Quantity minValueQuantity);
	@Description("")
	@Mandatory
	fhir.Quantity getMaxValueQuantity();
	void setMaxValueQuantity(fhir.Quantity maxValueQuantity);
	@Description("Formal constraints such as co-occurrence and other constraints that can be computationally evaluated within the context of the instance.")
	
	java.util.List<fhir.ElementDefinitionConstraint> getConstraint();
	void setConstraint(java.util.List<fhir.ElementDefinitionConstraint> constraint);

	@Description("Binds to a value set if this element is coded (code, Coding, CodeableConcept, Quantity), or the data types (string, uri).")
	@Mandatory
	fhir.ElementDefinitionBinding getBinding();
	void setBinding(fhir.ElementDefinitionBinding binding);
	@Description("Identifies a concept from an external specification that roughly corresponds to this element.")
	
	java.util.List<fhir.ElementDefinitionMapping> getMapping();
	void setMapping(java.util.List<fhir.ElementDefinitionMapping> mapping);

}
